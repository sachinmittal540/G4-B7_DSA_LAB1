package com.gl.emailapp.service;

import java.util.Random;

import com.gl.emailapp.model.Employee;

public class CredentialService {
	public char[] generatePassword() {
		String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String symbols = "!@#$%^&*_+-=/.?<>";
		String numbers = "1234567890";
		
		String values = uppercaseLetters + lowercaseLetters + symbols + numbers;
		
		Random random = new Random();
		char[] password = new char[8];
		
		for(int i=0; i<8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		
		return password;
	}
	
	public String generateEmailAddress(String firstname, String lastname, String department) {
		return firstname+"."+lastname+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear "+employee.getFirstname()+", your credentials are as follows");
		System.out.println("Email -->> "+email);
		System.out.print("Password -->> ");
		System.out.print(generatePassword());
	}
}
