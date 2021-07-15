package com.company;
class Loops{
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {// remove condition or increment statement loop is infinite
            System.out.println(i);
        }
        int i = 100;
        while (i > 0) {//leave or write true for infi loop
            System.out.print(i + "\t");
            i = i - 10;
        }
        int j = 0;
        do {
            System.out.println(j);
            j = j + 2;
        } while (j < 100);
    }
}