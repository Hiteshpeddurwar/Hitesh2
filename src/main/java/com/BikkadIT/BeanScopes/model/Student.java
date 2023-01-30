package com.BikkadIT.BeanScopes.model;

import org.springframework.stereotype.Component;

@Component // By default its Singleton or we can mention also
public class Student {

	public Student() {
		super();
		System.out.println("Student Class Contructor");
	}

	
	
	
}
