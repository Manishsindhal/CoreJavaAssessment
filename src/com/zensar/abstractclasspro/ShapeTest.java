package com.zensar.abstractclasspro;

abstract class Shape {
	abstract void draw();
}

class Line extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Type of Shape is = Line");
	}
	
}

class Rectangle extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Type of Shape is = Rectangle");
	}
	
}

class Cube extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Type of Shape is = Cube");
	}
	
}

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape;
		
		shape = new Line();
		shape.draw();
		
		shape = new Rectangle();
		shape.draw();
		
		shape = new Cube();
		shape.draw();
	}
}
