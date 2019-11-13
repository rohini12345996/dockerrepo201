package com.dockerProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dockerProject.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByProductId(int productId) ;
	
}
