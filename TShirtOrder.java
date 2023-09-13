/*
 * Created on: Feb 21, 2023
 *
 * ULID: cqtroja
 * Class: IT 168 
 */

/**
 * Creates a t-shirt order for the superbowl. Asks user how many shirts of each 
 * they want and if they would like to customize the shirts. Output is a receipt for
 * the order and their shipping information.
 *
 * @author Cameron Trojan
 *
 */

package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TShirtOrder
{

	public static void main(String[] args)
	{
		// Define constants
		final double LETTER_PRICE = 1.0;
		final double SALES_TAX_RATE = 0.1;
		final double SHIPPING_COST = 0.05;
		final double SHIRT_PRICE = 40.0;

		// Variables
		int chiefsShirts = 0;
		int eaglesShirts = 0;
		int superBowlShirts = 0;
		int chiefsLetters = 0;
		int eaglesLetters = 0;
		int superBowlLetters = 0;
		String firstName;
		String lastName;
		String streetAddress;
		String city;
		String state;
		String zipCode;

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$###,###.00");

		// Display menu and get Chiefs T-shirts order
		System.out.println("Super Bowl T-Shirts");
		System.out.println("Chiefs T-shirts " + df.format(SHIRT_PRICE));
		System.out.println("Eagles T-shirts " + df.format(SHIRT_PRICE));
		System.out.println("Super Bowl T-shirts " + df.format(SHIRT_PRICE));
		System.out.print("Enter the number of Chiefs T-Shirts to purchase: ");
		chiefsShirts = input.nextInt();

		// Check for customization
		if (chiefsShirts > 0)
		{
			System.out.print("Would you like to customize (y/n): ");
			String custom = input.next();

			int counter = chiefsShirts;
			int count2 = 1;
			while (counter > 0)
			{
				System.out.print("What do you want to print on the back of shirt " + count2 + ":");
				String text = input.next();
				chiefsLetters += text.replaceAll("\\s+", "").length();
				counter--;
				count2++;
			}
		}

		// Get Eagles T-shirts order and check for customization
		System.out.print("Enter the number of Eagles T-Shirts to purchase: ");
		eaglesShirts = input.nextInt();
		if (eaglesShirts > 0)
		{
			System.out.print("Would you like to customize (y/n): ");
			String custom = input.next();

			int counter = eaglesShirts;
			int count2 = 1;
			while (counter > 0)
			{
				System.out.print("What do you want to print on the back of shirt " + count2 + ":");
				String text = input.next();
				eaglesLetters += text.replaceAll("\\s+", "").length();
				counter--;
				count2++;
			}
		}

		// Get Super Bowl T-shirts order and check for customization
		System.out.print("Enter the number of Super-Bowl T-Shirts to purchase: ");
		superBowlShirts = input.nextInt();
		if (superBowlShirts > 0)
		{
			System.out.print("Would you like to customize (y/n): ");
			String custom = input.next();

			int counter = superBowlShirts;
			int count2 = 1;
			while (counter > 0)
			{
				System.out.print("What do you want to print on the back of shirt " + count2 + ":");
				String text = input.next();
				superBowlLetters += text.replaceAll("\\s+", "").length();
				counter--;
				count2++;
			}
		}
		// Get shipping information
		System.out.println("Please enter shipping information:");
		System.out.print("Enter first name: ");
		firstName = input.next();

		System.out.print("Enter last name: ");
		lastName = input.next();

		System.out.print("Enter street address: ");
		String streetNum = input.next();
		streetAddress = input.nextLine();

		System.out.print("Enter city: ");
		city = input.nextLine();

		System.out.print("Enter state: ");
		state = input.next();

		System.out.print("Enter zip code: ");
		zipCode = input.next();

		// Calculate subtotal
		double subtotal = (chiefsShirts + eaglesShirts + superBowlShirts) * SHIRT_PRICE;
		subtotal += (chiefsLetters + eaglesLetters + superBowlLetters) * LETTER_PRICE;

		// Calculate tax
		double tax = subtotal * SALES_TAX_RATE;

		// Calculate shipping cost
		double shippingCost = subtotal * SHIPPING_COST;

		// Calculate total
		double total = subtotal + tax + shippingCost;

		// Display order summary
		System.out.println("\nOrder Summary");
		System.out.println("Chiefs T-shirts " + chiefsShirts);
		System.out.println("Chiefs Printed letters " + chiefsLetters);
		System.out.println("Eagles T-shirts " + eaglesShirts);
		System.out.println("Eagles Printed letters " + eaglesLetters);
		System.out.println("Super Bowl T-shirts " + superBowlShirts);
		System.out.println("Super Bowl Printed letters " + superBowlLetters);
		System.out.printf("Subtotal $%.2f%n", subtotal);
		System.out.printf("Tax $%.2f%n", tax);
		System.out.printf("Shipping Cost $%.2f%n", shippingCost);
		System.out.printf("Total $%.2f%n", total);
		System.out.println("\nThis order will be shipped to:");
		System.out.printf("%s %s%n", firstName, lastName);
		System.out.println(streetNum + streetAddress);
		System.out.printf("%s, %s %s%n", city, state, zipCode);

	}

}
