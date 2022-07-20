package com.barneel;

import java.util.Scanner;

//decision on whether student passes with 33 % in each subject and 40% overall.
public class ps4_q1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float per1, per2, per3;
        System.out.println("enter the percentage marks one by one");
        per1 = sc.nextFloat();
        per2 = sc.nextFloat();
        per3 = sc.nextFloat();
        float totalp = (float) ((per1 + per2 + per3) / 3.0);
        if (per1 >= 33 && per2 >= 33 && per3 >= 33 && totalp >= 40)
        {
            System.out.println("the student has passed:)");
        }
        else
        {
            System.out.println("You have failed my dear>)");
        }
    }
}
