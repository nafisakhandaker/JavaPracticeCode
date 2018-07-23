package com.hackerrank.chalanges;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. 
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 * Input Format
 * A single string containing a time in 12 -hour clock format (i.e.:  or ), where 01 <= hh <= 12 and 00 <= mm, ss <= 59
 * Output Format
 * Convert and print the given time in 24-hour format, where 00 <= hh <= 23
 * Sample Input 0
 * 07:05:45PM
 * Sample Output 0
 * 19:05:45
 */


public class TimeConversion {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
        String s = scan.nextLine();     
        String result = timeConversion(s);

        scan.close();
    }

	private static String timeConversion(String s) {
		String convertedTime = s;
		String[] tArr = s.split(":");
	    String amOrpm = tArr[2].substring(2,4);
	    int hour = Integer.parseInt(tArr[0]);
	    int min = Integer.parseInt(tArr[1]);
	    int sec = Integer.parseInt(tArr[2].substring(0,2));
        String hh = Integer.toString(hour);
        String mm = Integer.toString(min);
        String ss =Integer.toString(sec);
        
        if(hour >= 0 && hour <=23 && min<=59 && sec <= 59)
        {
            if(min < 10)
            {
                mm = new String("0"+mm);
            }
            if(sec < 10)
            {
                ss = new String("0"+ss);
            }
            
            if(amOrpm.equalsIgnoreCase("pm") && hour <12)
            {
                hour = hour + 12;
                hh = Integer.toString(hour);	    	
            }
            else if(amOrpm.equalsIgnoreCase("am") && hour <12)
            {               
                hh = Integer.toString(hour);	    	
            }
            else if(amOrpm.equalsIgnoreCase("am") && hour==12)
            {
                hh = "00";            
            }
            else if(amOrpm.equalsIgnoreCase("pm") && hour==12)
            {
                hh ="12";
            }
            convertedTime = (new String(hh+":"+mm+":"+ss));	    
            System.out.println(convertedTime);
            
        }
        return convertedTime;
	}
	
	/*
     * Complete the timeConversion function below.
     */
    static String timeConversion2(String s) {
        /*
         * Write your code here.
         */
        DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        DateFormat out = new SimpleDateFormat("HH:mm:ss");
        Date date=null;
        try
        {           
            date = df.parse(s);
            out.format(date).toString();          
        }
        catch(ParseException p)
        {
            System.out.println(p.getMessage());
        }
        return out.format(date).toString();
    }
}
