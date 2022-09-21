package com.exam.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.products.ProductCategory;
import com.exam.repo.ProductCategoryRepository;
import com.exam.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Override
	public ProductCategory addProductCategory(ProductCategory productCategory) {
		
		return this.productCategoryRepository.save(productCategory);
	}

	@Override
	public ProductCategory updateProductCategory(ProductCategory productCategory) {
		
		return this.productCategoryRepository.save(productCategory);
	}

	@Override
	public Set<ProductCategory> getProductCategories() {
		
		return new LinkedHashSet<>(this.productCategoryRepository.findAll());
	}

	@Override
	public ProductCategory getProductCategory(Long productCategoryId) {
		
		return this.productCategoryRepository.findById(productCategoryId).get();
	}

	@Override
	public void deleteProductCategory(Long productCategoryId) {
		
		ProductCategory productCategory = new ProductCategory();
		productCategory.setId(productCategoryId);
		
		this.productCategoryRepository.delete(productCategory);
		
	}

}
