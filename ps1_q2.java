package com.barneel;

//WRITE A PROGRAM TO CALCULATE GPA USING MARKS .

import java.util.Scanner;

public class ps1_q2
{
    public static void main(String[] args)
    {
        int marks1, marks2, marks3;
        Scanner sc = new Scanner(System.in);
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        int cgpa = (marks1 + marks2 + marks3) / 3;
        System.out.println(cgpa + "is the final CGPA");
    }
}
