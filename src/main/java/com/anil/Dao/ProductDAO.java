package com.anil.Dao;

import java.util.List;
import com.anil.model.*;

public interface ProductDAO {
	
	public List<Product> getAllProducts();
	public Product getProductById();
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);

}