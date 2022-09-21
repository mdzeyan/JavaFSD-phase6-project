package com.exam.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.products.Product;
import com.exam.model.products.ProductCategory;

public interface ProductRepository extends JpaRepository<Product, Long> {

	public List<Product> findBycategory(ProductCategory category);
	
	public List<Product> findByActive(Boolean b);
	
	public List<Product> findByCategoryAndActive(ProductCategory c, Boolean b);

}
