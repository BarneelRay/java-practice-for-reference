package com.barneel.ps5;

import java.util.Scanner;

//Program to sum first n even numbers using while loop.
public class ps5_q2
{
    public static void  main(String[] args)
    {
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter the n");
        int n=sc.nextInt();
        System.out.println("thanks");
        int i=0;
        int sum=0;
        int k= n*2;
        while(i<=k )
        {
            if(i%2 == 0)
            {
                sum=sum+i;
            }
            i++;
        }
        System.out.println("the sum is :"+sum);
    }
}
