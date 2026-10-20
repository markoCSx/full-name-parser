package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your full name: ");
        String userFullName = userInput.nextLine().trim();
        String[] fullName = wordRemover(userFullName);
        System.out.println(fullName[0] + fullName[1] + fullName[2]);
    }

    public static String[] wordRemover (String word) {
        String[] names = word.split("\\ ");
        return names;
    }
}
