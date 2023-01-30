package com.BikkadIT.BeanScopes.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StudentTwoPrototype {

	public StudentTwoPrototype() {
		super();
		System.out.println("Prototype Class Constructor");
	}

	
	
	
}
