package com.capgemini.day4;

public class President extends Employee{
private long km;
private double tourAllowance;
private static final double telephoneAllowance=2000;
public President() {
	super();
	// TODO Auto-generated constructor stub
}
public President(int employeeId, String employeeName, double basicSalary, double medical) {
	super(employeeId, employeeName, basicSalary, medical);
	// TODO Auto-generated constructor stub
}
public double calculatePresidentSal(int km)
{
	HRA=0.5*basicSalary;
	PF=0.13*basicSalary;
	double grossSalary=(HRA)+basicSalary+medical;
	double netSalary=grossSalary-(PF + PT);
	int k=km*8;
	return (netSalary+k+telephoneAllowance);
}
}
