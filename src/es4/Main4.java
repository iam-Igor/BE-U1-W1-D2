package es4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert a number to start counter");
        int number = Integer.parseInt(userInput.nextLine());


        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }

    }


}
