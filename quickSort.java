package com.company;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 10, 13, 5, 2, 7};
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " "); }
        // Sorting the whole array
        quicksort(arr, 0, arr.length - 1);
        System.out.println("\nArray after Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " "); }
    }
    static void quicksort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quicksort(arr, low, p-1);
            quicksort(arr, p+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int p = low, j;
        for(j=low+1; j <= high; j++)
            if(arr[j] < arr[low])
                swap(arr, ++p, j);

        swap(arr, low, p);
        return p;
    }
    static void swap(int[] arr, int low, int pivot){
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }
}
