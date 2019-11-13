package com.dockerProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dockerProject.entities.Product;
import com.dockerProject.repository.ProductRepository;
import com.dockerProject.service.UserServices;


@RestController
@RequestMapping("docker/v1/")
public class DockerController {

	
	@Autowired
	private ProductRepository prodRepo;
	

	@Autowired
	private UserServices userServices;
	
	@GetMapping("/view-productsbyproductID/{productId}")
	public Product getUsersById(@PathVariable(value = "productId") int productId) {
		return prodRepo.findByProductId(productId);
	}
	
	@GetMapping("/view-products")
	public List<Product> getAllUser() {
		return userServices.getAllUsers();
	}
	
}
