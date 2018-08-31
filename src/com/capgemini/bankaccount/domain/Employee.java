package com.capgemini.bankaccount.domain;

public class Employee {
private long employeeId;
private String employeeName;
private double basicSalary;
private int employeePhone;
public final double SPECIAL_ALLOWANCES=250.80;
public final double HRA=1000.50;
private String employeeAddress;

public Employee() {
	
}
public Employee(long Id,String Name,int Phone,String address) {
	this();
	this.employeeId=Id;
	this.employeeName=Name;
	this.employeePhone=Phone;
	this.employeeAddress=address;
}
public double calculateSalary(double basicSalary)
{
	double salary;
	return salary=basicSalary+(basicSalary*SPECIAL_ALLOWANCES/100)+(basicSalary*HRA/100);
}
}