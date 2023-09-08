/*
 * Lab2_Task1_Tyler_Fuller
 * Tyler Fuller
 * 01261802
 * 09/16/2023
 */

import java.util.Scanner; // Import package to get Scanner for user input
import java.lang.Math; // Import package Math to get sqrt

public class Lab2_Task1_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Declare variables
		double x1, y1, x2, y2, side1, side2, distance;
		
		// Prompt user for x and y coordinates (e.g. 1 2 3 4)
		System.out.print("Enter x1, y1, x2, y2: ");
		Scanner input = new Scanner(System.in);
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		input.close();
		
		// Calculate side distances and total distance
		side1 = Math.pow(x2 - x1, 2);
		side2 = Math.pow(y2 - y1, 2);
		distance = (Math.sqrt(side1 + side2));
		
		// Print distance to the console
		System.out.print("Distance: " + distance);
	}
}