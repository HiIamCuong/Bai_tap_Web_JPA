package vn.iotstar.dao;

import vn.iotstar.entity.Category;

import java.util.List;

public interface CategoryDao {

	int count();

	List<Category> findAll(int page, int pagesize);

	List<Category> searchByName(String catname);

	List<Category> findAll();

	Category findByCategoryname(String name) throws Exception;

	Category findById(int cateid);

	void delete(int cateid) throws Exception;

	void update(Category cate);

	void insert(Category cate);

}
