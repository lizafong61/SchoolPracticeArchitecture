package com.architecture.app;

import java.util.Scanner;
import com.architecture.bo.*;

public class UniversidadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppMethods myAppMethods = new AppMethods();
		
		System.out.println("Welcome to MyUniversity System");
		System.out.println("\nWich Institute do you want to log in?"+
		"\nITLM"+ "\nUdeG" +"\nITSON");
		Scanner usrInput = new Scanner(System.in);
		String strInput = usrInput.next().toLowerCase();
		
		myAppMethods.universitySelection(strInput);
				
		System.out.println("What is your request?" + 
		"\nAdd student" + "\nRemove student" +"\nGet Students lists");
		String requestInput = usrInput.nextLine().toLowerCase();
		
		System.out.println("Enter student name: ");
		String stdName = usrInput.nextLine().toLowerCase();
		
		System.out.println("Enter student last name: ");
		String stdLastName = usrInput.nextLine().toLowerCase();
		
		
		
	}

}
