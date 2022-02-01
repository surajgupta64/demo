package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ATM {
    static int AcBal ,mPin;
    public static void main(String[] args) {
        long accnum[]={1812500105532501L,109310110006721L,7738866507L,7710957578L,9326656004L};
        long acc;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Account Number: ");
        acc = sc.nextLong();
        if(accnum[0]==acc)
        {  mPin=1234;
           AcBal=5000;
           AcPin();
        }
        else if(accnum[1]==acc){
            AcBal=4000;
            mPin=2345;
            AcPin();
        }
        else if(accnum[2]==acc){
            AcBal=3000;
            mPin=3456;
            AcPin();
        }
        else if(accnum[3]==acc){
            AcBal=2000;
            mPin =4567;
            AcPin();
        }
        else if(accnum[4]==acc){
            AcBal=1000;
            mPin=5678;
            AcPin();
        }
        else {
            System.out.println("Invalid Account Number Entered!");
        }

    }


    public static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Withdraw Amount ");
        int youramt = sc.nextInt();
        if (AcBal >= youramt) {
            System.out.println("Your Transaction is being Processed!!\nHere Your Money has been Withdrawn: !!");
        } else {
            System.out.println("Insufficient Balance.!!");
        }
        System.out.println("1-> Continue...\tOR \n0-> Exit .");
        int btn=sc.nextInt();
        switch (btn)
        {
            case 1:
                Services();
                break;
            case 0:
                System.out.println("Thank you for using ATM.");
                break;
            default:
                System.out.println("invalid option: ");
        }
    }

    public static void balance() {

        System.out.println("Your A/c Balance Is -" +AcBal);
        Scanner sc=new Scanner(System.in);
        System.out.println("1-> Continue...OR \n0-> Exit .");
        int btn=sc.nextInt();
        switch (btn)
        {
            case 1:
                Services();
            break;
            case 0:
                System.out.println("Thank you for using ATM.");
                break;
            default:
                System.out.println("invalid option: ");
        }
    }

    private static void setPin()
    {
        int mOTP = 1111;
        System.out.println("OTP Has been sent to your registered mobile number!!");
        System.out.println("Enter OTP : ");
        Scanner sc = new Scanner(System.in);
        int nOTP = sc.nextInt();
        if (nOTP == mOTP) {

            System.out.println("Set New Pin: ");
            int newPin;
            newPin= sc.nextInt();

            System.out.println("Enter Confirm Pin: ");
            int conPin;
            conPin= sc.nextInt();
            if(newPin==conPin)
            {
                System.out.println("Set Pin Successfully.!!");
            }
            else{
                System.out.println("Pin NOT matching..!!");
                }

        } else {
            System.out.println("You Have Entered Incorrect OTP..!!");
        }
    }
    public static void mStatement(){
        System.out.println("Last 10 Transaction statement has been sent to your registered e-mail: ");
        System.out.println("-----------------------------------------------");
        System.out.println("|\t your 5 statement \t |");
        System.out.println("-----------------------------------------------");

    }
    public static void AcPin()
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter ATM Pin: ");
       int pin = sc.nextInt();
       if(pin==mPin)
       {
           Services();
       }else {
           System.out.println("Incorrect Pin..!!");
       }
    }

    private static void Services() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select services: " +
                "\n1-> Withdrawals. " +
                "\n2-> Check A/c Balance" +
                "\n3-> Set Pin " +
                "\n4-> Mini Statement. ");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println(" ");
                withdraw();
                break;
            case 2:
                System.out.println(" ");
                balance();
                break;
            case 3:
                System.out.println("Forgetting Pin...\n");
                setPin();
                break;
            case 4:
                System.out.println("please Wait...");
                mStatement();
                break;
            default:
                System.out.println("invalid option selected !!");
        }
    }

}
