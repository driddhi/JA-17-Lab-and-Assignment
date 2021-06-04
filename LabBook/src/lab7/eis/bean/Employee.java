package com.capgemini.lab7.eis.bean;

public class Employee {
	
	 private int employeeID;
	    private String employeeName;
	    private double salary;
	    private String employeeDesignation;
	    private String insuranceScheme;
	    
	    //default constructor
	    
	    public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//parameterised constructor
	    
	    public Employee(int employeeID, String employeeName, double salary, String employeeDesignation,
				String insuranceScheme) {
			super();
			this.employeeID = employeeID;
			this.employeeName = employeeName;
			this.salary = salary;
			this.employeeDesignation = employeeDesignation;
			this.insuranceScheme = insuranceScheme;
		}
		
	    
		
	    //getter setter
		public int getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getEmployeeDesignation() {
			return employeeDesignation;
		}
		public void setEmployeeDesignation(String employeeDesignation) {
			this.employeeDesignation = employeeDesignation;
		}
		public String getInsuranceScheme() {
			return insuranceScheme;
		}
		public void setInsuranceScheme(String insuranceScheme) {
			this.insuranceScheme = insuranceScheme;
		}
		
		
		//toString 

		@Override
		public String toString() {
			return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", salary=" + salary
					+ ", employeeDesignation=" + employeeDesignation + ", insuranceScheme=" + insuranceScheme + "]";
		}
		
		
		
		
}
