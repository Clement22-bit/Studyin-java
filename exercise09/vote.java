package exercise09;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 9
        System.out.print("9. Age: ");
        int age9 = input.nextInt();

        if (age9 >= 16) {
            System.out.println("Can vote");
        } else {
            System.out.println("Cannot vote");
        }

        input.close();
    } 
}

