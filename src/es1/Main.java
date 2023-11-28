package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Insert a word and i will return true if the length is odd or false if is even");
        String word1 = userInput.nextLine();
        System.out.println(oddOrEven(word1));


        System.out.println("Insert an year in format yyyy and i wil tell if is a leap year");
        int year = Integer.parseInt(userInput.nextLine());
        System.out.println(leapYear(year));


    }


    public static boolean oddOrEven(String word) {
        if (word.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean leapYear(int num) {
        if (num % 4 == 0) {
            return true;
        } else if (num % 100 == 0 && num % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }
}