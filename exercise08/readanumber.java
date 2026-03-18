package exercise08;

import java.util.Scanner;

public class readanumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("8. Number: ");
        double num8 = input.nextDouble();

        if (num8 >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        input.close();
    }
}
    

