package com.zensar.classobjectpro;

class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		this.day = 9;
		this.month = 12;
		this.year = 2021;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void print() {
		System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
	}

	/*
	 * public static void swap(Date d1, Date d2) { Date temp;
	 * 
	 * temp = d1; d1 = d2; d2 = temp;
	 * 
	 * System.out.println("Date1 ="); d1.print();
	 * 
	 * System.out.println("Date2 ="); d2.print(); }
	 */

	//Swapping between 2 dates
	public static Date[] swap(Date[] date) {
		// TODO Auto-generated method stub
		Date temp;

		temp = date[0];
		date[0] = date[1];
		date[1] = temp;
		
		return date;

//		System.out.println("Date1 =");
//		d1.print();
//		
//		System.out.println("Date2 =");
//		d2.print();
		
	
	}

}

public class DateTest {

	public static void main(String[] args) {
		Date date[] = new Date[2];
		date[0] = new Date(9,12, 2021);
		date[1] = new Date(1,5,2001);
		
		date = Date.swap(date);
		date[0].print();
		date[1].print();
		
//		Date d1 = new Date();
//		Date d2 = new Date(01, 05, 2000);
//		Date.swap(d1, d2);
//		d1.print();
//		d2.print();
	}
}
