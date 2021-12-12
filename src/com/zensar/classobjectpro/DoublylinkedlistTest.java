package com.zensar.classobjectpro;

class Doublylinkedlist {

	Node head;

	Doublylinkedlist() {
	}

	class Node {
		int data;
		Node prev;
		Node next;

		// Constructor to create a new node
		// next and previous is by default initialized as null
		Node(int d) {
			data = d;
		}
	}

	// Adding a node at the front of the list
	public void push(int new_data) {

		Node new_Node = new Node(new_data);

		new_Node.next = head;
		new_Node.prev = null;

		/* 4. change prev of head node to new node */
		if (head != null)
			head.prev = new_Node;

		/* 5. move the head to point to the new node */
		head = new_Node;
	}

	// Function to delete a node in a Doubly Linked List.
	void deleteNode(Node del) {

		if (head == null || del == null) {
			return;
		}

		// If node to be deleted is head node
		if (head == del) {
			head = del.next;
		}

		// Change next only if node to be deleted
		// is NOT the last node
		if (del.next != null) {
			del.next.prev = del.prev;
		}

		// Change prev only if node to be deleted
		// is NOT the first node
		if (del.prev != null) {
			del.prev.next = del.next;
		}

		return;
	}

	// print linked list
	public void printlist(Node node) {
		Node last = null;

		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}

		System.out.println();
	}

	// print linked list
	public int count() {
		int counter = 0;
		Node current = head;

		while (current != null) {
			counter++;
			current = current.next;
		}

		return counter;
	}
}

public class DoublylinkedlistTest {

	public static void main(String[] args) {
		Doublylinkedlist doublylinkedlist = new Doublylinkedlist();

		// Add node
		doublylinkedlist.push(1);
		doublylinkedlist.push(2);
		doublylinkedlist.push(3);
		doublylinkedlist.push(4);
		doublylinkedlist.push(5);

		System.out.print("Created list is: ");
		doublylinkedlist.printlist(doublylinkedlist.head);
		
		System.out.println("\n---------Count of nodes present in the list = " + doublylinkedlist.count());  

		// Deleting first node
		doublylinkedlist.deleteNode(doublylinkedlist.head);
		System.out.print("\nList after deleting first node: ");
		doublylinkedlist.printlist(doublylinkedlist.head);
		
		System.out.println("\n---------Count of nodes present in the list = " + doublylinkedlist.count());

		// Deleting middle node
		doublylinkedlist.deleteNode(doublylinkedlist.head.next.next);
		System.out.print("\nList after Deleting middle node: ");
		doublylinkedlist.printlist(doublylinkedlist.head);
		
		System.out.println("\n---------Count of nodes present in the list = " + doublylinkedlist.count());  
	}

}
