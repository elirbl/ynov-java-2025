package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {
    public static void calculator(int num1, int num2) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        System.out.println("Choose an operator (+, -, *, /) : ");
        String name = sc.nextLine();
        result = switch (name) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> result;
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculator(50, 10);
    }
}
