package bonus20Collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Hashtable;
import java.util.Enumeration;


public class ShoppingList {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String input;
		System.out.print("Welcome to Guenther's Market!");
		 	System.out.println("What item would you like to order anything else? y/n");
		  String input = scnr.nextLine();
		  System.out.println("Would you like to order anything else y/n?");
		  String input = scnr.nextLine();
		  System.out.println("Thank you for your order!");
		  String input = scnr.nextLine();
		  System.out.println("Average price per order was: ");
		   

		List<String>list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cauliflower");
		list.add("dragonfruit");
		list.add("elderberry");
		list.add("figs");
		list.add("grapefruit");
		list.add("honeydew");
	
	}

	private static void nameAndPrice(double balance) {
		double balance;
		
	 
	  
	   Hashtable<String, Double> hashtable = 
	              new Hashtable<String, Double>();
	   
	   hashtable.put("apple", 0.99);
	   hashtable.put("banana", 0.59);
	   hashtable.put("cauliflower", 1.59);
	   hashtable.put("dragonfruit", 2.19);
	   hashtable.put("elderberry", 1.79);
	   hashtable.put("figs", 2.09);
	   hashtable.put("grapefruit", 1.99);
	   hashtable.put("honeydew", 3.49);
	}
	   
	private static boolean userContinue(String userInput) {
		boolean shouldContinue = true; 
				Object list;
				for (String colors : list) {
					System.out.println(list);
				}
	}
	
	private static boolean isValid(String userResponse) {
		boolean isValid = true;
		String userResponse;
		
					
					
				while (shouldContinue) {
					
					System.out.println("Would you like to order anything else? (y/n)");
						String userResponse = scnr.next();
						shouldContinue = userResponse.equals("y");
					}
	}
	 
	

		
	
	}

		
	}
		
//java.util.Map<String, Double> fruits = new HashMap<>();
//fruits.put("apple", 0.99);
//fruits.put("banana", 0.59);
//fruits.put("cauliflower", 1.59);
//fruits.put("dragonfruit", 2.19);
//fruits.put("elderberrry", 1.79);
//fruits.put("figs", 2.09);
//fruits.put("grapefruit", 1.99);
//fruits.put("honeydew", 3.49);
//
//
//System.out.println(fruits);