package com.pace.java2;

import java.util.ArrayList;

public class MainApp {
	
	public static void main(String[] args) {
		City city1 = new City("Ongole", "Cows", 12378, "AndraPradesh");
		City city2 = new City("Vijayawada", "Lion Safari", 12657, "AndraPradesh");
		City city3 = new City("Hyderabad", "Lion Safari", 12334, "Telengana");
		City city4 = new City("Manglore", "Cows", 12458, "Karnataka");
		City city5 = new City("Kadapa", "Hens", 18978, "AndraPradesh");
		
		ArrayList <City> cityList = new ArrayList<City>();
		
		cityList.add(city1);
		cityList.add(city2);
		cityList.add(city3);
		cityList.add(city4);
		cityList.add(city5);
		
		for(City ele : cityList) {
			if(ele.getName().startsWith("M") && ele.getName().endsWith("e")) {
				System.out.println("City names that start with 'M' and end with 'e':" +ele.getName());
			}
		}
		
		for(City ele : cityList) {
			if(ele.getFamousFor() == "Lion Safari") {
				System.out.println("City famous for Lion Safari: " +ele.getName());
			}
		}
	}

}