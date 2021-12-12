package com.zensar.classobjectpro;

class StackedArray {
	int ary[];
	int top;

	public StackedArray() {
		this.ary = new int[10];
		this.top = -1;
	}

	public StackedArray(int[] ary) {
		super();
		this.ary = ary;
	}

	// perform push operation this will increase the size of array
	public void push(int element) {
		if (!isFull()) {
		top++;
		ary[top] = element;
		System.out.println("New Pushed Element =" + element);
		} else {
            System.out.println("Stack is full !");
        }
	}

	// perform pop operation this will decrees the size of array
	public int pop() {
		if (!isEmpty()) {
			int popElement = top;
			top--;
			System.out.println("Poped Element =" + ary[popElement]);
			return ary[popElement];
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}

	// Check array is empty or not
	public boolean isEmpty() {
		return (top == -1);
	}
	
	// Check size of array is reach to max value
	public boolean isFull() {
        return (this.ary.length - 1 == top);
    }
}

public class StackedArrayTest {

	public static void main(String[] args) {
		StackedArray stackedArray = new StackedArray();
		stackedArray.pop();
        System.out.println("----------PUSH Operation performed---------");
        stackedArray.push(1);
        stackedArray.push(2);
        stackedArray.push(3);
        stackedArray.push(4);
        stackedArray.push(5);
        stackedArray.push(6);
        stackedArray.push(7);
        stackedArray.push(8);
        stackedArray.push(9);
        stackedArray.push(10);
        stackedArray.push(11);
        System.out.println("----------POP Operation performed---------");
        stackedArray.pop();
        stackedArray.pop();
        stackedArray.pop();
        System.out.println("-------------------------------------------");
	}
}
