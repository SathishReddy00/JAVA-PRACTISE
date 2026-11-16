package com.practise;

import java.util.Scanner;

public class MovieTheatre {
	static Scanner scan = new Scanner(System.in);
	static void displayTheatreName() {
		System.out.println("ARJUN THEATRE 70 MM");
		System.out.println("----------------------------------------------");
		
	}
	void displayMovieDetails(){
		String Moviename="RAMAYANAM";
		double showtime=2.45;
		System.out.println("MOVIE NAME                    : "+Moviename);
		System.out.println("SHOW-TIME                     : "+ showtime +" "+"pm");
		System.out.println("-------------------------------------------------");

	}
	static void showAvailableFacilities() {
		System.out.println("FACILITIES");
		System.out.println("1.DOLBY SOUND EFFECTS");
		System.out.println("2.COMFORTABLE SEATS");
		System.out.println("3.SNACKS WITH DISCOUNTS");
		System.out.println("---------------------------------------------------");

	}
	void displaySeatStatus() {
		System.out.println("SEATS ARE AVAILABLE BUT FILLING FAST ");
		System.out.println("---------------------------------------------------");




	}
	void bookTickets(int seats) {
		int totalseats=500;
		System.out.println("ENTER NUMBER OF TICKETS TO BOOKED : ");
		int tick=scan.nextInt();
		System.out.println("YOUR BOOKED TICKETES         : "+ tick);
		int total=totalseats-tick;
		System.out.println("UPDATED SEATS AVAILABILITY   : "+(total));
	
		System.out.println("---------------------------------------------------");
		}
	static void calculateTicketAmount(int seats,double price) {
		
		double amount=seats*price;
		System.out.println("TOTAL AMOUNT FOR TICKETS     : "+ amount);
		System.out.println("---------------------------------------------------");

		
	}
	void displaySnackOrder(String snack,int quantity) { 
		
		System.out.println("YOUR SNACK NAME IS          : "+snack);
		System.out.println("TOTAL QUANTITY              : "+quantity);
		System.out.println("-------------------------------------------------");

		
	}
	double getAvailableSeats() {
		System.out.println("ENTER TOTAL SEATS VACANCIES : ");
		int se=scan.nextInt();
		System.out.println("TOTAL SEATS                 : "+se);
		System.out.println("-------------------------------------------------");

	
		return se;
	}
	String getMovieName() {
		System.out.println("MOVIE NAME                  : ");
		String flim=scan.next();
		System.out.println("MY MOVIE NAME IS            : "+ flim);
		System.out.println("-------------------------------------------------");

		
		return flim ;
	}
	double getTotalRevenue() {
		System.out.println("TOTAL TICKETS               : ");
		int tt= scan.nextInt();
		System.out.println("ENTER REVENUE               : ");
		int r=scan.nextInt();
		int totalrevenue=tt*r;
		System.out.println("TOTAL REVENUE BASED ON TICKETS : "+totalrevenue);
		System.out.println("---------------------");

		return totalrevenue;
	}

	

	public static void main(String[] args) {
		MovieTheatre mt=new MovieTheatre();
		displayTheatreName();
		mt.displayMovieDetails();
		showAvailableFacilities();
		mt.displaySeatStatus();
		mt.bookTickets(0);
		
		System.out.println("ENTER THE NUMBER OF BOOKED TICKETS : ");
		int booked=scan.nextInt();
		System.out.println("ENTER ONE TICKET PRICE : ");
		double prices=scan.nextDouble();
		calculateTicketAmount(booked,prices);
		
		System.out.println("ENTER THE SNACK NAME : ");
		String food=scan.next();
		System.out.println("ENTER QUANTITY : ");
		int qty=scan.nextInt();
		mt.displaySnackOrder(food, qty);
		
		mt.getAvailableSeats();
		mt.getMovieName();
		mt.getTotalRevenue();
		
		
		
		

	}

}
