/**
 * Lab2_Task3_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/06/2023
 */

import java.util.Scanner; // Import Scanner to get user input
import java.lang.Math; // Import Math to use Round function

public class Lab2_Task3_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Declare constants
		final double COST_PER_LITER = 0.38; // in dollars
		final double PROFIT_PER_CARTON = 0.27; // in dollars
		final double LITERS_PER_CARTON = 3.78; // in liters
		
		// Declare variables
		double liters, profit, cost;
		int cartons;
		
		// Prompt user for input
		System.out.print("Enter how much milk was produced in liters: ");
		Scanner input = new Scanner(System.in);
		liters = input.nextDouble();
		input.close();
		
		// Calculate number of cartons needed
		cartons = (int)(Math.round(liters / LITERS_PER_CARTON));
		
		// Calculate total cost
		cost = liters * COST_PER_LITER;
		
		// Calculate total profit
		profit = cartons * PROFIT_PER_CARTON;
		
		//Print results to the console
		System.out.println("Milk cartons needed: " + cartons);
		System.out.println("Cost of production: $" + String.format("%.2f", cost));
		System.out.println("Total profit: $" + String.format("%.2f", profit));
		
	}
}