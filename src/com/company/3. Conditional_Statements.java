package com.company;

import java.util.Scanner;

class Conditional_Statements{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        if (age>=18)
            System.out.println("You are an adult!!!");
        else if (age<18 && age>=0)
            System.out.println("You are child!!!");
        else
            System.out.println("Wrong Input !!!");
    }

}