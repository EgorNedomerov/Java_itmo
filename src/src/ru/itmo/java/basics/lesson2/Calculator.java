package src.ru.itmo.java.basics.lesson2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        sum();
        division();
        multiplication();
        subtraction();
    }

    public static void sum() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Operation + Enter two numbers : ");
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        double result = num1 + num2;
        System.out.println("result +: " + result);
    }

    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Operation + Enter two numbers : ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int result = num1 + num2;
        System.out.println("result +: " + result);
    }

    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Operation + Enter two numbers : ");
        long num1 = reader.nextLong();
        long num2 = reader.nextLong();
        long result = num1 + num2;
        System.out.println("result +: " + result);
    }

    public static void division() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Operation / Enter two numbers: ");
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        double result = num1 / num2;
        System.out.println("result /: " + result);
    }

    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int result = num1 / num2;
        System.out.println("result /: " + result);
    }

    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        long num1 = reader.nextLong();
        long num2 = reader.nextLong();
        long result = num1 / num2;
        System.out.println("result /: " + result);
    }

    public static void multiplication() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers *: ");
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        double result = num1 * num2;
        System.out.println("result *: " + result);
    }

    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int result = num1 * num2;
        System.out.println("result *: " + result);
    }

    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        long num1 = reader.nextLong();
        long num2 = reader.nextLong();
        long result = num1 * num2;
        System.out.println("result *: " + result);
    }

    public static void subtraction() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers -: ");
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        double result = num1 - num2;
        System.out.println("result -: " + result);
    }

    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int result = num1 - num2;
        System.out.println("result -: " + result);
    }

    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        long num1 = reader.nextLong();
        long num2 = reader.nextLong();
        long result = num1 - num2;
        System.out.println("result -: " + result);
    }
}

