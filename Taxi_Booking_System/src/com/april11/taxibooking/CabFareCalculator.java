package com.april11.taxibooking;

public class CabFareCalculator {
	
	double fareCalculator (int distance , int type) {
		double fare;
		int amountperKm = (type == 1) ? 10 : (type == 2) ? 15 : 20;
		fare = distance * amountperKm;
		return fare;
	}
}
