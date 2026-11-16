package com.practise;


public class Travelplanner {
	//METHOD 1: NO RETURN AND NO PARAMETERS;
	static void displayWelcome() {
		System.out.println("WELCOME TO SATYA TRAVELLERS");
		System.out.println("----------------------------");
	}
	void displayDestination() {
		System.out.println("YOUR SELECTED DESTINATION : OOTY,TAMIL NADU");
		System.out.println("--------------------------------------------");
	}
	static void showTravelTips() {
		System.out.println("TIPS");
		System.out.println("1.BRING WOOLEN JACKETS");
		System.out.println("2.KEEP MEDI-KIT");
		System.out.println("3.KEEP ON-HANDS CASH");
		System.out.println("--------------------------------------------");

	}
	void displayTripDetails() {
		System.out.println("OUR DESTINATION POINT : OOTY");
		System.out.println("TRAVEL DURATION:20 HOURS");
		System.out.println("--------------------------------------------");

	}
	//METHOD 2: NO RETURN WITH PARAMETERS;
	static void calculateTicketCost(int persons,double price){
		double total=persons * price;
		System.out.println("TOTAL TICKET PRICE  : "+total);
		System.out.println("--------------------------------------------");
		}
	void displayHotelDetails(String hotelname,int days) {
		System.out.println("HOTEL NAME : "+hotelname);
		System.out.println("STAYING DAYS : "+ days);
		System.out.println("--------------------------------------------");

	}
	static void printDestination(String city,String country) {
		System.out.println("CITY LOCATION : "+city);
		System.out.println("COUNTRY : "+country);
		System.out.println("--------------------------------------------");

	}
	
	//RETURN TYPE AND NO PARAMETERS;
	
	double getTotalTripCost() {
		int oneticket=8000;
		int totaltickets=4;
		int hotelexpenses=2500;
		double total=(oneticket*totaltickets)+(totaltickets*hotelexpenses);
		System.out.println("TOTAL TRIP COST = "+ total);
		System.out.println("--------------------------------------------");

		return total;
	}
	String getDestination() {
		String des="OOTY";
		System.out.println("DESTINATION  : "+des);
		System.out.println("--------------------------------------------");

		return des;

	}
	static int RecommendedDays(){
		int days=2;
		System.out.println("RECOMMEDED DAYS TO TRAVEL : "+days);
		return days;
		
	}
	
	public static void main(String[] args) {
		Travelplanner tp =new Travelplanner();
		displayWelcome();
		tp.displayDestination();
		showTravelTips();
		tp.displayTripDetails();
		calculateTicketCost(4,10000);
		tp.displayHotelDetails("MAYURA LUXURAY HOTEL", 5);
		printDestination("NEAR COIMBATORE,TAMIL NADU","INDIA");
		tp.getTotalTripCost();
		tp.getDestination();
		RecommendedDays();
		
		
		}
}
