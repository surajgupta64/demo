package com.company;

public class Sorting3Insertion {
    public static void main(String[] args) {


        int arr[]={10,9,2,3,5};

        //selection sort
        //time complexity n^2
        for (int i=1; i< arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for (int i=0; i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
