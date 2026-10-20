package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your full name: ");
        String userFullName = userInput.nextLine().trim();
        String[] fullName = wordRemover(userFullName);

        String firstName = fullName[0];
        String middleName = "(none)";
        String lastName = "(none)";
        if (fullName.length > 2) {
            middleName = fullName[1];
            lastName = fullName[2];
        } else if (fullName.length > 1) {
            //middleName = "(none)";
            lastName = fullName[1];
        }

        System.out.printf("""
                First name: %s
                Middle name: %s
                Last name: %s
                """, firstName, middleName, lastName);
    }

    public static String[] wordRemover (String word) {
        String[] names = word.split("\\ ");
        if (names[0].isEmpty()) {
            names[0] = "(none)";
        }
        return names;
    }
}
