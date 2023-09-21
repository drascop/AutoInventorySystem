package edu.ilstu;

import java.util.Scanner;

public class AutoInventory {

	public static void displayMenu() {
		System.out.print("      Welcome to Dan's Auto Inventory System!\n1. Display Sedans\n2. Display SUVs"
					+ "\n3. Display Trucks\n4. Filter by MSRP\n5. Quit\nEnter Selection: ");
	}
	
	public static void main(String[] args) {
		Auto[] Inventory = new Auto[10];
		Inventory[0] = new SUV("7.87E+09", "BMW", "X3", 2020, 65000, false);
		Inventory[1] = new Sedan("2.95E+09", "Toyota", "Camry", 2009, 21000, 5);
		Inventory[2] = new Truck("6.12E+09", "Ford", "F-150", 2007, 35000, 5000);
		Inventory[3] = new SUV("3.09E+09", "Toyota", "Land Cruiser", 2021, 86000, true);
		Inventory[4] = new Sedan("4.65E+09", "Audi", "A8", 2010, 80000, 4);
		Inventory[5] = new Truck("8.24E+09", "GMC", "Sierra", 2021, 60000, 20000);
		Inventory[6] = new Sedan("5.47E+09", "Hyundai", "Elantra", 2018, 24500, 5);
		Inventory[7] = new SUV("6.83E+09", "Mazda", "CX-5", 2019, 27000, false);
		Inventory[8] = new Truck("2.71E+09", "Toyota", "Tacoma", 2017, 55000, 18500);
		Inventory[9] = new Sedan("6.05E+09", "Honda", "Accord", 2022, 25850, 5);
		
		boolean run = true;
		
		while(run) {
			displayMenu();
			Scanner in = new Scanner(System.in);
			if(in.hasNextInt()) { //checks input is an Int before running
				
				int selection = in.nextInt();
				if(selection > 5 || selection < 1 ) {
					System.out.print("Error. Please enter an integer from 1-5:");
					Scanner secondTry = new Scanner(System.in); 
					selection = secondTry.nextInt(); }

				if (selection <6 && selection >0)
					switch(selection) {
						case 1: for(int i=0; i<Inventory.length; i++) 
									if (Inventory[i].getType() == "Sedan")
										System.out.println("\n"+Inventory[i].toString());
								System.out.println();
						break;
					 
						case 2: for(int i=0; i<Inventory.length; i++) 
									if (Inventory[i].getType() == "SUV")
										System.out.println("\n"+Inventory[i].toString());
								System.out.println();
						break;
					 
						case 3: for(int i=0; i<Inventory.length; i++) 
									if (Inventory[i].getType() == "Truck")
										System.out.println("\n"+Inventory[i].toString());
								System.out.println();
						break;
					 
						case 4: System.out.print("Please enter your maximum price as a whole number: ");
							int filterPrice = in.nextInt();
							boolean noneFound = true;
							int carsFound=0;
							
							for(int i=0; i<Inventory.length; i++) {
								if(Inventory[i].calcMSRP() <= filterPrice) {
									System.out.println("\n"+Inventory[i].toString());
									carsFound++;
									noneFound = false;
								}
							} 
							if(noneFound==true) 
								System.out.println("Sorry, we couldn't find any cars under your budget.\n");
							else
								System.out.println("\nWe found "+carsFound+" cars under your budget!\n");
							
							
						break;
					  
						case 5: System.out.println("Thank you for using Dan's Auto Inventory System. Have a nice day!");
								run = false;
						break;
					
					} 		 	
				else { //if input is not an Int
				   	System.out.println("Your input must be an integer. Please try again.\n");
				}
			}
			
		}
	
	}
}
