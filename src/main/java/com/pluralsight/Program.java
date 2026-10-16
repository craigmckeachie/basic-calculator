package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = inputScanner.nextInt();
        inputScanner.nextLine();

        System.out.print("Enter the second number: ");
        int secondNumber = inputScanner.nextInt();
        inputScanner.nextLine();

        System.out.print("""
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option:
                """);

        String chosenOption = inputScanner.nextLine();
        System.out.println("You chose: " + chosenOption);

        int result = firstNumber * secondNumber;

        System.out.println(firstNumber + " * "  + secondNumber + " = "  + result);
    }
}
