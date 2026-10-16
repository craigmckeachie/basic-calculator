package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = inputScanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = inputScanner.nextInt();

        int result = firstNumber * secondNumber;

        System.out.println(result);

    }
}
