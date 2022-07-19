package com.barneel;
/*
* write a program to sum three numbers in java.
* */
import java.util.Scanner;

public class ps1_q1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("the sum is :"+ (a+b+c));
    }
}
