package vn.iotstar.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.iotstar.models.User;

import java.io.IOException;

/**
 * Servlet implementation class WaitingController
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/waiting")
public class WaitingController extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WaitingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session= req.getSession();
		if(session != null && session.getAttribute("account") != null) 
		{
			User u=(User) session.getAttribute("account");
			req.setAttribute("username", u.getUsername());
			if(u.getRoleid()==1) 
			{
				resp.sendRedirect(req.getContextPath()+"/user/home");
			}
			else if(u.getRoleid()==2) 
			{
				resp.sendRedirect(req.getContextPath()+"/admin/home");
			}
			else 
			{
				resp.sendRedirect(req.getContextPath()+"/Home2.jsp");
			}
		}
		else 
		{
			resp.sendRedirect(req.getContextPath()+"/Home2.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
