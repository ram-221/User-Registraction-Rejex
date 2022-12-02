package com.bridgelabz;

import java.util.Scanner;

public class UserRegistractionMain {

	public static void main(String[] args) {
		UserRegistraction user = new UserRegistraction();
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter 1 to Validate First Name: \nEnter 2 to Validate Last Name :"
				+ "\nEnter 3 to Validate Email Address : \nEnter 4 to Validate PassWord");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			user.validFirstName();
			break;
			
		case 2:
			user.validLastName();
			break;
			
		case 3:
			user.validEmailAddress();
			break;
			
		case 4:
			user.validPhoneNumber();
			break;
			
			
			default:
				System.out.println("Invalid Enter");
		}
		scan.close();
		
	}
}
