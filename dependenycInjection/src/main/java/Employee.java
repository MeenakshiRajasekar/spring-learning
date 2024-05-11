package com.spring.learning.com.spring.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//we have jvm within that spring container is present
//contains the object / spring beans
//@Component - provides the initialized object from container which is auto configured
//@Component uses default constructor of class
@Component
public class Employee {
	
	int empId;
	String empName;
	String empLocation;
	@Autowired
	//autowired find the object based on it id by default , 
	//we can use qualifier to search the object by name
	@Qualifier("lapobj")
	private Laptop laptop;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public void display() {
		System.out.println("Employee joined organization");
		laptop.laptopWorking();
	}
	

}
