package com.example.miprimerproyecto;


import java.util.Scanner;
public class HelloApplication  {


    public static void main(String[] args) {

        Scanner inte = new Scanner(System.in);
        System.out.println("Number operation");
        System.out.println("Enter First Whole Numbers");
        int int1=inte.nextInt();
        System.out.println("Enter second whole number");
        int int2=inte.nextInt();
        System.out.println("The final result of the sum is: "+(int1+int2));
        System.out.println("Enter First Whole Numbers");
        Double div=(double)int1/int2;

        System.out.println("The final result of the division is: "+div);

        System.exit(0);
    }
}