package com.company;

import java.util.Scanner;

public class pettern {
    public static void main(String[] args) {

            int arr[] = {1, 2, 4, 6, 3, 7, 8};

        for (int i=0; i< args.length;i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
