package com.zensar.classobjectpro;

class ComplexNumber {
	private int realPart;
	private int imaginaryPart;

	public ComplexNumber() {
	}

	public ComplexNumber(int realPart, int imaginaryPart) {
		super();
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public int getRealPart() {
		return realPart;
	}

	public void setRealPart(int realPart) {
		this.realPart = realPart;
	}

	public int getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(int imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	public void printComplexNumber() {
		System.out.println("Complex number: " + realPart + " + " + imaginaryPart + "i");
	}

	//Addition of complex number
	public ComplexNumber addComplexNumber(ComplexNumber cn1, ComplexNumber cn2) {
		ComplexNumber temp = new ComplexNumber();

		// adding real part of complex numbers
		temp.realPart = cn1.realPart + cn2.realPart;

		// adding Imaginary part of complex numbers
		temp.imaginaryPart = cn1.imaginaryPart + cn2.imaginaryPart;

		return temp;
	}

	//Subtraction of complex number
	public ComplexNumber subtractComplexNumber(ComplexNumber cn1, ComplexNumber cn2) {
		ComplexNumber temp = new ComplexNumber();

		// subtract real part of complex numbers
		temp.realPart = cn1.realPart - cn2.realPart;

		// subtract Imaginary part of complex numbers
		temp.imaginaryPart = cn1.imaginaryPart - cn2.imaginaryPart;

		return temp;
	}

	//Multiplication of complex number
	public ComplexNumber multiplyComplexNumber(ComplexNumber cn1, ComplexNumber cn2) {
		ComplexNumber temp = new ComplexNumber();

		// multiply real part of complex numbers
		temp.realPart = cn1.realPart * cn2.realPart;

		// multiply Imaginary part of complex numbers
		temp.imaginaryPart = cn1.imaginaryPart * cn2.imaginaryPart;

		return temp;
	}

	//Swapping between 2 complex numbers
	public static ComplexNumber[] swapComplexNumber(ComplexNumber[] cn) {

		ComplexNumber temp;

		temp = cn[0];
		cn[0] = cn[1];
		cn[1] = temp;

		return cn;
	}
}

public class ComplexNumberTest {

	public static void main(String[] args) {
		ComplexNumber[] cn = new ComplexNumber[2];
		ComplexNumber cn1 = new ComplexNumber(2, 3);
		ComplexNumber cn2 = new ComplexNumber(4, 5);
		ComplexNumber cn3 = new ComplexNumber();

		// for swapping
		cn[0] = cn1;
		cn[1] = cn2;

		cn1.printComplexNumber();
		cn2.printComplexNumber();

		//Addition of complex number
		cn3 = cn3.addComplexNumber(cn1, cn2);
		System.out.println("Sum of Complex Number is =");
		cn3.printComplexNumber();

		//Subtraction of complex number
		cn3 = cn3.subtractComplexNumber(cn1, cn2);
		System.out.println("Subtraction of Complex Number is =");
		cn3.printComplexNumber();

		//Multiplication of complex number
		cn3 = cn3.multiplyComplexNumber(cn1, cn2);
		System.out.println("Multiplication of Complex Number is =");
		cn3.printComplexNumber();

		//Swapping between 2 complex numbers
		cn = ComplexNumber.swapComplexNumber(cn);
		System.out.println("Swapping between 2 complex numbers is =");
		cn[0].printComplexNumber();
		cn[1].printComplexNumber();
	}
}
