package com.employee;

import java.util.Scanner;
public class Employee {
	private String id = null;
	private String name = null;
	private String addrs = null;
	private int sal = 0;
	
	void getData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee ID:  ");
		id = sc.next();
		System.out.println("Name:Avinash kumar anand");
		name = sc.next();
		System.out.println("Address:Bihar");
		addrs = sc.next();
		System.out.println("Salary:21200");
		sal = sc.nextInt();
	}
	
	void displayData() {
		System.out.println("Employee ID:  "+id);
		System.out.println("Name:Avinash kumar anand"+name);
		System.out.println("Address:Bihar"+addrs);
		System.out.println("Salary:21200"+sal);
	}
}