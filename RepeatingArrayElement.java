package com.company;

import java.util.Scanner;

public class RepeatingArrayElement {
    public static void main(String[] args) {
        /*Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
            int	min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                    min=j;
            }
            int tem=a[min];
            a[min]=a[i];
            a[i]=tem;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");

        }*/
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        for(int i=1;i<n;i++){
            int	min=a[i];
            int	j=i;
            while(j>0 && a[j-1]>min){
                a[j]=a[j-1];
                j--;
            }
            a[j]=min;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");

        }
    }
}