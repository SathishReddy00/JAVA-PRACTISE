package com.practise;

import java.util.Scanner;

public class SmartHomeController {
	static Scanner scan=new Scanner(System.in);
	static void displaySystemStatus() {
		System.out.println("SMART HOME SYSTEM STATUS");
		System.out.println("-------------------------");
	}
	void turnOnLights() {
		System.out.println("YOUR LIGHTS ARE TURNED ON");
	}
	static void showAvailableDevices() {
		System.out.println("AVILABLE SMART DEVICES : LIGHTS,AC,DOOR-LOCK SYSTEM,FANS,ROOM CLEANER");
	}
	void displayRoomDetails() {
		System.out.println("BEDROOM TEMPERATURE : 28 DEGEREES");
	}
	
	void setTemperature(int temperature) {
		System.out.println("YOUR AC-TEMPERATURE IS : "+temperature+" "+"celsius");
		
	}
	static void adjustBrightness(int brightness) {
		System.out.println("YOUR ADJUSTED BRIGHTNESS IS : "+ brightness);
		
	}
	void controlFan(String mode,int speed) {
		System.out.println("YOUR FAN MODE IS : "+ mode );
		System.out.println("FAN SPEED : "+ speed);
	}
	double getCurrentTemperature(){
		System.out.println("ENTER YOUR CURRENT TEMPERATURE : ");
		double t=scan.nextDouble();
		System.out.println("YOUR CURRENT TEMPERATURE IS : "+t);
		return t;
		
	}
	static double getElectricityRate() {
		System.out.println("fixed electricity rate : ");
		double e=scan.nextDouble();
		System.out.println("FIXED ELECTRICITY RATE : "+e);
		return e;
	}
	boolean isAcRunning() {
		System.out.println("enter ac is on or off");
		boolean ac=scan.hasNext();
		System.out.println("AC IS RUNNING : "+ ac);
		return ac;
	}
	

	public static void main(String[] args) {
		SmartHomeController smc=new SmartHomeController();
		displaySystemStatus();
		smc.turnOnLights();
		showAvailableDevices();
		smc.displayRoomDetails();
		smc.setTemperature(38);
		adjustBrightness(40);
		smc.controlFan("cool",3);
		smc.getCurrentTemperature();
		getElectricityRate();
		smc.isAcRunning();

	}

}
