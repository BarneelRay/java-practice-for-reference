package com.barneel;

import java.util.Scanner;

//Java program to detect double and triple spaces in a string .
public class ps3_q4
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        boolean index=a.contains("  ");
        boolean index_2=a.contains("   ");
        if(index==true)
        {
            System.out.println("double spaces are present");
        }
        if(index_2==true)
        {
            System.out.println("triple spaces are present");
        }
    }
}
