package com.spring.learning.com.spring.learning;

import org.springframework.stereotype.Component;

@Component("lapobj")
public class Laptop {
	String laptopModel;
	int laptopId;
	public String getLaptopModel() {
		return laptopModel;
	}
	public void setLaptopModel(String laptopModel) {
		this.laptopModel = laptopModel;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	
	public void laptopWorking() {
		System.out.println("Working laptop");
	}

}
