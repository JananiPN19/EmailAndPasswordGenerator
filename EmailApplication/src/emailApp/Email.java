package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName,lastName,department,password,email,alternateEmail,companySuffix = "virtusa.com";
	private int mailBoxCapacity = 500,defaultPasswordLength = 10;
	
	//Constructor to get the values of First name and Last name.
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call a method asking for the department - return the department.
		this.department = setDepartment();
		
		//Call a method for generating password - return the password.
		this.password = randomPassword(defaultPasswordLength);
		
		//Combine elements to generate Email.
		email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+companySuffix;
	}
	
	//Ask for the department.
	private String setDepartment() {
		System.out.print("Enter the Department:\n1. For sales\n2. For Development\n3. For Accounting\n0. For none\n");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if(choice == 1) { return "sales"; }
		else if(choice == 2) { return "dev"; }
		else if(choice == 3) { return "acctg"; }
		else { return ""; }
	}
	
	//Generate a random password.
	private String randomPassword(int length) {
		String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int ind = (int) (Math.random()*passSet.length());
			password[i] = passSet.charAt(ind);
		}
		return new String(password);
	}
	
	//Set the mail box capacity.
	public void setMailBoxCapacity(int capacity) {	this.mailBoxCapacity = capacity; }
	
	//Set the alternate email.
	public void setAlternateEmail(String altemail) { this.alternateEmail = altemail; }
	
	//Change the password.
	public void resetPassword(String newPass) { this.password = newPass; }
	
	//Get the mail box capacity.
	public int getMailBoxCapacity() { return mailBoxCapacity; }
	
	//Get the alternate email.
	public String getAlternateEmail() { return alternateEmail; }
	
	//Get the reset password. 
	public String getResetPassword() { return password; }
	
	//Display Info.
	public String showInfo() {
		return "DISPLAY NAME: "+firstName+" "+lastName+"\n"+
				"DEPARTMENT: "+department+"\n"+
				"COMPANY EMAIL ADDRESS: "+email+"\n"+
				"PASSWORD: "+password+"\n"+
				"MAIL BOX CAPACITY: "+mailBoxCapacity;
	}

}
