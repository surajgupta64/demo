package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class newpro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean ans=false;
        for(int i=0;i<str1.length();i++){
            ans=false;
            for(int j=0;j<str2.length();j++){
                if (str1.charAt(i) == str2.charAt(j)) {
                    ans = true;
                    break;
                }
            }
        }
        if(ans==true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }




    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr=new String[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.next();
        }
        for (int i=0;i<n;i++){
            result(arr[i],arr[i].length());
        }
    }

    private static void result(String arr,int n) {
        for (int i=0;i<n;i++){
            for (int j=1+i;j<n;j++){
                if (arr.charAt(i)==arr.charAt(j)){
                    System.out.println(arr.charAt(i));
                    return;
                }
            }
        }
        System.out.println("-1");
    }*/





/*
    public static void main(String[] args) {
        int arr[]={7,8,9,3,7,9,10,10};
        int n=arr.length;
        second(arr,n);
    }
    private static void second(int[] arr, int n) {
        if(n<2){
            System.out.println("invalid array");
            return;
        }
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }*/





    /*public static void main(String[] args) {
        int arr[]={10,3,6,9,1,5};
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        quickSorting(arr,0,n-1);

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSorting(int[] arr, int low, int high) {
        if(low<high){
            int p= partition(arr,low,high);
            quickSorting(arr,low,p-1);
            quickSorting(arr,p+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=(low-1);
        for (int j=low; j<high;j++){
            if (arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }*/

}
