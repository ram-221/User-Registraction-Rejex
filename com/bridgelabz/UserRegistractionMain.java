package com.bridgelabz;

import java.util.Scanner;

public class UserRegistractionMain {

	public static void main(String[] args) {
		UserRegistraction user = new UserRegistraction();
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter 1 to Validate First Name: \nEnter 2 to Validate Last Name :"
				+ "\nEnter 3 to Validate Email Address : \nEnter 4 to Validate PassWord: "
				+ "\nEnter 5 to Validate Password: \nEnter 6 to Validate Password :"
				+ "\nEnter 7 to Validate Password: \nEnter 8 to Validate Password :");
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
			
		case 5:
			user.rull_1_Password();
			break;
			
		case 6:
			user.rull_2_Password();
			break;
			
		case 7:
			user.rull_3_Password();
			break;
			
		case 8:
			user.rull_4_Password();
			break;
					
			default:
				System.out.println("Invalid Enter");
		}
		scan.close();
		
	}
}
