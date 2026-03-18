package exercise05;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        double number = input.nextDouble();

        double square = number * number;

        System.out.println("The square of " + number + " is: " + square);

        input.close();
    }   
}
