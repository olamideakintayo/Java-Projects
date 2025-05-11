// DriverTestDriller.java

import java.util.Scanner;

public class DriverTestDriller {
	
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter the Quantity you want:");
		int quantity = input.nextInt();
				
		if (quantity >= 1) {
		int prices = TestDriller.getPrices(quantity);
		int totalCost = TestDriller.getTotalPrices(quantity);
		System.out.printf("For the  Quantity of %d, The Price Per Copy is %d and The Total Cost is %d", quantity, prices, totalCost);
		}
		else {
		System.out.print("Invalid Input");
		}
		
	}
		}