package com.company;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    private static final String VALUE = "0";

    public static String addLeadingZero(int num, String str) {
        int total = num == str.length() ? 0 : num - str.length();
        for (int i = 0; i < total; i++) {
            str = VALUE + str;
        }
        return str;
    }

    public static String[][] sortList(List<String> stringArrayByZero) {
        String[][] anArray = new String[10][2];

        for (int i = 1; i < 3; i++) {
            for (String str : stringArrayByZero) {
                char lastNumber = str.charAt(str.length() - i);
                switch (lastNumber) {
                    case '0':
                        anArray[0][i - 1] = str;
                        break;
                    case '1':
                        anArray[1][i - 1] = str;
                        break;
                    case '2':
                        anArray[2][i - 1] = str;
                        break;
                    case '3':
                        anArray[3][i - 1] = str;
                        break;
                    case '4':
                        anArray[4][i - 1] = str;
                        break;
                    case '5':
                        anArray[5][i - 1] = str;
                        break;
                    case '6':
                        anArray[6][i - 1] = str;
                        break;
                    case '7':
                        anArray[7][i - 1] = str;
                        break;
                    case '8':
                        anArray[8][i - 1] = str;
                        break;
                    case '9':
                        anArray[9][i - 1] = str;
                        break;
                }
            }
        }
        return anArray;
    }

    public static void radxSort(int iArr[]) {
        List<String> stringArray = new ArrayList<>();
        List<String> stringArrayByZero = new ArrayList<>();
        int largest = 0;

        //converto int to String
        for (int num : iArr) {
            stringArray.add(Integer.toString(num));
        }

        //get max character
        for (String str : stringArray) {
            if (str.length() > largest) {
                largest = str.length();
            }
        }

        //add leadingZero
        for (String str : stringArray) {
            stringArrayByZero.add(addLeadingZero(largest, str));
        }

        String[][] result = sortList(stringArrayByZero);

        printRadxSort(result);
    }

    public static void printRadxSort(String[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print("L" + i + 1 + ": ");
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radxSort(iArr);
    }
}