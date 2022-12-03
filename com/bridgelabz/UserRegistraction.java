package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistraction {

	/* UC 1*/
	
	Scanner scan = new Scanner(System.in);
	public void validFirstName() {
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
	
	/* UC 2*/
	public void validLastName() {
		System.out.println("Enter the Last Name :");
		String lName = scan.next();
		String lRegex ="^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(lRegex);
		Matcher m = p.matcher(lName);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("Last Name is Valid");
		}
		else {
			System.out.println("Last Name is InValid");
		}
	}
	
	/* UC 3*/
	public  void validEmailAddress() {
		System.out.println("Enter the Email Address :");
		String lName = scan.next();
		String lRegex ="abc[a-zA-Z0-9]*[@]bl[.]co[a-zA-Z0-9]*";
		Pattern p = Pattern.compile(lRegex);
		Matcher m = p.matcher(lName);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("Email Address is Valid");
		}
		else {
			System.out.println("Email Address InValid");
		}
	}
	
	/* UC 4*/
	public void validPhoneNumber() {
		System.out.println("Enter Phone Number");
		String pNumber = scan.nextLine();
		String pRegex = "^[1-9]{2}\\s[6-9]*[0-9]{9}";
		Pattern p = Pattern.compile(pRegex);
		Matcher m = p.matcher(pNumber);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("Phone Number is Valid");
		}
		else {
			System.out.println("Phone Number is InValid");
		}
	}
	
	/* UC 5*/
	
	public void rull_1_Password() {
		System.out.println("Enter the Password");
		String rull1 = scan.nextLine();
		String regex = "[a-z]{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull1);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("Password is Valid");
		}
		else {
			System.out.println("Password is InValid");
		}
	}
	
	/* UC 6*/
	public void rull_2_Password() {
		System.out.println("Enter the Rull 2 Password");
		String rull2 = scan.nextLine();
		String regex = "[A-Z]+[a-z]{7,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull2);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("Password is Valid");
		}
		else {
			System.out.println("Password is Invalid");
		}
	}
	
	/* UC 7 */
	public void rull_3_Password() {
		System.out.println("Enter the Rull 3 Password");
		String rull3 = scan.nextLine();
		String regex = "[A-Z]+[0-9]+[a-z]{6,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull3);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("Password is Valid");
		}
		else {
			System.out.println("Password is Invalid");
		}
	}
	
	/* UC 8 */
	public void rull_4_Password() {
		System.out.println("Enter the Rull 4 Password");
		String rull3 = scan.nextLine();
		String regex = "[A-Z]+[0-9]+[@][a-z]{5,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull3);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("Password is Valid");
		}
		else {
			System.out.println("Password is INValid");
		}	
	}
}
