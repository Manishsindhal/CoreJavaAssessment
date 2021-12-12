package com.zensar.interfacepro;

interface Printable {
	void print();
}

class Employee implements Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print method of Employee");
	}
	
}

class Circle implements Printable {

	@Override
	public void print() {
		System.out.println("Print method of Circle");
	}
	
}

public class PrintableTest {

	public static void main(String[] args) {
		
		Printable printable[] = new Printable[2];
		printable[0] = new Employee();
		printable[1] = new Circle();
		
		printAll(printable);
	}

	/*
	 * This method is used to execute all print() of all interface that you have o
	 * create
	 */
	private static void printAll(Printable[] printable) {
		for (int i = 0; i < printable.length; i++) {
			printable[i].print();
		}
	}
}
