package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = in.nextLine();
        char[] strArray = str.toCharArray();
        char ch = strArray[0];
        int count = 1;
        int maxLength = 1;
        for (int i = 1; i < str.length(); i++) {
            if (ch == strArray[i]) {
                count++;
            } else  {
                count = 1;
            }
            ch = strArray[i];
            if(count > maxLength) {
                maxLength = count;
            }
        }
        System.out.println(maxLength);
    }
}