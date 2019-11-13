package com.dockerProject.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "Product")  
@Inheritance(strategy=InheritanceType.JOINED)  
public class Product {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int productId;
	private String productName;
	private float price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product() {}
	
	public Product(int productId,String productName,float price)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}

}
