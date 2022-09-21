package com.exam.service;

import java.util.Set;

import com.exam.model.products.ProductCategory;

public interface ProductCategoryService {
	
	public ProductCategory addProductCategory(ProductCategory productCategory);
	
	public ProductCategory updateProductCategory(ProductCategory productCategory);
	
	public Set<ProductCategory> getProductCategories();
	
	public ProductCategory getProductCategory(Long productCategoryId);
	
	public void deleteProductCategory(Long productCategoryId);
	

}
