package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name ? ");
        String name = sc.nextLine();

        System.out.println("What's your age ? ");
        int age = sc.nextInt();

        System.out.println(name);
        System.out.println(age);
    }
}
