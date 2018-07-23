package com.hackerrank.chalanges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxCalc {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long sum =0;
    	long[] iArray = new long[arr.length];
        for(int i=0; i< arr.length;i++)
        {
	    	sum =0;
        	for (int j = 0; j < arr.length; j++) {
	            sum += arr[j];           
	        }
	    	iArray[i] = sum - arr[i];
	    	//System.out.println(iArray[i]);
        }
        Arrays.sort(iArray);
        System.out.print(iArray[0]);
        System.out.print(" ");
        System.out.print(iArray[arr.length-1]);
       
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}