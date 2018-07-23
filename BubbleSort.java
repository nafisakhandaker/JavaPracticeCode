package com.hackerrank.chalanges;

import java.util.Scanner;

public class BubbleSort {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int numberOfSwaps = 0;
	        int temp = 0;
	        for (int j = 0; j < a.length ; j++) {
	            // Swap adjacent elements if they are in decreasing order
	            if (a[j] > a[j + 1]) {
	                temp = a[j];
	                a[j] = a[j + 1];
	                a[j + 1] = temp;
	                temp=0;
	                numberOfSwaps++;
	            }
	        }
	        System.out.println("Array is sorted in " + numberOfSwaps+ " swaps.");
	        System.out.println("First Element: " + a[0]);
	        System.out.println("Last Element: " + a[n-1]);
	    }

}
