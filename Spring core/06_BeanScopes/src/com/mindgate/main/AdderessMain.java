package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;

public class AdderessMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		System.out.println("ApplicationContext is created");
		Address address = applicationContext.getBean("address", Address.class);
		System.out.println(address.hashCode());
		System.out.println();
		Address address2= applicationContext.getBean("address", Address.class);
		System.out.println(address2.hashCode());
		System.out.println("Main End");
	}

}
