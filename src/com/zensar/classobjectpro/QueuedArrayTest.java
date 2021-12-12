package com.zensar.classobjectpro;

class QueuedArray {

	private int ary[];
	private int front;
	private int rear;
	private int currentSize;

	public QueuedArray() {
		this.ary = new int[10];
		this.front = 0;
		this.rear = -1;
	}

	public QueuedArray(int[] ary, int front, int rear, int currentSize) {
		super();
		this.ary = ary;
		this.front = front;
		this.rear = rear;
		this.currentSize = currentSize;
	}

	// This method is used for adding element in the queue
	public void push(int element) {
		if (!isFull()) {
			rear++;
			if (rear == this.ary.length - 1) {
				rear = 0;
			}
			ary[rear] = element;
			currentSize++;
			System.out.println("New Pushed Element in queue = " + element);
		} else {
			System.out.println("Queue is full!!");
		}
	}

	// This method is used for removes an element from the front of the queue
	public void pop() {
		if (!isEmpty()) {
			front++;
			if (front == this.ary.length - 1) {
				System.out.println("Poped Element from the queue = " + ary[front - 1]);
				front = 0;
			} else {
				System.out.println("Poped Element from the queue = " + ary[front - 1]);
			}
			currentSize--;

		} else {
			System.out.println("Queue is empty!!");
		}
	}

	// Check size of array is reach to max value
	public boolean isFull() {
		if (currentSize == this.ary.length - 1) {
			return true;
		}
		return false;
	}

	// Check array is empty or not
	public boolean isEmpty() {

		if (currentSize == 0) {
			return true;
		}
		return false;
	}

}

public class QueuedArrayTest {

	public static void main(String[] args) {
		QueuedArray queuedArray = new QueuedArray();
		queuedArray.pop();
		System.out.println("----------PUSH/enqueue Operation performed---------");
		queuedArray.push(1);
		queuedArray.push(2);
		queuedArray.push(3);
		queuedArray.push(4);
		queuedArray.push(5);
		queuedArray.push(6);
		queuedArray.push(7);
		queuedArray.push(8);
		queuedArray.push(9);
		queuedArray.push(10);
		queuedArray.push(11);
		System.out.println("----------POP/dequeue Operation performed---------");
		queuedArray.pop();
		queuedArray.pop();
		queuedArray.pop();
		System.out.println("-------------------------------------------");
	}
}
