//Write a Java program that takes a year from the user and print whether that year is a leap year or not

import java.util.*;

public class leapyear {
    public static void main(String[] args) {

        int year = 2024;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("It is not a leap year");
                }
            } else {
                System.out.println("It is a leap year.");
            }
        } else {
            System.out.println("It is not a leap year.");
        }
// Another possible solution

        if ( (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}