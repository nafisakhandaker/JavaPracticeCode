package com.hackerrank.chalanges;

import java.io.IOException;
import java.util.Scanner;

/* You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. 
 * When she blows out the candles, she’ll only be able to blow out the tallest ones. 
 * Your task is to find out how many candles she can successfully blow out.For example, if your niece is turning 4 years old, 
 * and the cake will have 4 candles of height 3, 2, 1, 3, she will be able to blow out 2 candles successfully, 
 * since the tallest candle is of height  and there are  such candles.
 * Complete the function birthdayCakeCandles that takes your niece's age and an integer array containing height of each candle as input, 
 * and return the number of candles she can successfully blow out.

 * Input Format

 * The first line contains a single integer,n, denoting the number of candles on the cake. 
 * The second line contains n space-separated integers, where each integer  describes the height of candle .

 * Constraints
 * ----------------------------------
 * Output Format
 * Print the number of candles that can be blown out on a new line.
 * Sample Input 0
 * 4
 * 3 2 1 3
 * Sample Output 0
 * 2
 * Explanation 0
 * We have one candle of height 1, one candle of height 1, and two candles of height 3 . 
 * Your niece only blows out the tallest candles, meaning the candles where height =3. Because there are 2 such candles, we print 2 on a new line.
*/
public class BirthDayCandle {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {	
		int arCount = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
	    int[] ar = new int[arCount];
	
	    String[] arItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
	    for (int i = 0; i < arCount; i++) {
	        int arItem = Integer.parseInt(arItems[i]);
	        ar[i] = arItem;
	    }
	    
	    int result = birthdayCakeCandles(ar);
	    System.out.print(result);
	    scanner.close();
	}

	private static int birthdayCakeCandles(int[] ar) {
		int maxCount = 0;
		int max = findMax(ar);
		for(int i = 0; i < ar.length; i++)
		{
			if(max == ar[i])
			{
				maxCount++;
			}
		}
		return maxCount;
	}

	private static int findMax(int[] ar) {
		int max = ar[0];
		for(int i = 0; i < ar.length; i++)
        {
            if(max < ar[i])
            {
                max = ar[i];
            }
        }
		return max;
	}

}
