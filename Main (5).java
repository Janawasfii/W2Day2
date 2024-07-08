package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
//EX1
       /*
        System.out.println("Please enter a first number: ");
        int num1 = s.nextInt();
        System.out.println("Please enter a second number");
        int num2 = s.nextInt();
        System.out.println("Please enter a third number");
        int num3 = s.nextInt();
        int smallVal = small(num1, num2, num3);
        System.out.printf("The smallest value is:%.1F  " + smallVal );*/
//EX2
        /* System.out.println("Please enter a number:");
        int num = s.nextInt();
        check(num);*/

 //EX3
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits ");
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = s.nextLine();
        if (ValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        }
    }
//EX1
    /* public static int small(int num1, int num2,int num3) {

         int smallest = num1;
         if (num2 < smallest) {
             smallest = num2;}
         if (num3 < smallest) {
             smallest = num3;}
         return smallest;}*/

 //EX2
   /* public static void check(int number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    }*/
 //EX3

        public static boolean ValidPassword(String password) {
        if (password.length() < 8) {
        System.out.println("1. A password must have at least eight characters.");
        return false;}
        int digitCount = 0;
        for (char c : password.toCharArray()) {
        if (!Character.isLetterOrDigit(c)) {
        System.out.println("2. A password consists of only letters and digits.");
        return false;}
        if (Character.isDigit(c)) {
        digitCount++;}}
        if (digitCount < 2) {
        System.out.println("3. A password must contain at least two digits");
        return false; }
        return true;
    }
}

