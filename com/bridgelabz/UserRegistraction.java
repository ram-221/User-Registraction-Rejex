package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistraction {

	/* UC 1*/
	
	Scanner scan = new Scanner(System.in);
	public void firstName() {
		System.out.println("Enter the First Name :");
		String fname = scan.nextLine();
		String regex ="^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(fname);
		boolean b = m.matches();

		if(b) {
			System.out.println("First Name is Valid");
		}
		else {
			System.out.println("First Name is InValid");
		}

	}

}