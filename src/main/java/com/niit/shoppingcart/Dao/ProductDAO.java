package com.niit.shoppingcart.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Product;



@Repository
public interface ProductDAO {
	
	public boolean saveOrUpdate(Product product);
	public boolean delete(Product product);
	public Product get(int id);
	public List<Product> list();
	/*public List<Product> getbycategory(int id);*/

	
	

}
