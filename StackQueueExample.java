package com.hackerrank.chalanges;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackQueueExample {
	
	Stack<Character> myStack = new Stack<Character>();
	Queue<Character> myQueue = new LinkedList<Character>();
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StackQueueExample p = new StackQueueExample();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

	private Object dequeueCharacter() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object popCharacter() {
		// TODO Auto-generated method stub
		return null;
	}

	private void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		
	}
	private void pushCharacter(char c) {
		// TODO Auto-generated method stub
		
	}
}


