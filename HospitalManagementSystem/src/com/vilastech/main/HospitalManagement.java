package com.vilastech.main;

import java.util.Scanner;

public class HospitalManagement {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int choice;
		
		
		do {
			System.out.println("Hospital Management System");
			System.out.println("1 Add patient");
			System.out.println("2 Add docter");
			System.out.println("3 Schedule appointment");
			System.out.println("4 View Patient");
			System.out.println("5 View Apppointment");
			System.out.println("0 Exit");
			
			System.out.println("Enter your Choice");
			
			
			
			  choice =s.nextInt();
			  
			  
			 switch(choice) {
			 
			 case 1:
			 addPatient();
			 break;
			 case 2:
			 addDocter();
			 break;
			 case 3:
			 viewPatient();
			 break;
			 case 4:
			 viewDocter();
			 break;
			 case 5:
			 viewAppointment();
			 break;
			 case 0:
			System.out.println("Exiting.........");
			default :
				System.out.println("Invalid choice ,PLease try again");
			 
			 
				 
			 
		}while(choice!=0) {
			
		}
		 
		 }
		
	}

}
