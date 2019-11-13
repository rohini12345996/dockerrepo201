package com.dockerProject.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dockerProject.entities.Product;
import com.dockerProject.repository.ProductRepository;  
@Service  
public class UserServices {  

	@Autowired
	private ProductRepository prodRepo; 
 
	public List<Product> getAllUsers(){
	return prodRepo.findAll();  
	 
 }
 
 }  