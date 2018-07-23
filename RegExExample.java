package com.hackerrank.chalanges;

import java.util.*;
import java.util.regex.*;

public class RegExExample {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String regex = "[a-z]+@gmail\\.com$";
        Pattern p = Pattern.compile(regex);
        
        if(N <= 30)
        {     
            List<String> nameList = new ArrayList<String>();
            for (int NItr = 0; NItr < N; NItr++) {
                String[] firstNameEmailID = scanner.nextLine().split(" ");
                String firstName = firstNameEmailID[0];
                String emailID = firstNameEmailID[1].toLowerCase();
                Matcher m = p.matcher(emailID);
                if(firstName.length()<20 && emailID.length()<50)
                {
                    if (m.find()){
                        nameList.add(firstName);
                    }
                }
            }
            Collections.sort(nameList);
            for(int i =0; i<nameList.size();i++)
            {
                System.out.println(nameList.get(i));
            }

            scanner.close();
        }
    }
}

