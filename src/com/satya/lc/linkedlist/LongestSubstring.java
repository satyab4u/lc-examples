package com.satya.lc.linkedlist;

import java.util.Scanner;

/**
 * Created by Satya on 3/7/19.
 */
public class LongestSubstring {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("longest str length"+longestStringLength(str));
    }

    public static int longestStringLength(String str) {
        int maxLength = 0;
        if(str.length() == 0) return 0;
        if(str.length() == 1) return 1;
        for(int i=0; i<str.length()-1;i++) {
            for(int j=i+1;j<str.length();j++) {
                System.out.println("substring::"+str.substring(i,j));
                System.out.println("substring of j::"+str.charAt(j));
                if(str.substring(i,j).contains(String.valueOf(str.charAt(j)))) {
                    int length = str.substring(i,j).length();
                    if(length > maxLength) {
                        maxLength = length;
                    }
                    break;
                }
            }
        }
        return maxLength;
    }
}
