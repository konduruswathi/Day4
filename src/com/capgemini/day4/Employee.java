package com.capgemini.day4;
public class Employee {

	private int employeeId;
	private String employeeName;
	public double HRA;
	public double PF;
	public  final double PT = 200;
	public double medical;
	public double basicSalary;
	public double netSalary;
	public double grossSalary;

	public Employee(){
		}

	public Employee(int employeeId, String employeeName,double basicSalary,double medical) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

public double calEmployeeSalary() {
			HRA = 0.5 * basicSalary;
			PF = 0.12 * (basicSalary);
			grossSalary = basicSalary +HRA+ medical;
			netSalary = grossSalary - (PF + PT);
	return netSalary;	
	}
	public void displayBankAccountDetails() {
		System.out.println("Employee Id : " + employeeId + "\nEmployee name: " + employeeName+  
				"\nEmployee Net Salary: " + netSalary );
	}

	
	}


