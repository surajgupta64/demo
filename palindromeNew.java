package com.company;

import java.util.Scanner;

public class palindromeNew {
    public void main(String[] args) {
        solve();
    }
    void solve(){

        Scanner sc=new Scanner(System.in);
        String s= sc.next();

        int n = s.length();
        int x = 0;
        for (int i= 0; i<=n / 2;i++){
           // x += s[i] != s[n - 1 - i];
        }
        if(x == 1){
            System.out.println("2");;
        }
        else if(x > 1){
            System.out.println("0");
        }
        else{
            if(n==1){
                System.out.println("25");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
