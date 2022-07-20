package com.barneel;

import java.util.Scanner;

//detecting whether input is user or not.

public class ps1_q5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        boolean g=sc.hasNextInt();
        if (g) //can be written as( g== true) also.
        {
            System.out.println("it has an integer ");
        }
        else
        {
            System.out.println("no it is not an integer");
        }
    }
}
