package com.hackerrank.chalanges;

import java.util.Scanner;

/*
 * You are required to compute the power of a number by implementing a calculator. 
 * Create a class MyCalculator which consists of a single method long power(int, int). 
 * This method takes two integers, n and p, as parameters and finds n power. If either or  is negative, 
 * then the method must throw an exception which says "n or p should not be negative". 
 * Also, if both n and p are zero, then the method must throw an exception which says "n and p should not be zero"
 * For example, -4 and -5 would result in java.lang.Exception: n or p should not be negative.
 * Complete the function power in class MyCalculator and return the appropriate result after the power operation 
 * or an appropriate exception as detailed above.
 * 
 * Input Format
 * Each line of the input contains two integers, n and p. The locked stub code in the editor reads the input and sends 
 * the values to the method as parameters.
 * 
 * 
 */
public class ExceptionExample2 {
	
	public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {
	
	/*
	 * Create the method long power(int, int) here.
	*/
	public long power(int n, int p) throws Exception {
		long result = 0;
		if(n < 0 || p <0 )
		{
			throw new Exception("n or p should not be negative");
		}
		if(n==0 && p ==0)
		{
			throw new Exception("n and p should not be zero");
		}
		else
		{
			result = (long) Math.pow(n, p);
			return result;
		}
	}
    
    
}
