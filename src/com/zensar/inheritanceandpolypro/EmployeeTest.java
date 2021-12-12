package com.zensar.inheritanceandpolypro;

class Employee {

	private String empName;
	private String empDesignation;
	private double empSalary;

	public Employee() {
	}

	public Employee(String empName, String empDesignation, double empSalary) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}

class Manager extends Employee {
	double incentive;
	
	public Manager() {}

	public Manager(String empName, String empDesignation, double empSalary, double incentive) {
		super(empName, empDesignation, empSalary);
		this.incentive = incentive;
	}
	
	public double getEmpSalary() {
		return super.getEmpSalary() + incentive;
	}
	
}

class Labour extends Employee {
	double overTime;
	
	public Labour() {}

	public Labour(String empName, String empDesignation, double empSalary, double overTime) {
		super(empName, empDesignation, empSalary);
		this.overTime = overTime;
	}
	
	
	public double getEmpSalary() {
		return super.getEmpSalary() + overTime;
	}
}

public class EmployeeTest {
	
	public static void main(String[] args) {
		Manager manager = new Manager("Ram", "Manager", 20000, 2000);
		Labour labour = new Labour("Dharam", "Labour", 8000, 1000);
		
		System.out.println("Salary of "+ manager.getEmpDesignation() + " " + manager.getEmpName()  +" is =  " + manager.getEmpSalary());
		System.out.println("Salary of "+ labour.getEmpDesignation() + " " + labour.getEmpName()  +" is =  " + labour.getEmpSalary());
	}
}
