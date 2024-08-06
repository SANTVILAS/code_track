package email_App;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacty;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String passwordLength;
	private String companySuffix="eycompany.com";
	private String email;

	// Constructor to recieve firstName and LastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Email Created: "+this.firstName+" "+this.lastName);
		this.department = setDepartment();
		System.out.println("Department :"+this.department);
		
		//call a method that generate random password
		this.password = randomPassword(8);
		System.out.println("your password is:"+this.password);
		
		//combine element to generate email
		email = firstName.toLowerCase()+"@"+ department + companySuffix;
		System.out.println("Your email is :"+email);
	}

	// Ask For department
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODE \n1 for sales\n2 for develement\n3 for accounting\0 for none\nEnter the department code ");
		Scanner sc = new Scanner(System.in);
		int depChoice=sc.nextInt();
		if(depChoice== 1) {
			return "sales";
		}else if(depChoice== 2) {
			return "dev";
		}else if(depChoice== 3) {
			return "accountant";
		}else {
			return "none";
		}
		
	}
    // Generate random password

	public String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$&%";
		char[] password = new char[length];
		
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
//            System.out.println(rand);
//            System.out.println(passwordSet.charAt(rand));
		}
		return new String(password);
	}
	
	
	// set mail box capacity

}
