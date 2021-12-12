package com.zensar.execptions;

class TryCatch {

}

public class TryCatchTest {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
			
			//Inner Try Block
			try {
				System.out.println("NullPointer Exception...");
				String b = null;
			}
			// catch block of inner try block
			catch (NullPointerException e) {
				System.out.println(e);
			}
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception");
		} catch (Exception e) {
			System.out.println("Parent Exception");
		} finally {  
			System.out.println("finally block is always executed");  
		}    

		System.out.println("Handle the execption and continue rest of the code...");
	}
}
