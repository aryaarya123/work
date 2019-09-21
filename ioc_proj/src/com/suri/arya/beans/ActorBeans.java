package com.suri.arya.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ActorBeans implements Serializable {

	
	@Value("Arya")
	private String name;
	@Value("25")
	private int age;
	@Value("10 crore")
	private String salary;
	
	
	public ActorBeans() {
	
		System.out.println(this.getClass().getSimpleName()+"created");
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
