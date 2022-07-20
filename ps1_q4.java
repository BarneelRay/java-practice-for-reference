package com.barneel;

import java.util.Scanner;

//Converting kilometres to miles.
public class ps1_q4
{
    public static float kmtomiles(float a)
    {
        float miles=a/1.609f;
        return miles;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float km;
        System.out.print("enter the distance in km: ");
        km=sc.nextFloat();
        float miles=kmtomiles(km);
        System.out.println("the miles is :"+miles);
    }
}
