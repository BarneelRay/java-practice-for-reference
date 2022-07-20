package com.barneel;

import java.util.Scanner;

//Calculation of tax by employee as per standard govt tax slab.
/*
* Income Tax Slab	                 Individuals Below The Age Of 60 Years – Income Tax Slabs
Up to Rs 2.5 lakh	                 NIL
Rs. 2.5 lakh -Rs. 5 lakh	        5%
Rs 5.00 lakh – Rs 10 lakh	        20%
> Rs 10.00 lakh	                    30%
* */
public class ps4_q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your annual income:");
        float income = sc.nextFloat();
        float incomeTax = 0;
        float taxableIncome = income - 250000;
        if (income >= 1000000)
        {
            incomeTax = incomeTax + ((income - 1000000) * (30.0f / 100.0f)) +100000f+(0.05f*250000f);
            System.out.println("the income tax is :"+incomeTax);
        }
        else if (income < 1000000 && income >= 500000)
        {
            incomeTax= ((income-500000f)*0.2f)+(0.05f*250000f);
            System.out.println("the income tax is:"+incomeTax);
        }
        else if(income<=500000 && income>250000)
        {
            incomeTax=((income-250000f)*0.05f);
            System.out.println("the income tax is :"+incomeTax);
        }
        else
        {
         System.out.println("no income tax for you.");
        }
    }
}
