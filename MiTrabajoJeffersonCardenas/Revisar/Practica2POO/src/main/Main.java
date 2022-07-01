package main;

import Entity.*;

public class Main {
	
	public static void main(String[] args) {
		
		//Employees
		Person emp1 = new Employee("Toretto", 30);
		Person emp2 = new Employee("Tony", 45);
		Person emp3 = new Employee("Ada", 36);
		Person emp4 = new Employee("Margaret", 25);
		
		//Customers
		Person cust1 = new Customer("Bach", 30);
		Person cust2 = new Customer("Corey", 40);
		Person cust3 = new Customer("Leonardo", 56);
		Person cust4 = new Customer("Chopin", 47);
		
		//Hotel
		Hosting hotel = new Hotel(1, 1);
		
		//Hut
		Hosting hut = new Hut(1, 200);
		
		//add employee to Hotel
		hotel.addPerson(emp1);
		hotel.addPerson(emp2);
		
		//add customer to hotel
		hotel.addPerson(cust1);
		hotel.addPerson(cust2);
		
		//add employee to Hut
		hut.addPerson(emp3);
		hut.addPerson(emp4);
		
		//add customer to hut
		hut.addPerson(cust3);
		hut.addPerson(cust4);
		
		System.out.println("**********************************");
		hotel.resume();
		
		System.out.println("**********************************");
		hut.resume();
		
	}
}
