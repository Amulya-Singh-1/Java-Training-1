package com.test33.Service;

import com.test33.Entity.Employee;

public interface MyService {
	Employee getEmployeeById(Integer id);
	Employee addEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	String deleteEmployee(Integer id);
}
