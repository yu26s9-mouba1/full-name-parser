package com.pluralsight;
import java.util.Scanner;
public class FullNameParcer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      //Prompting the user for for their first and last name
        System.out.println("Please enter your name (first last or first middle last:)");
        String fullName = scanner.nextLine().trim();

        //splitting the name into parts usint .plit
        String[] parts = fullName.split("\\s+");

        String firstName;
        String middleName;
        String lastName;

        //Using if-else statements to determine the range of name structure

        if (parts.length == 2) {
            firstName = parts[0];
            middleName = "(none)";
            lastName = parts[1];
        } else if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            System.out.println("Invalid input. Please enter only first last or first middle last.");
            scanner.close();
            return;
        }

        //Printing name based on the user input

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();








    }
}
