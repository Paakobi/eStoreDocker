package com.example.estore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Product {
	
	private String productName;
	private Integer productPrice;
}