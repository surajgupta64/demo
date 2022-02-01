package com.company;

import java.util.Scanner;

public class buildingArrayPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buld=sc.nextInt();
        int a[]=new int[buld];
        for(int i=0;i<buld;i++){
            a[i]=sc.nextInt();
        }
        //Arrays.sort()
        int count=1;
        int max=a[0];
        for(int i=1;i<buld;i++){

            if(max<a[i]){
                count++;
                max=a[i];
            }
        }
        System.out.print(count);
    }
}
