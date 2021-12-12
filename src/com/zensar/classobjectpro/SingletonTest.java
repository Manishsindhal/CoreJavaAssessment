package com.zensar.classobjectpro;

class Singleton {

	private static Singleton SINGLE_INSTANCE = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (SINGLE_INSTANCE == null) {
			SINGLE_INSTANCE = new Singleton();
		}
		return SINGLE_INSTANCE;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		Singleton singletonInstance1 = Singleton.getInstance();
		Singleton singletonInstance2 = Singleton.getInstance();
		Singleton singletonInstance3 = Singleton.getInstance();

		System.out.println("Hashcode of singletonInstance1 is " + singletonInstance1.hashCode());
		System.out.println("Hashcode of singletonInstance2 is " + singletonInstance2.hashCode());
		System.out.println("Hashcode of singletonInstance3 is " + singletonInstance3.hashCode());
		System.out.println("All objects point to the same memory location on the heap for same object");
	}
}
