package com.hackerrank.chalanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
	
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       int length = in.nextInt();       
	       List<Integer> numberlist = new ArrayList<Integer>();        
	       for(int i=0;i<length;i++)
	       {
	        	numberlist.add(in.nextInt());       	
	       }
	       
	        int qn = in.nextInt();
	        String[] query = new String[qn];
	        for(int j=0;j<qn;j++)
	        {
	            query[j] = in.next();
	            if(query[j].equalsIgnoreCase("Insert"))
	            {
	                int iposition = in.nextInt();
	                int element = in.nextInt();
	                numberlist.add(iposition, element);
	            }       
	            if(query[j].equalsIgnoreCase("Delete"))
	            {
	                int dposition = in.nextInt();
	                numberlist.remove(dposition);
	            }
	        }
	        for(int k=0;k<numberlist.size();k++)
	        {
	        	System.out.print(numberlist.get(k) + " ");
	        }
	    }

}
