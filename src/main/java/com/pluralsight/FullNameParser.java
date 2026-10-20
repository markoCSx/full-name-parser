package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your full name: ");
        String userFullName = userInput.nextLine().trim();
        String[] fullName = nameSeparator(userFullName);

        String firstName = fullName[0];
        String middleName = "(none)";
        String lastName = "(none)";
        String shortenedMN = middleName;
        if (fullName.length > 2) {
            middleName = fullName[1];
            shortenedMN = middleNameMod(fullName[1]);
            lastName = fullName[2];
        } else if (fullName.length > 1) {
            //middleName = "(none)";
            lastName = fullName[1];
        }

        System.out.printf("""
                First name: %s
                Middle name: %s
                Last name: %s
                """, firstName, shortenedMN, lastName);
    }

    public static String middleNameMod (String middleName) {
        char charMiddleName = middleName.toUpperCase().charAt(0);
        String newMiddleName = charMiddleName + ".";
        return newMiddleName;
    }

    public static String[] nameSeparator(String word) {
        String[] names = word.split("\\ ");
        if (names[0].isEmpty()) {
            names[0] = "(none)";
        }
        return names;
    }
}
