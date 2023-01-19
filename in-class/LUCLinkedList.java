package javaprojectluc;
import java.io.*; 

class Node { 

       int data; 
       Node next;  
       Node(int d) // Constructor
       { 
               data = d; 
               next = null; 
       } 
} 

public class LUCLinkedList {// a Singly Linked List 
	Node head; // head of list  
	public static LUCLinkedList insert(LUCLinkedList list, int data) // Method to insert a new node
	{ 
		Node new_node = new Node(data); // Create a new node with given data
		new_node.next = null; 
		if (list.head == null) { // If the Linked List is empty, then make the new node as head
			list.head = new_node; 
		} 
		else {// Else traverse till the last node and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			}
			last.next = new_node; // Insert the new_node at last node
		}
		return list; 
	}

	public static void printList(LUCLinkedList list) // Method to print the LinkedList.
	{ 
		Node currNode = list.head; 
		System.out.print("LinkedList: "); 
		while (currNode != null) { // Traverse through the LinkedList 
			System.out.print(currNode.data + " "); // Print the data at current node
			currNode = currNode.next; // Go to next node 
		} 
	} 

	/*
	 * write a method that adds all the data values stored in a list (sum)
	 */

	 public static int sum (LUCLinkedList list) {
		int sum = 0;
		//start at head
		Node currentNode = list.head;
		while (currentNode != null) {
			// traverse and add
			sum += currentNode.data;
			// point to next element
			currentNode = currentNode.next;
		}
		System.out.print("The sum of the list is: ");
		return sum;
	 }
	 
	 /*
	  * write a method that finds the maximum value

	  */
	  public static int maxValue (LUCLinkedList list) {

		int max = Integer.MIN_VALUE;
		Node currNode = list.head;
		
		while (currNode != null){
			if (currNode.data >= max){
				max = currNode.data;
			}
			currNode = currNode.next;
		}
		System.out.println("\nMax Element: " + max);
		return max;
		//System.out.print("Max Element is: " + max);
	  }

	  public static void evenIndex (LUCLinkedList list) {
		Node currentHead = list.head;
		System.out.print("Even element is ");
		// while list is not null, traverse
		while (currentHead != null) {
			// find even index, if remainder is % 2 (or remainder is 0)
			if (currentHead.data % 2 == 0){
				System.out.print(currentHead.data + " ");
			}
			currentHead = currentHead.next;
		}
	  }

	  public static void removeInput (LUCLinkedList list, int input) {

		System.out.println("Linked list without " + input);

		Node currNode = list.head;

		while (currNode != null) {
			
			if (currNode.data != input) {
				//if not equal to input, move on to the next
				currNode = currNode.next;
				System.out.println(currNode.data);
			}
		}
	  }

	public static void main(String[] args) 
	{ 
		LUCLinkedList list = new LUCLinkedList();/* Start with the empty list. */ 
                // Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4);
		printList(list); // Print the LinkedList

		System.out.println();
		System.out.println(sum(list));

		evenIndex(list);
		maxValue(list);
		
		
	} 
} 

