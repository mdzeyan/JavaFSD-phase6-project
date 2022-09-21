package com.exam.controller;



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

import com.exam.model.products.ProductCategory;
import com.exam.service.ProductCategoryService;





@RestController
@RequestMapping("/productCategory")
@CrossOrigin("*")
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	//add Product Category
	@PostMapping("/")
	public ResponseEntity<?> addProductCategory(@RequestBody ProductCategory productCategory)
	{
		ProductCategory productCategory1 = this.productCategoryService.addProductCategory(productCategory);
		
		return ResponseEntity.ok(productCategory1);
		
	}
	
	
	// get Product category
	
	@GetMapping("/{ProductCategoryId}")
	public ProductCategory getProductCategory(@PathVariable("ProductCategoryId") Long ProductCategoryId)
	{
		return this.productCategoryService.getProductCategory(ProductCategoryId);
	}
	
	// get all Product Category
	
	@GetMapping("/")
	public ResponseEntity<?> getProductCategories()
	{
		return ResponseEntity.ok(productCategoryService.getProductCategories());
	}
	
	// update product category
	@PutMapping("/")
	public ProductCategory updateProductCategory(@RequestBody ProductCategory productCategory )
	{
		return this.productCategoryService.updateProductCategory(productCategory);
	}
	
	// delete product category
	
	@DeleteMapping("/{productCategoryId}")
	public void deleteProductCategory(@PathVariable("productCategoryId") Long productCategoryId )
	{
		this.productCategoryService.deleteProductCategory(productCategoryId);
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
//	 @Autowired
//	    private ProductCategoryService productCategoryService;
//
//	    //add category
//	    @PostMapping("/")
//	    public ResponseEntity<ProductCategory> addCategory(@RequestBody ProductCategory productCategory) {
//	    	ProductCategory productCategory1 = this.productCategoryService.addProductCategory(productCategory);
//	        return ResponseEntity.ok(productCategory1);
//	    }

	    //get category
//	    @GetMapping("/{categoryId}")
//	    public Category getCategory(@PathVariable("categoryId") Long categoryId) {
//	        return this.categoryService.getCategory(categoryId);
//	    }
//
//	    //get all categories
//	    @GetMapping("/")
//	    public ResponseEntity<?> getCategories() {
//	        return ResponseEntity.ok(this.categoryService.getCategories());
//	    }
//
//	    //update category
//	    @PutMapping("/")
//	    public Category updateCategory(@RequestBody Category category) {
//	        return this.categoryService.updateCategory(category);
//	    }
//
//	    //delete category
//	    @DeleteMapping("/{categoryId}")
//	    public void deleteCategory(@PathVariable("categoryId") Long categoryId) {
//	        this.categoryService.deleteCategory(categoryId);
//	    }

	
	
	
	
	
	
	
	
	

}
