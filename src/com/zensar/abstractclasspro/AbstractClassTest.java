package com.zensar.abstractclasspro;

/*1. Test the following principles of an abstract class:

· If any class has any of its method abstract then you must declare entire class abstract.

· Abstract class cannot be instantiated.

· When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

· Abstract class cannot be private.

· Abstract class cannot be final.

· You can declare a class abstract without having any abstract method.*/
abstract class AbstractClass {

	abstract void run();

	void sum() {
		int i = 2 + 3;
		System.out.println("sum = " + i);
	}
}

public class AbstractClassTest {
	
	public static void main(String[] args) {
		AbstractClass abstractClass = new AbstractClass() {
			
			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("wow");
			}
		};
		
		abstractClass.run();
		abstractClass.sum();
	}
	
}
