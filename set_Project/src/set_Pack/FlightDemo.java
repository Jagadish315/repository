package set_Pack;

import java.util.HashSet;
import java.util.Set;

public class FlightDemo {

	public static void main(String[] args) {
	
		Set<Flight> flightList= new HashSet<>();
		flightList.add(new Flight(100, "American Airline", 1400.00d, 3.00f));
		flightList.add(new Flight(109, "Quatar Airlines", 1000.00d, 2.50f));
		flightList.add(new Flight(105, "Yati Airlines", 900.00d, 4.00f));

		System.out.println("Printing All Flight/s");
		PrintFlights(flightList);
	}

	private static void PrintFlights(Set<Flight> flightList) {

		for(Flight f: flightList) {
			System.out.println(f);
		}
		
	}

}
