package com.company;

import java.util.Scanner;

public class inheritance {


    int sum=0 , mul = 1;
     public int sumOfn(int n)
     {
         for(int i =0;i<n;i++)
         {
             sum = sum + i;
         }
         return sum;
     }
     public int mulOfn(int n)
     {
         for(int i =1;i<=n;i++)
         {
             mul = mul * i;
         }
         return mul;
     }

    public static void main(String[] args)
    {
//        inheritance i = new inheritance();
//        i.sumOfn(10);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        additionRes a = new additionRes();
        a.sumOfn(n);
        a.result();

        mulRes mr = new mulRes();
        mr.mulOfn(n);
        mr.mulRes();

    }
}
class additionRes extends  inheritance
{
    public void result()
    {
        System.out.println("This is the subclass which calls super class method sumOfn:  "+sum);
    }
}
class mulRes extends inheritance
{
    public void mulRes()
    {
        System.out.println("This is the subclass which calls super class method mulOfn:  "+mul);
    }
}
