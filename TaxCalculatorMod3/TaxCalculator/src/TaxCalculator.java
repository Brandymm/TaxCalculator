import java.util.Scanner; // Importing Scanner class for user input.

public class TaxCalculator { // Class definition for the TaxCalculator.
	// Method to calculate tax based on income.
	public static double calculateTax(double income) {
		double taxRate = 0.0; // Initialize taxRate to 0.0.
	// Determine tax rate based on income brackets.
	if (income < 500) {
		taxRate = 0.10; // 10% tax rate for income less than $500.
	} else if (income >= 500 && income < 1500) {
		taxRate = 0.15; // 15% tax rate for income between $500 and $1499.99.
	} else if (income >= 1500 && income < 2500) {
		taxRate = 0.20; // 20% tax rate for income between $1500 and $2499.99.
	} else {
		taxRate = 0.30; // 30% tax rate for income $2500 or above.
	}
	
	return income * taxRate; // Return the calculated tax amount.
	
	}

	public static void main(String[] args) { // Main method, entry point of the program.
		Scanner scanner = new Scanner(System.in); // Create a scanner object to get a user input.
		
		try {
			System.out.print("Enter the weekly income: $"); // Prompt the user to input weekly income.
			double income = scanner.nextDouble(); // Read user input as a double.

			// Check if the income is negative.
			if (income < 0) {
				System.out.println("Income cannot be negative."); // Display an error message if income is negative.
			} else {
				// Call the calculateTax method and store the result in taxWithHeld.
				double taxWithHeld = calculateTax(income);
				// Print the weekly tax withholding formatted to 2 decimal places.
				System.out.printf("Weekly tax withholding: $%.2f%n", taxWithHeld);
			}	
		} catch (Exception e) {
			// Catch and handle any invalid input (like non-numerical values).
			System.out.println("Please enter a valid numerical value for income.");
		} finally {
			// Ensure the scanner is closed, preventing resource leaks.
			scanner.close();
		}
	}
}
