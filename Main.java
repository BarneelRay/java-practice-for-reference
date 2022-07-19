package com.barneel;
import java.util.Scanner;

/*
* THIS IS A CALCULATOR DEVELOPED ON THE CONCEPTS TAUGHT IN LECTURE 1 TO 35 OF CODE OF HARRY'S TUTORIAL
* OF THE JAVA PROGRAMMING LANGUAGE
* MADE BY BARNEEL RAY
* LAST VERSION UPDATE ON 17.27 OF 14/07/2022.
* */

public class Main
{

    //Adding two numbers.

    public static int add(int ...arr)
    {
        int sum=0;
        for(int element:arr)
        {
            sum+=element;
        }
        return sum;
    }

    public static double add(double ...arr)
    {
        double sum=0;
        for(double element:arr)
        {
            sum+=element;
        }
        return sum;
    }
    //Multiplying two numbers.

    public static int multiply(int ...arr)
    {
        int result=1;
        for(int element:arr)
        {
            result=result*element;
        }
        return result;
    }

    public static double multiply(double ...arr)
    {
        double result=1;
        for(double element:arr)
        {
            result =result*element;
        }
        return result;
    }
    //dividing one number by another.

    public static int divide(int a, int b)
    {
        return a/b;
    }

    public  static  double divide(double a, double b)
    {
        return a/b;
    }
    //subtracting many numbers from one number.

    public static int minus(int a,int ...arr)
    {
        int ans=a;
        for(int element:arr)
        {
            ans=ans-element;
        }
        return ans;
    }

    public static double minus(double a,double ...arr)
    {
        double ans=a;
        for(double element:arr)
        {
            ans=ans-element;
        }
        return ans;
    }
    //finding factorial.

    public static int factorial(int a)
    {
        if(a==0 || a==1)
        {
            return 1;
        }
        else
        {
            return a*factorial(a-1);
        }
    }

    public static double factorial(double a)
    {
        if(a==1||a<1)
        {
            return 1;
        }
        else
        {
            return a*factorial(a-1);
        }
    }
    //Main method.

    public static void main(String[] args)
    {

        while(true)
        {

            //code for the calculator to run.

            Scanner sc=new Scanner(System.in);
            System.out.println("Type your choice");
            String choice=sc.next();
            //Logic of calculator based on choice.

            //ADDITION.

            if(choice.equalsIgnoreCase("add"))
            {


                //code


                String type;
                System.out.println("enter the type:");
                type=sc.next();

                if(type.equalsIgnoreCase("int")||type.equalsIgnoreCase("integer"))
                {
                    int size;
                    System.out.println("enter the total amount of numbers:");
                    size = sc.nextInt();
                    int[] num = new int[size];
                    System.out.println("enter the numbers one by one.");

                    for (int i = 0; i < size; i++)
                    {
                        num[i] = sc.nextInt();
                    }

                    int sum = add(num);
                    System.out.printf("the sum is : %d\n", sum);
                }

                else if(type.equalsIgnoreCase("deci")||type.equalsIgnoreCase("decimal"))
                {
                    int size;
                    System.out.println("enter the total amount of numbers:");
                    size = sc.nextInt();
                    double[] num = new double[size];
                    System.out.println("enter the numbers one by one.");

                    for (int i = 0; i < size; i++)
                    {
                        num[i] = sc.nextDouble();
                    }

                    double sum = add(num);
                    System.out.print("the sum is :");
                    System.out.println(sum);
                }

            }

            //SUBTRACTION.

            else if(choice.equalsIgnoreCase("subtract") || choice.equalsIgnoreCase("minus"))
            {

                //code

                System.out.println("enter the type:");
                String type=sc.nextLine();

                if(type.equalsIgnoreCase("int") || type.equalsIgnoreCase("integer"))
                {

                    System.out.println("enter the first number");
                    int a=sc.nextInt();
                    System.out.println("enter the amount of numbers to be subtracted:");
                    int size=sc.nextInt();
                    int[] num= new int[size];
                    System.out.println("enter the numbers one by one");

                    for(int i=0 ; i<size; i++)
                    {
                        num[i]=sc.nextInt();
                    }

                    int result=minus(a,num);
                    System.out.println("the result is:");
                    System.out.println(result);

                }

                else if(type.equalsIgnoreCase("deci")||type.equalsIgnoreCase("decimal"))
                {

                    System.out.println("enter the first number");
                    double a=sc.nextDouble();
                    System.out.println("enter the amount of numbers to be subtracted:");
                    int size=sc.nextInt();
                    double[] num= new double[size];
                    System.out.println("enter the numbers one by one");

                    for(int i=0 ; i<size; i++)
                    {
                        num[i]=sc.nextDouble();
                    }

                    double result=minus(a,num);
                    System.out.println("the result is:");
                    System.out.println(result);
                }

            }

            //MULTIPLICATION.

            else if(choice.equalsIgnoreCase("multiply"))
            {
                //code

                String type;
                System.out.println("enter the type:");
                type=sc.next();

                if(type.equalsIgnoreCase("int")||type.equalsIgnoreCase("integer"))
                {
                    int size;
                    System.out.println("enter the total amount of numbers:");
                    size = sc.nextInt();
                    int[] num = new int[size];
                    System.out.println("enter the numbers one by one.");

                    for (int i = 0; i < size; i++)
                    {
                        num[i] = sc.nextInt();
                    }

                    int result = multiply(num);
                    System.out.printf("the sum is : %d\n", result);
                }

                else if(type.equalsIgnoreCase("deci")||type.equalsIgnoreCase("decimal"))
                {
                    int size;
                    System.out.println("enter the total amount of numbers:");
                    size = sc.nextInt();
                    double[] num = new double[size];
                    System.out.println("enter the numbers one by one.");

                    for (int i = 0; i < size; i++)
                    {
                        num[i] = sc.nextDouble();
                    }

                    double result = multiply(num);
                    System.out.print("the sum is :");
                    System.out.println(result);
                }

            }

            //DIVISION.

            else if(choice.equalsIgnoreCase("divide"))
            {
                //code

                String type;
                System.out.println("enter the type:");
                type=sc.next();

                if(type.equalsIgnoreCase("int")||type.equalsIgnoreCase("integer"))
                {
                    System.out.println("enter the first number");
                    int a=sc.nextInt();
                    System.out.println("enter hte second number");
                    int b= sc.nextInt();
                    int result=divide(a,b);
                    System.out.println("the result is:");
                    System.out.println(result);
                }

                else if(type.equalsIgnoreCase("deci")||type.equalsIgnoreCase("decimal"))
                {
                    System.out.println("enter the first number");
                    double a=sc.nextDouble();
                    System.out.println("enter hte second number");
                    double b= sc.nextDouble();
                    double result=divide(a,b);
                    System.out.println("the result is:");
                    System.out.println(result);
                }

            }

            //FACTORIAL

            else if(choice.equalsIgnoreCase("factorial"))
            {

                //code

                String type;
                System.out.println("enter the type:");
                type=sc.next();

                if(type.equalsIgnoreCase("int")||type.equalsIgnoreCase("integer"))
                {
                    System.out.println("enter the number:");
                    int input=sc.nextInt();
                    int result=factorial(input);
                    System.out.println("The factorial is:");
                    System.out.println(result);
                }

                else if (type.equalsIgnoreCase("deci")||type.equalsIgnoreCase("decimal"))
                {
                    System.out.println("enter the number:");
                    double input=sc.nextDouble();
                    double result=factorial(input);
                    System.out.println("The factorial is :");
                    System.out.println(result);

                }

            }

            //ENDING THE INFINITE LOOP.


            else if(choice.equalsIgnoreCase("terminate") || choice.equalsIgnoreCase("end"))
            {
                break;
            }

            //HANDLING INVALID INPUTS.

            else
            {
                System.out.println("invalid operation.:)");
            }

        }

    }

}
