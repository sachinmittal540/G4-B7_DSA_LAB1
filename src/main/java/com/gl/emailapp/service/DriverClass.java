package com.gl.emailapp.service;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		String selectedDepartment;
		
		System.out.println("Enter your First name");
		String fn = scanner.next();
		System.out.println("Enter your Last name");
		String ln = scanner.next();
		
		
		System.out.println("Please select your department from following list");
		System.out.println("Press 1 for Technical");
		System.out.println("Press 2 for Human Resources");
		System.out.println("Press 3 for Admin");
		System.out.println("Press 4 for Legal");
		
		int department = scanner.nextInt();
		
		scanner.close();
		
		switch(department) {
			case 1:
				selectedDepartment = "tech";
				break;
			case 2:
				selectedDepartment = "hr";
				break;
			case 3:
				selectedDepartment = "admin";
				break;
			case 4:
				selectedDepartment = "legal";
				break;
			default:
				System.out.println("Invalid selection...");
				return;
		}
		
		Employee employee = new Employee(fn, ln);
		
		generatedEmail = cs.generateEmailAddress(fn, ln, selectedDepartment);
		generatedPassword = cs.generatePassword();
		
		cs.showCredentials(employee, generatedEmail, generatedPassword);
	}

}
