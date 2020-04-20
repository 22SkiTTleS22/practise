package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //    Условие: дана строка, ввод с клавиатуры. Найти в ней длину максимальной
//    подстроки из неповторяющихся символов.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = in.nextLine();
        char[] strArray = str.toCharArray();
        int maxLength = 1;
        ArrayList<Character> mas = new ArrayList<Character>();
        mas.add(strArray[0]);
        for (int j = 1; j < str.length()-1; j++) {
            for (int i = j; i < str.length(); i++) {
                if (mas.contains(strArray[i])) {
                    if (maxLength < mas.size()) {
                        maxLength = mas.size();
                        mas.clear();
                        mas.add(strArray[i]);
                    }
                } else {
                    mas.add(strArray[i]);
                    maxLength = mas.size();
                }
            }
        }
        System.out.println(maxLength);
    }
}