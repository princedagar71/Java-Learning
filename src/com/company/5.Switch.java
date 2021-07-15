package com.company;

import java.util.Scanner;

class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Grade(in Uppercase):");
        char g = sc.next().charAt(0);
        switch (g) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Wrong Input!!!");


        }
        //&& || !
        if (!(g == 'A')){
            {
                System.out.println("You are average!!!");
            }
    }}
}