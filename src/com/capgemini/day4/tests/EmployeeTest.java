package com.capgemini.day4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.Employee;
import com.capgemini.day4.President;
import com.capgemini.day4.SalesManager;


	
		class EmployeTest {

			SalesManager manager;
			
			Employee employee;
			President president;

			@BeforeEach
			void setUp() {
				employee=new Employee(1234,"swathi",15000.0,2500);
			}
			
			@Test
			void testcalEmployeeSalary() {
				assertEquals(23000,employee.calEmployeeSalary(),0.02);
			}
			@Test
			void testcalSalesManager() {
				manager=new SalesManager(1234,"swathi",15000,2500);
			
				assertEquals(26450,manager.calculateNetSal(),0.02);
			}
			void testcalculatePresidentSalary() {
			president=new President(1234,"swathi",15000,2500);
			assertEquals(24898.00,president.calculatePresidentSal(6),0.03);
			}

				
			}
		