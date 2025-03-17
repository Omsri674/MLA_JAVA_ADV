package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.model.Product;
import com.test.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	public void setService(ProductService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public Product createProduct(@RequestBody Product p) {
		service.createProd(p);
		
		return p;
	}
	
	@GetMapping("/readAll")
	public List<Product> readAll() {
		return service.readAll();
	}
	
	@PutMapping("update/{id}")
	public  List<Product> Update(@PathVariable("id") int id, @RequestBody Product p) {
		
		p.setId(id);
		return service.update(p);
	}
	
	@DeleteMapping("delete/{id}")
	public List<Product> delete(@PathVariable("id") int id){
		
		return service.deleteProd(id);
	}
	
}
