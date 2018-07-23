package com.hackerrank.chalanges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

public static void main(String[] args) {
		
		Map phoneBook = new HashMap();
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(null == phoneBook.get(s))
            {
            	System.out.println("Not found");
            }
            else
            {
            	System.out.println(s +"="+ phoneBook.get(s));
            }
        }
        in.close();
	}

}
