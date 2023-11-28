package es2;

import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Insert a number and i will return it into a word");
        int number1 = Integer.parseInt(userInput.nextLine());
        switch (number1) {
            case 0: {
                System.out.println("Zero");
                break;
            }
            case 1: {
                System.out.println("One");
                break;
            }
            case 2: {
                System.out.println("Two");
                break;
            }
            case 3: {
                System.out.println("Three");
                break;
            }
            default:
                System.out.println("Error, you number must be a value between 0 and 3!");
        }
    }


}
