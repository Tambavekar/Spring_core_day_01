package com.mindgate.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Component
public class EmployeeRepository implements EmployeeRepositoryInterface {

	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRepository addEmployee() ");

		return false;
	}
}
