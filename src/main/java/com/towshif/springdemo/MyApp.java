package com.towshif.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create object 
		// BaseballCoach theCoach = new BaseballCoach(); 
		
//		 Coach theCoach = new BaseballCoach();
		 Coach theCoach = new TrackCoach();
		
		// use object 
		System.out.println ( theCoach.getDailyWorkout());
	}
}
