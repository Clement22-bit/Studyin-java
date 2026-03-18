package exercise03;

import java.util.Scanner;

public class Calculator { 
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num3 = input.nextDouble();

        System.out.println("Enter the second number:");
        double num6 = input.nextDouble();

        System.out.println("Sum: " + (num3 + num6));
        System.out.println("Subtraction" + (num3 - num6));
        System.out.println("Multiplication" + (num3 * num6));
        System.out.println("Division" + (num3 / num6));

        input.close();

    


    }
    
}
