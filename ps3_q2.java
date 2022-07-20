package com.barneel;

import java.util.Scanner;

//Converting all spaces in a sentence into underscores.
public class ps3_q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=a.replace(" ","_");
        System.out.println(b);
    }
}
