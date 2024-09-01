import java.util.Scanner;

public class TaxCalculator {
	
	public static double calculateTax(double income) {
		double taxRate = 0.0;
	
	if (income < 500) {
		taxRate = 0.10;
	} else if (income >= 500 && income < 1500) {
		taxRate = 0.15;
	} else if (income >= 1500 && income < 2500) {
		taxRate = 0.20;
	} else {
		taxRate = 0.30;
	}
	
	return income * taxRate;
	
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter the weekly income: $");
			double income = scanner.nextDouble();
			
			if (income < 0) {
				System.out.println("Income cannot be negative.");
			} else {
				double taxWithHeld = calculateTax(income);
				System.out.printf("Weekly tax withholding: $%.2f%n", taxWithHeld);
			}	
		} catch (Exception e) {
			System.out.println("Please enter a valid numerical value for income.");
		} finally {
			scanner.close();
		}
	}
}
