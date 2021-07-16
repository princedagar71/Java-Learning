package com.company;

class ExceptionHandling{
    public static void main(String[] lodu){
        int a[]=new int[4];
        try {
            System.out.println(a[10]);
        }catch (ArrayIndexOutOfBoundsException Q){//WRITE EXCEPTION IN PARNTHESIS IT WILL CATCH ANY ERROR
            System.out.println("Error catched");
            System.out.println(Q.getLocalizedMessage());
        }

        System.out.println("Hello World!");
    }
}