package es3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("Insert a word");
        String word2 = userInput.nextLine();

        if (word2.equals(":q")) {
            System.out.println("You pressed the escape character!");
        } else {
            int i = 0;
            while (i < word2.length()) {
                System.out.print(word2.charAt(i) + ",");
                i++;
            }

        }


    }


}



