package com.barneel;

import java.util.Scanner;

//java program to fill in a letter template.
public class ps3_q3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        String b="Hello <|name|> , my dear friend";
        String c=b.replace("name",a);
        System.out.println(c);
    }
}
