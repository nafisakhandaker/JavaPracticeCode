package com.hackerrank.chalanges;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementCount {
	
	 public static void main(String[] args) {
	        
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] intarray= new int[n];
	        for(int i=0;i<n;i++){
	            intarray[i]=sc.nextInt();
	        }
	        int count=0;
	        for(int j=0;j<n;j++){
	            int sum=0;
	            for(int k=j;k<n;k++){
	                sum=intarray[k]+sum;
	                if(sum<0){
	                    count++;
	                }
	            }
	        }
	        System.out.println(count);       	        
	    }

}
