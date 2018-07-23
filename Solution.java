package com.hackerrank.chalanges;

import java.util.*;


public class Solution {

	static class TestDataEmptyArray {
	    public static int[] get_array() {
	        // complete this function
	        int[] seq = new int[0];
	        return seq ;
	    }
	}
	static class TestDataUniqueValues {
        public static int[] get_array() {
            int[] seq = {5,4,3,2,6};  
	        return seq ;
        }
        
        public static int get_expected_result() {
            // complete this function
        	int[] seq = get_array();
        	int result = minimum_index(seq);
	        return result ;
        }
    }
    public static int minimum_index(int[] seq) {
    	System.out.println(seq.length);
    	if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }
    
    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            System.out.println(seq.length);
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
        	System.out.println(e.getMessage());
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }
    
    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }
        
        int expected_result = TestDataUniqueValues.get_expected_result();
        System.out.println(expected_result);
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        System.out.println("OK");
    }
}

