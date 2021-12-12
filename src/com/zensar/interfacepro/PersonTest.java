package com.zensar.interfacepro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
	private String name;
	private int height_in_inches;
	private double weight;

	public Person() {
	}

	public Person(String name, int height_in_inches, double weight) {
		super();
		this.name = name;
		this.height_in_inches = height_in_inches;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight_in_inches() {
		return height_in_inches;
	}

	public void setHeight_in_inches(int height_in_inches) {
		this.height_in_inches = height_in_inches;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height_in_inches=" + height_in_inches + ", weight=" + weight + "]";
	}

}

class SortByName implements Comparator<Person> {

	@Override
	public int compare(Person person_1, Person person_2) {
		// TODO Auto-generated method stub
		return person_1.getName().compareTo(person_2.getName());
	}

}

class SortByHight implements Comparator<Person> {

	@Override
	public int compare(Person person_1, Person person_2) {
		// TODO Auto-generated method stub
		return person_1.getHeight_in_inches() - person_2.getHeight_in_inches();
	}

}

class SortByWeight implements Comparator<Person> {

	@Override
	public int compare(Person person_1, Person person_2) {
		// TODO Auto-generated method stub
		// return person_1.getWeight() - person_2.getWeight();
		if (person_1.getWeight() < person_2.getWeight())
			return -1;
		if (person_1.getWeight() > person_2.getWeight())
			return 1;
		else
			return 0;
	}

}

public class PersonTest {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();

		// Adding entries in above List
		// using add() method
		personList.add(new Person("Jhon", 5, 56.80));
		personList.add(new Person("Smith", 4, 56.46));
		personList.add(new Person("Hritik", 6, 78.55));
		personList.add(new Person("Veer", 7, 78.40));

		System.out.println("Unsorted Person List");

		for (int i = 0; i < personList.size(); i++)
			System.out.println(personList.get(i));

		// Sorting person list by name
		Collections.sort(personList, new SortByName());

		System.out.println("\nSorted by person name");
		for (int i = 0; i < personList.size(); i++)
			System.out.println(personList.get(i));

		// Sorting person list by height_in_inches
		Collections.sort(personList, new SortByHight());

		System.out.println("\nSorted by person height");
		for (int i = 0; i < personList.size(); i++)
			System.out.println(personList.get(i));

		// Sorting person list by weight
		Collections.sort(personList, new SortByWeight());

		System.out.println("\nSorted by person weight");
		for (int i = 0; i < personList.size(); i++)
			System.out.println(personList.get(i));
	}
}
