package com.exam.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.products.Product;
import com.exam.model.products.ProductCategory;
import com.exam.repo.ProductRepository;
import com.exam.service.ProductService;


@Service
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		
		return this.productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		return this.productRepository.save(product);
	}

	@Override
	public Set<Product> getProduct() {
		
		return new HashSet<>(this.productRepository.findAll());
	}

	@Override
	public Product getProduct(Long productId) {
		
		return this.productRepository.findById(productId).get();
	}

	@Override
	public void deleteProduct(Long productId) {
		
		
		this.productRepository.deleteById(productId);
		
	}

	@Override
	public List<Product> getProductsOfCategory(ProductCategory category) {
		
		return this.productRepository.findBycategory(category);
	}

	@Override
	public List<Product> getActiveProducts() {
		
		return this.productRepository.findByActive(true);
	}

	@Override
	public List<Product> getActiveProductsOfCategory(ProductCategory c) {
		
		return this.productRepository.findByCategoryAndActive(c, true);
	}

}
