package com.barneel;

import java.util.Scanner;

//using comparison operators to know if given number is less than or greater than random number.
public class ps2_q3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int max=6;
        int min=1;
        float a= (float) Math.floor(Math.random()*(max-min+1)+min);
        float b=sc.nextFloat();
        if(a<b)
        {
            System.out.println("entered number is smaller");
        }
        else if(a==b)
        {
            System.out.println("entered number is equal");
        }
        else
        {
            System.out.println("entered number is greater");
        }
    }
}
