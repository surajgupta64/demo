package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        for(int i=1;i<=5;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=4; j>=i;j--){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }for(int i=1;i<=4;i++){
            for(int j=4; j>=i;j--){
                System.out.print("*");
            }
            for(int j=1; j<=i;j++){
                System.out.print("  ");
            }for(int j=4; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
