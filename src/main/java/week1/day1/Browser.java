package week1.day1;

import java.util.Scanner;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int noOftab = 9;
		char firstPrice = '1';
		boolean courseCompleted = true;
		float chromeVersion = 141.56F;
		double dregreeScore = 133.3333333333333333;
		long phNo = 897568421L;
		String userName = "Radiant"; 
		
		System.out.println(firstPrice);
		System.out.println("This is the chrome version : "+ chromeVersion);
		System.out.println("Provided the course completed status :"+courseCompleted  +"/n"+ "phone number of the course completed person:" + phNo );
	
		int elage = 21;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name ?");
		String name = scanner.nextLine();
		System.out.println("What is your age ?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your email ?");
		String email = scanner.nextLine();
		if(age==elage) {
			System.out.println("your are eligible");
		}
			else
				System.out.println("your are not eligible");
			
			}	
	}


