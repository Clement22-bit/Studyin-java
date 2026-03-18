package exercise10;

import java.util.Scanner;

public class odd { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        
        System.out.print("10. Number: ");
        int n10 = input.nextInt();
        if (n10 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        input.close();
    }
}



