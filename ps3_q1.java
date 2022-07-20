package com.barneel;

import java.util.Scanner;

//Converting a string to lowercase.
public class ps3_q1
{
    public static void main(String[] args)
    {
        String a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextLine();
        String aReversed=a.toLowerCase();
        System.out.println(aReversed);
    }
}
