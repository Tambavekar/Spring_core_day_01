package com.mindgate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mindgate.repository.EmployeeRepositoryInterface;

@Service
//@Component
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeRepositoryInterface employeeRepositoryInterface;

	public EmployeeRepositoryInterface getEmployeeRepositoryInterface() {
		return employeeRepositoryInterface;
	}

	public void setEmployeeRepositoryInterface(EmployeeRepositoryInterface employeeRepositoryInterface) {
		this.employeeRepositoryInterface = employeeRepositoryInterface;
	}

	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub
		System.out.println(" EmployeeService AddEmployee");

		return employeeRepositoryInterface.addEmployee();
	}
}
