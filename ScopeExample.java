package com.hackerrank.chalanges;

import java.util.Scanner;

public class ScopeExample {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference {
  	private int[] elements=new int[10];
  	public int maximumDifference;
  	int min = 0;
    int max=0;
  	public Difference(int[] a)
  	{
  		elements = a;
  	}
  	
  	public void computeDifference()
  	{
  		max = elements[0];
        min = elements[0];
  		for (int i = 0; i < elements.length; ++i) {
            min = Math.min(min, elements[i]);
            max = Math.max(max, elements[i]); 			
  		}
        maximumDifference = max - min;
  	}
}
