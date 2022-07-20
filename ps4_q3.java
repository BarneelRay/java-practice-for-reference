package com.barneel;

import java.util.Scanner;

//find type of site from url.
public class ps4_q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        boolean company = url.endsWith(".com");
        boolean organisation = url.endsWith(".org");
        boolean indianSite = url.endsWith(".in");
        if (company == true) {
            System.out.println("This is a company website");
        } else if (organisation == true) {
            System.out.println("this is an organisational website");
        }
        else if(indianSite==true)
        {
            System.out.println("this is an indian site");
        }
        else
        {
            System.out.println("undetectable!");
        }
    }
}
