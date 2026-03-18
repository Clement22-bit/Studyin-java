package exercise04;

import java.util.Scanner;

public class Calculator02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = input.nextDouble();


        double doublevalue = number * 2;
        double triplevalue = number * 3;

        System.out.println("Double of " + number + " is: " + doublevalue);
        System.out.println("Triple of " + number + " is " + triplevalue);

        input.close();
    }
    
}
