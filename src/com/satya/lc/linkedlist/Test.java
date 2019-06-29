package com.satya.lc.linkedlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Satya on 3/18/19.
 */
public class Test {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        int sum = 0;

        for(int i=0 ;i< array.length;i++) {
            array[i] = sc.nextInt();
            sum = sum + array[i];
            sum+=array[i];
        }

    }


}
