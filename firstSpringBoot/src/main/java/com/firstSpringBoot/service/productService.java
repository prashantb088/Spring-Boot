package com.firstSpringBoot.service;

//Service
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.firstSpringBoot.model.product;

import org.springframework.stereotype.Service;

@Service
public class productService {
	
	List<product> productList = new ArrayList<>(Arrays.asList(
			
			new product(101,"LENOVO LAPTOP",55000,10),
			new product(102,"MSI LAPTOP",75000,10),
			new product(103,"ACER PREDATOR Laptop",80000,10),
			new product(104,"ASUS TUF GAMING Laptop",78000,10),
			new product(105,"HP OMEN Laptop",150000,10),
			new product(106,"DELL ALIENWARE Laptop",98000,10),
			new product(107,"MAC Laptop",76000,10)
			));

	//Returning All Products 
	public List<product> getAllProducts(){
		return productList;
	}
	
	//Returning one specified product
	public product getProduct(int id) {
		
		return productList.stream()
					.filter(pro->pro.getProductId()==id).findFirst().get();
	}
	
	public void addProduct(product p1) {
		productList.add(p1);
	}
	
	
	
	
	
	
	
	
	

}
