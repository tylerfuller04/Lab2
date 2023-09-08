/**
 * Lab2_Task2_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/06/2023
 */

import java.util.Scanner; // Import Scanner to get user input

public class Lab2_Task2_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Define variables
		double score1, score2, score3, score4, average;
		
		// Prompt user for test scores (e.g. 90, 85, 79, 100)
		System.out.print("Enter four test scores: ");
		Scanner input = new Scanner(System.in);
		score1 = input.nextDouble();
		score2 = input.nextDouble();
		score3 = input.nextDouble();
		score4 = input.nextDouble();
		input.close();

		// Calculate average
		average = (score1 + score2 + score3 + score4) / 4;
		
		// Print results to the console
		System.out.print("Average: " + average);

	}
}