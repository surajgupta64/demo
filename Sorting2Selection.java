package com.company;

public class Sorting2Selection {
    public static void main(String[] args) {

        int arr[]={1,9,2,3,5};

        //selection sort
        //time complexity n^2
        for (int i=0; i< arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }

            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for (int i=0; i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
