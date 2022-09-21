package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.products.Product;
import com.exam.model.products.ProductCategory;
import com.exam.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	// add product
	@PostMapping("/")
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		return ResponseEntity.ok(this.productService.addProduct(product));
	}
	
	// update product
	
	@PutMapping("/")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product)
	{
		return ResponseEntity.ok(this.productService.updateProduct(product));
	}
	
	// get product
	
	@GetMapping("/")
	public ResponseEntity<?> getProduct()
	{
		return ResponseEntity.ok(this.productService.getProduct());
	}
	
	// get single product
	
	@GetMapping("/{pid}")
	public Product product(@PathVariable("pid") Long pid)
	{
		return this.productService.getProduct(pid);
	}
	
	// delete product
	
	@DeleteMapping("/{productId}")
	public void delete(@PathVariable("productId") Long productId)
	{
		this.productService.deleteProduct(productId);
	}
	
	
	
	
	
	
	@GetMapping("/category/{id}")
	public List<Product> getProductsOfCategory(@PathVariable("id") Long id)
	{
		ProductCategory category = new ProductCategory();
		category.setId(id);
		
		return this.productService.getProductsOfCategory(category);
	}
	
	// get active products
	
	@GetMapping("/active")
	public List<Product> getActiveProducts()
	{
		return this.productService.getActiveProducts();
	}
	
	// get active products of category
	
	@GetMapping("/category/active/id")
	public List<Product> getActiveProducts(@PathVariable("id") Long id)
	{
		ProductCategory category = new ProductCategory();
		category.setId(id);
		
		return this.productService.getActiveProductsOfCategory(category);
	}
	
	
	
	
	
	
	
	
	
	
	

}
