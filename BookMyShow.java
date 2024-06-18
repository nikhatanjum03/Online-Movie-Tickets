package bookmyshow;

import java.util.Scanner;

public class BookMyShow implements IBMS{
	Scanner sc=new Scanner(System.in);
	String email,pwd,loc;
	
	public void signup() {
		System.out.println("Signup to your account : ");
		System.out.println("Enter Email id : ");
		email=sc.next();
		System.out.println("Enter the pwd: ");
		pwd=sc.next();
		System.out.println("Account created successfully");
	}
	
	public boolean login() {
		System.out.println("Do you have account(y/n) : ");
		char ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y') {
			System.out.println("Enter mail id : ");
			String confirm_mail=sc.next();
			System.out.println("Enter password: ");
			String confirm_pwd=sc.next();
			if(confirm_mail.equalsIgnoreCase(email)&&confirm_pwd.equals(pwd)) {
				System.out.println("Login Successfully! ");
				return true;
			}
			else {
				System.out.println("Wrong Credentials");
				login();
				return true;
			}
		}
		else if(ch=='N'||ch=='n') {
			System.out.println("Create an account ");
			signup();
			login();
			return true;
			
		}
		else {
			System.out.println("Enter valid input : ");
			login();
			return true;
		}
		
	}
	
	public String loc(BookMyShow b) {
		if(b instanceof Movies) {
			System.out.println("Select the Location : ");
			System.out.println("1 for Delhi");
			System.out.println("2 for Bangalore");
			System.out.println("3 for Chennai");
			int ch=sc.nextInt();
			if(ch==1) {
				loc="Delhi";
				return loc;	
			}
			else if(ch==2) {
				loc="Banaglore";
				return loc;	
			}
			else if(ch==3) {
				loc="Chennai";
				return loc;	
			}
			else {
				System.out.println("Enter Proper Input !");
				loc(b);
			}
		}
		return loc;
	}
	
	public String selectOption() {
		System.out.println("Enter the choices : ");
		System.out.println("1 for Movies");
		System.out.println("2 for Comedy");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Enjoy Movies");
			return "movies";
		}
		else if(ch==2) {
			System.out.println("Enjoy the comedy show");
			return "comedy";
		}
		else {
			System.out.println("Enter Proper input");
			return selectOption();
		}
		
	}
	
	

	@Override
	public void fullBookings() {
		login();
		String op=selectOption();
		if(op.equals("movies")) {
			Movies m= new Movies();
			 m.loc=loc(m);
			m.selectMovie();
			m.selectSeat();
			m.addons();	
			m.Bill();
		}
		else if(op.equals("comedy")) {
			Comedy c = new Comedy();
			String loc=loc(c);
			System.out.println(loc);
		}
	}
	
	

	public static void main(String[] args) {
		BookMyShow b = new BookMyShow();
		b.fullBookings();
	}
}
