package com.barneel;

import java.util.Scanner;

//using a formula of physics , write an java program.
public class ps2_q2
{
    public static void main(String[] args)
    {
        float u,v,a,s;
        Scanner sc= new Scanner(System.in);
        u= sc.nextFloat();//intial velocity
        v=sc.nextFloat();//final velocity
        a=sc.nextFloat();//acceleration.
        s=sc.nextFloat();//displacement.
        float g= (v*v-u*u)/(2*a*s);
        if(g==1)
        {
            System.out.println("the equation stands for these values.");
        }
        else
        {
            System.out.println("there is something fishy with the values.");
        }
    }
}
