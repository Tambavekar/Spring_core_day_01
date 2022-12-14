package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start ");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		System.out.println("ApplicationContext is created");

		Address address = applicationContext.getBean("address", Address.class);
		System.out.println(address);
		System.out.println();

		System.out.println("Main End ");
	}

}
