package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.products.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	

}
