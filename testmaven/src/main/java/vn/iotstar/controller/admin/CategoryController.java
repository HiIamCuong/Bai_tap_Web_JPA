package vn.iotstar.controller.admin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import vn.iotstar.models.Category;
import vn.iotstar.service.CategoryService;
import vn.iotstar.service.CategoryServiceImpl;
import vn.iotstar.ultis.*;

@MultipartConfig(fileSizeThreshold = 1024 * 1024,
maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
@WebServlet(urlPatterns = {"/admin/categories","/admin/category/add","/admin/category/insert","/admin/category/edit","/admin/category/update","/admin/category/delete","/admin/category/search"})
public class CategoryController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	public CategoryService cateService=new CategoryServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url=req.getRequestURI();
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		if(url.contains("categories"))
		{
			List<Category>list=cateService.findall();
			req.setAttribute("listcate", list);
			req.getRequestDispatcher("/views/admin/category-list.jsp").forward(req, resp);
		}
		else if(url.contains("add"))
		{
			req.getRequestDispatcher("/views/admin/category-add.jsp").forward(req, resp);
		}
		else if(url.contains("edit"))
		{
			int id=Integer.parseInt(req.getParameter("id"));
			Category category=cateService.findbyid(id);
			
			req.setAttribute("cate", category);
			
			req.getRequestDispatcher("/views/admin/category-edit.jsp").forward(req, resp);
		}
		else if(url.contains("delete"))
		{
			int id=Integer.parseInt(req.getParameter("id"));
			cateService.delete(id);
			resp.sendRedirect(req.getContextPath()+"/admin/categories");
		}
		else if(url.contains("search"))
		{
			String categoryname=req.getParameter("categoryname");
			List<Category>list=cateService.findname(categoryname);
			req.setAttribute("listcate", list);
			req.getRequestDispatcher("/views/admin/category-list.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url=req.getRequestURI();
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		if(url.contains("insert"))
		{
			String categoryname=req.getParameter("categoryname");
			String status=req.getParameter("status");
			int statuss=Integer.parseInt(status);
			//String images="https://cdn11.dienmaycholon.vn/filewebdmclnew/DMCL21/Picture/Apro/Apro_product_34767/oppo-reno12-5g-_main_365_1020.png.webp";
			Category category=new Category();
			category.setCategoryname(categoryname);
			category.setStatus(statuss);
			String fname="";
			String uploadpath=Constant.DIR;
			File uploadDir=new File(uploadpath);
			if(!uploadDir.exists())
			{
				uploadDir.mkdir();
			}
			try 
			{
				Part part=req.getPart("images");
				if(part.getSize()>0)
				{
					String filename=Paths.get(part.getSubmittedFileName()).getFileName().toString();
					int index=filename.lastIndexOf(".");
					String ext=filename.substring(index+1);
					fname=System.currentTimeMillis()+"."+ext;
					part.write(uploadpath+"/"+fname);
					category.setImages(fname);
				}
				else
				{
					category.setImages("avata.png");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			//category.setImages(images);
			cateService.insert(category);
			resp.sendRedirect(req.getContextPath()+"/admin/categories");
		}
		else if(url.contains("update")){
			int categoryid=Integer.parseInt(req.getParameter("categoryid"));
			String categoryname=req.getParameter("categoryname");
			String status=req.getParameter("status");
			int statuss=Integer.parseInt(status);
			//String images="https://cdn11.dienmaycholon.vn/filewebdmclnew/DMCL21/Picture/Apro/Apro_product_34767/oppo-reno12-5g-_main_365_1020.png.webp";
			Category category=new Category();
			category.setCategoryid(categoryid);
			category.setCategoryname(categoryname);
			category.setStatus(statuss);
			Category cateold=cateService.findbyid(categoryid);
			String fileold=cateold.getImages();
			String fname="";
			String uploadpath=Constant.DIR;
			File uploadDir=new File(uploadpath);
			if(!uploadDir.exists())
			{
				uploadDir.mkdir();
			}
			try 
			{
				Part part=req.getPart("images");
				if(part.getSize()>0)
				{
					String filename=Paths.get(part.getSubmittedFileName()).getFileName().toString();
					int index=filename.lastIndexOf(".");
					String ext=filename.substring(index+1);
					fname=System.currentTimeMillis()+"."+ext;
					part.write(uploadpath+"/"+fname);
					category.setImages(fname);
				}
				else
				{
					category.setImages(fileold);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			//category.setImages(images);
			cateService.update(category);
			resp.sendRedirect(req.getContextPath()+"/admin/categories");
		}
	}
}
