package com.roomrockers.productservice.controller;

import com.roomrockers.productservice.entity.Product;
import com.roomrockers.productservice.serviceImpl.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-service")
public class ProductController {

	@Autowired
	ProductServiceImpl prodServiceImpl;
	
	@GetMapping("/home")
	public String sample() {
		return "home";

	}
	
	@PostMapping("/saveproduct")
	public void saveProduct(@RequestBody Product prod) {
		prodServiceImpl.add(prod);

	}
}
