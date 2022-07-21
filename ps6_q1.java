package com.barneel.ps6;

import java.util.Scanner;

//summing up an array of floats.
public class ps6_q1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float[] numbers = new float[5];
        for(int i=0 ;i<5;i++)
        {
            System.out.println("enter element "+i+" :");
            numbers[i]=sc.nextFloat();
        }
        float sum=0.0f;
        for(float stuff:numbers)
        {
            sum=sum+stuff;
        }
        System.out.println(sum+ "is the sum of the contents.");
    }
}
