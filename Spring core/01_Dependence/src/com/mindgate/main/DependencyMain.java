package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {
	public static void main(String[] args) {

		System.out.println("Main Start");
//		System.out.println("Creating Address object and calling set method");
//		
//		Address address = new Address();
//		address.setAddressId(1);
//		address.setBuildingName("Bhagyawan Appt");
//		address.setCity("Mumbai");
//		address.setPin("400042");
//		address.setStree("Bhandup East");
//		address.setHouseNumber("103");
//
//		System.out.println(address);
//
//		System.out.println();
//
//		System.out.println("Creating Employee object and calling set method");
//		Employee employee = new Employee();
//		employee.setEmployeeId(2);
//		employee.setName("Vipul");
//		employee.setSalary(25634.3);
//		employee.setHomeAddress(address);
//
//		System.out.println(employee);
		Address address = new Address(02, "06", "Mishra Nagar", "M.D Keni Marg", "Mumbai", "400042");
		Employee employee = new Employee(03, "Sarika", 28526.36, address);
		System.out.println(employee);
		System.out.println("End");

	}

}
