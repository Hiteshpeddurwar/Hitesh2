package com.BikkadIT.BeanScopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.BeanScopes.model.Student;
import com.BikkadIT.BeanScopes.model.StudentTwoPrototype;

@SpringBootApplication
public class BeanScopesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BeanScopesApplication.class, args);
	
	Student student = context.getBean(Student.class);
	
	System.out.println(student.hashCode());
	System.out.println(context.isSingleton("student"));
	
	Student student1 = context.getBean(Student.class);
	System.out.println(student1.hashCode());
	
	
	StudentTwoPrototype studentTwoPrototype = context.getBean(StudentTwoPrototype.class);
	System.out.println(studentTwoPrototype.hashCode());
	System.out.println(context.isPrototype("studentTwoPrototype"));
	
	
	StudentTwoPrototype studentTwoPrototype1 = context.getBean(StudentTwoPrototype.class);
	System.out.println(studentTwoPrototype1.hashCode());
	System.out.println(context.isPrototype("studentTwoPrototype"));
	
	
	
	}

}
