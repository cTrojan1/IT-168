/*
 * Created on: Feb 8, 2023
 *
 * ULID: cqtroja
 * Class: IT 168 
 */
package edu.ilstu;

import java.text.DecimalFormat;
/**
 * <insert class description here>
 *
 * @author Cameron Trojan
 *
 */
import java.util.Random;
import java.util.Scanner;

public class StoryTime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		DecimalFormat df = new DecimalFormat(".00");

		System.out.println("Enter first and last name: ");
		String fullName = sc.nextLine();

		System.out.println("Enter an age under 18: ");
		int theAge = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter a city: ");
		String theCity = sc.nextLine();

		System.out.println("Enter a college: ");
		String theCollege = sc.nextLine();

		System.out.println("Enter a profession: ");
		String theProfession = sc.nextLine();

		System.out.println("Enter a tax rate between 10% and 25% (.nn): ");
		double theTaxRate = sc.nextDouble();

		sc.nextLine();

		System.out.println("Enter a type of animal: ");
		String theAnimal = sc.nextLine();

		System.out.println("Enter a pet name: ");
		String thePetName = sc.nextLine();

		String firstName = fullName.split(" ")[0];
		String lastName = fullName.split(" ")[1];

		int theWage = rand.nextInt(10, 20 + 1);
		int theSalary = theWage * 2080;

		double totalTaxes = theTaxRate * theSalary;
		double theNetWage = theSalary - theTaxRate;

		df.format(theNetWage);
		df.format(theSalary);

		theTaxRate = theTaxRate * 100;

		String s1 = new String("There once was a person named " + fullName + " who lived in " + theCity + ".");
		String s2 = new String("Even though " + firstName + " was only " + theAge + ", " + firstName
				+ " went to college at " + theCollege + ".");
		String s3 = new String(firstName + " graduated and went to work as a(n) " + theProfession + ".");
		String s4 = new String(
				fullName + " was paid $" + theWage + " per hour, which is $" + theSalary + " each year.");
		String s5 = new String(firstName + " tax rate was " + theTaxRate + "%.");
		String s6 = new String(firstName + " paid $" + totalTaxes + " in taxes which left " + fullName + " with $"
				+ theNetWage + " to spend.");
		String s7 = new String(
				"Soon thereafter, " + firstName + " adopted a(n) " + theAnimal + " named " + thePetName + ".");
		String s8 = new String(thePetName + " and " + fullName + " both lived happily ever after!");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);

		int a1 = s1.lastIndexOf(" ");
		int a2 = s2.lastIndexOf(" ");
		int a3 = s3.lastIndexOf(" ");
		int a4 = s4.lastIndexOf(" ");
		int a5 = s5.lastIndexOf(" ");
		int a6 = s6.lastIndexOf(" ");
		int a7 = s7.lastIndexOf(" ");
		int a8 = s8.lastIndexOf(" ");

		int A1 = s1.length() - 1;
		int A2 = s2.length() - 1;
		int A3 = s3.length() - 1;
		int A4 = s4.length() - 1;
		int A5 = s5.length() - 1;
		int A6 = s6.length() - 1;
		int A7 = s7.length() - 1;
		int A8 = s8.length();

		System.out.println();

		System.out.print("The new string is: ");
		System.out.print(s1.substring(a1, A1));
		System.out.print(s2.substring(a2, A2));
		System.out.print(s3.substring(a3, A3));
		System.out.print(s4.substring(a4, A4));
		System.out.print(s5.substring(a5, A5));
		System.out.print(s6.substring(a6, A6));
		System.out.print(s7.substring(a7, A7));
		System.out.print(s8.substring(a8, A8));

	}

}
