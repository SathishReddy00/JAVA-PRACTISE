package com.LogicalStatements;

import java.util.Scanner;
//write a program to create naukri portal;
public class Naukriportal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("TAP ON LINK TO OPEN PORTAL");
		
		System.out.print("Enter candidate name : ");
		String name=scan.nextLine();
		
		System.out.println("Enter your age : ");
		int age=scan.nextInt();
		scan.nextLine();
		if(age>=18) {
			System.out.println("welcome to naukri website : "+name);
			System.out.println("enter qualification");
			String qualification=scan.nextLine();
			if(qualification.equals("BTECH")) {
				System.out.println("please enter following details");
				System.out.println("enter the specialization");
				String specialization=scan.nextLine();
				if(specialization.equals("engineering")){
					System.out.println("your specialization is matched to job requirement");
					System.out.println("enter your CGPA : ");
					double cgpa=scan.nextDouble();
					if(cgpa>=7.0) {
						System.out.println("your have valid cgpa");
						System.out.println("enter year of passing : ");
						int passing=scan.nextInt();
						if(passing>=2025) {
							System.out.println("your year of passing is valid for job");
							System.out.println("enter your experience :");
							int experience =scan.nextInt();
							scan.nextLine();
							if(experience>=5) {
								System.out.println("you are experienced");
								System.out.println("enter technical skills :");
								String skill=scan.nextLine();
								 if(skill.equalsIgnoreCase("Java")) {
									 System.out.println("technical skills are match to job role");
									 System.out.println("job role : ");
									 String role=scan.nextLine();
									 if(role.equalsIgnoreCase("Java Developer")) {
										 System.out.println("Job role is :"+ role);
										 System.out.println("enter expected salary : ");
										 double salary=scan.nextDouble();
										 scan.nextLine();
										 if(salary<=1000000) {
											 System.out.println("your expected salary is within our company budget");
											 System.out.println("enter prefered job locations :");
											 String location=scan.nextLine();
											 if(location.equalsIgnoreCase("Hyderabad")) {
												 System.out.println("ok,that's great you want to switch location based on project");
												 System.out.println("REGISTRATION SUCCESSFUL");
												 System.out.println("ELIGIBLE FOR JOB");
												 System.out.println("YOU ARE SHORTLISTED FOR JOB");
												 System.out.println("INTERVIEW WILL BE SCHEDULED SOON");
											 }
											 else {
												 System.out.println("sorry location is differed");
												 System.out.println("YOUR APPLICATION IS REJECTED");
											 }
										 }
										 else {
											 System.out.println("expected salary is not within company budger");
										 }
									 }
									 else {
										 System.out.println("sorry not found any job roles in this name");
									 }
								 }
								 else {
									 System.out.println("Invalid technical skills");
								 }
							}
							else {
								System.out.println("sorry we are not hiring freshers");
							}
						}
						else {
							System.out.println("year of passing is not valid");
						}
					}
					else {
						System.out.println("sorry your cgpa is less than 7.0");
					}
				}
				else {
					System.out.println("sorry your not elgible");
				}
			}
			else {
				System.out.println("sorry you are not match the job requirement");
			}
			}
		
		else {
			System.out.println("Sorry[Age must be 18 or above]");
		}
	
		
		
		
		
	
		
	
		
		
		
		
		
		
	}

}
