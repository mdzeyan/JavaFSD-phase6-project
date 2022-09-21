package com.exam.service;

import java.util.List;
import java.util.Set;

import com.exam.model.products.Product;
import com.exam.model.products.ProductCategory;

public interface ProductService {
	
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Set<Product> getProduct();
	
	public Product getProduct(Long productId);
	
	public void deleteProduct(Long productId);

	public List<Product> getProductsOfCategory(ProductCategory category);
	
	public List<Product> getActiveProducts();
	
	public List<Product> getActiveProductsOfCategory(ProductCategory c);

}
