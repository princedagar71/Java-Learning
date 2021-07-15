package com.company;

import java.util.Scanner;

class Operators{
    public static void main(String[] args){
        //+ - * / % ++ --
        float a=5.0f,b=4.0f,c=a-b;
        System.out.println(a+b+" "+c+" "+a*b+" "+a/b+" "+a%b);
        int d=12,e=10;
        double f=(double)d/(double) e;
        System.out.println(f+" "+f+++" "+f--);



    }

}