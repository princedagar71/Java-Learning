package com.company;

import java.util.Scanner;

class Data_Types{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int n =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter House size in sq.mtrs:");
        float hm=sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter No. for Double Data-Type :");
        double num=sc.nextDouble();
        sc.nextLine();
        System.out.println("Earth is flat (T/F):");
        boolean ans=sc.nextBoolean();
        sc.nextLine();
        System.out.println("Enter your name:");
        String name;
        name = sc.nextLine();
        //sc.nextLine();
        System.out.println("Name:"+name+"\nAge:"+n+"\nHouse Size:"+hm+"\nDoouble Data Type Number:"+num+"\nAnswer of Question:"+ans);

    }


}