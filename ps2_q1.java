package com.barneel;

import java.util.Scanner;

//java program to encrypt a grade by adding 8 to it
public class ps2_q1
{
    public static void main(String[] args)
    {
        //String[] grades={"A","B","C","D","E","F","N1","N2","N3","N4","O"}; an array of grades just for reference.
        Scanner sc= new Scanner(System.in);
        String actualGrade= sc.next();
        String encryptedGrade=actualGrade+8;
        System.out.println("The grade is : "+encryptedGrade);
    }
}
