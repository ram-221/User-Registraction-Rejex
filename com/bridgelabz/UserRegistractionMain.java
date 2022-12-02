package com.bridgelabz;

import java.util.Scanner;

public class UserRegistractionMain {

	public static void main(String[] args) {
		UserRegistraction user = new UserRegistraction();
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter 1 to Validate First Name: \nEnter 2 to Validate Last Name :");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			user.validFirstName();
			break;
			
		case 2:
			user.validLastName();
			break;
		}
		scan.close();
	}
}
