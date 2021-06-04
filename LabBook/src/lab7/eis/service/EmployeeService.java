package com.capgemini.lab7.eis.service;

import com.capgemini.lab7.eis.bean.Employee;

public interface EmployeeService {
	 public boolean addEmployee(Employee e);
	    public String findInsuranceScheme(double sal, String desg);
	    public Employee showEmployee(int id);

}
