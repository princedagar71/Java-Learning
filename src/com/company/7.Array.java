package com.company;

import java.util.Scanner;

class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        int[] a = new int[100];//Array with no size limit is defined like this
        System.out.println("Enter no. of elements:");
        n=sc.nextInt();
        System.out.println("Enter Elements now:");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();

        }
        System.out.println("Print Elements:");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        int b[][]=new int[100][100];
        System.out.println("Enter no. of elements in 2-D Array:");
        int m= sc.nextInt();
        System.out.println("Enter Elements now:");
        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                b[i][j]= sc.nextInt();
            }

        }
        System.out.println("Print 2-D Matrix");
        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                System.out.print(b[i][j]+"\t");

            }
            System.out.println();
        }


    }
}