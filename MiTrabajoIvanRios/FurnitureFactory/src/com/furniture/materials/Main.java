
package com.furniture.materials;

import java.util.*;

public class Main {
	public static int intId = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		mainMenu();
	}

	public static void loadMaterials() {
		//
		Material pine = new WoodPiece("Pine", 40);
		Material philips = new Screw("Philips", 2);
		Material glue = new Glue("Glue", 30);
		Material fiveHSandpaper = new Sandpaper("Five Hundred Sandpaper", 500);
		Material polyesterRedPaint = new Painting("Polyester Red Paint", 1);
		Material mateVarnish = new Varnish("Varnish Mate Mode", 0.375);

		Material oak = new WoodPiece("Oak", 85);
		Material carob = new WoodPiece("Carob", 65);
		Material drywall = new Screw("Drywall", 4);
		Material gum = new Glue("Gum", 45);
		Material oneHTwentySandpaper = new Sandpaper("One Hundred Twenty Sandpaper", 120);
		Material polyesterBluePaint = new Painting("Polyester Blue Paint", 2);
		Material shinningVarnish = new Varnish("Varnish Shinning Mode", 0.625);

	}

	public static void mainMenu() {
		loadMaterials();
		int option;
		do {
			System.out.println("------ Furniture's Factory ------");
			System.out.println("------------ Main Menu ----------");
			System.out.println("1. Make Table");
			System.out.println("2. Make Chair");
			System.out.println("3. Make Bed");
			System.out.println("4. Exit");
			System.out.println("Please, enter your option: ");
			option = sc.nextInt();
			switch (option) {
			case 1:
				createProduct("Table");
				break;
			case 2:
				createProduct("Chair");
				break;
			case 3:
				createProduct("Bed");
				break;
			case 4:
				System.out.println("Thanks for all. Bye!");
				break;
			default:
				System.out.println("Wrong option... Please verify your typing!");
				break;
			}
		} while (option != 4);

	}

	public static void createProduct(String name) {
		Product product = new Product(intId, name);
		intId++;
		System.out.println("Product " + product.getName() + " was created successfully with the id #" + product.getId());
		System.out.println("Let's go to the next stage");
		assembleBuildMenu(product);
	}

	public static void assembleBuildMenu(Product product) {
		int option,intPrint;
		do {
			intPrint=0;
			System.out.println("------ Furniture's Factory ------");
			System.out.println("------- AssembleBuild Menu ------");
			for (int index = 0; index < Storage.lstStored.size(); index++) {
				if (Storage.lstStored.get(index).getClassName().equals("WoodPiece")) {
					intPrint++;
					System.out.println(intPrint + ". " + Storage.lstStored.get(index).material.name);
				}
			}
			intPrint++;
			System.out.println(intPrint + ". Exit");
			System.out.println("Please, enter your option: ");
			option = sc.nextInt();
			switch(option) {
				
			}
		} while (option!=intPrint);
	}
}
