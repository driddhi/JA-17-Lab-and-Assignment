package com.capgemini.lab7.eis.hashMap;

import java.util.HashMap;

import com.capgemini.lab7.eis.bean.Employee;

public class EmployeeHash {
	  HashMap<Integer, Employee> employeeMap = new HashMap<>();

	    public boolean addEmployee(Employee e) {
	        employeeMap.put(e.getEmployeeID(), e);
	        return true;
	    }
	    public String findInsuranceScheme(double sal, String desg) {
	        if (sal > 5000 && sal < 20000 && desg.equalsIgnoreCase("System Associate"))
	            return "Scheme C";
	        else if (sal >= 20000 && sal < 40000 && desg.equalsIgnoreCase("Programmer"))
	            return "Scheme B";
	        else if (sal >= 40000 && desg.equalsIgnoreCase("Manager"))
	            return "Scheme A";
	        else if (sal < 5000 && desg.equalsIgnoreCase("Clerk"))
	            return "No Scheme";
	        return null;
	    }
	    public Employee showEmployee(int id) {
	        return employeeMap.get(id);
	        }

}
