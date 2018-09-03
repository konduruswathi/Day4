package com.capgemini.day4;

public class SalesManager extends Employee{
	private double  petrolAllowance;
	private double  foodAllowance;
	private double  otherAllowance;
	public SalesManager() {
		super();
		
	}
	public SalesManager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		
	}
	public double calculateNetSal()
	{
		HRA=0.5*basicSalary;
		PF=0.13*basicSalary;
		double grossSalary=(HRA)+basicSalary+medical;
		petrolAllowance=(basicSalary*8)/100;
		foodAllowance=(13*basicSalary)/100;
		otherAllowance=(3*basicSalary)/100;
		double netSalary=grossSalary-(PF + PT);
		double SalesManager=netSalary+petrolAllowance+foodAllowance+otherAllowance;
		return SalesManager;
	}
	
	

}
