package com.company;

import java.util.Scanner;

public class maxArrayPro {
    /*public static void main(String[] args) {
        int n,Arr1n,Arr2n,Arr3n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Arr1n= sc.nextInt();
        int Array1[]=new int[Arr1n];
        for (int i=0;i<Arr1n;i++){
            Array1[i]=sc.nextInt();
        }
        Arr2n= sc.nextInt();
        int Array2[]=new int[Arr2n];
        for (int i=0;i<Arr2n;i++){
            Array2[i]=sc.nextInt();
        }
        Arr3n= sc.nextInt();
        int Array3[]=new int[Arr3n];
        for (int i=0;i<Arr1n;i++){
            Array3[i]=sc.nextInt();
        }
        for (int i=0;i<Arr1n;i++){
            System.out.print(Array1[i]+" ");
        }
    }*/
/*

        static void print3largest(int arr[][], int arr_size)
        {
            int i, first, second, third;

            third = first = second = Integer.MIN_VALUE;
            for (i = 0; i < arr_size; i++) {
			*/
/* If current element is greater than
			first*//*

                if (arr[][i] > first) {
                    third = second;
                    second = first;
                    first = arr[][i];
                }

			*/
/* If arr[i] is in between first and
			second then update second *//*

                else if (arr[i] > second) {
                    third = second;
                    second = arr[i];
                }

                else if (arr[i] > third)
                    third = arr[i];
            }

            System.out.println("Three largest elements are " + first + " " + second + " " + third);
        }
*/

        /* Driver program to test above function*/
        public static void main(String[] args)
        {
            int n,Arr1n;
            Scanner sc=new Scanner(System.in);
            n= sc.nextInt();
            int arr[][]=new int[n][];
            for (int i=0;i<n;i++){
                Arr1n= sc.nextInt();
                arr[i]=new int[Arr1n];
                for (int j=0;j<Arr1n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            int i, first, second, third;

            third = first = second = Integer.MIN_VALUE;
            for ( i=0;i<n;i++){
                for (int j = 0; j < arr[i].length; j++) {

                    if (arr[i][j] > first) {
                        third = second;
                        second = first;
                        first = arr[i][j];
                    }

                else if (arr[i][j] > second) {
                        third = second;
                        second = arr[i][j];
                    }

                    else if (arr[i][j] > third)
                        third = arr[i][j];
                }

                System.out.println( first + " " + second + " " + third);
                first = 0;
                second = 0;
                third = 0;
            }
/*
            for (int i=0;i<n;i++){
                for (int j=0;j<arr[i].length;j++){
                    print3largest(arr[i][j],arr[i].length);
                }
                System.out.println();
            }*/
        }
}
