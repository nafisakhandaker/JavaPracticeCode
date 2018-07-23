package com.hackerrank.chalanges;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedListExample {
	
	public static  Node insert(Node header,int data) {
        Node ret = header;

       // check base case, header is null.
       if (header == null) {
           return new Node(data);
       }

       // loop until we find the end of the list
       while ((header.next != null)) {
           header = header.next;
       }

       // set the new node to the Object data, next will be null.
       header.next = new Node(data);
       return ret;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }


}
