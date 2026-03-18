package exercise15;

import java.util.Scanner;

public class ageCategoryProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("15. Name: ");
        String name = input.next();
        System.out.print("15. Age: ");
        int age = input.nextInt();

        if (age < 12) {
            System.out.println(name + " Child");
        } else if (age < 18) {
            System.out.println(name + " Teenager");
        } else {
            System.out.println(name + " Adult");
        }

        input.close();
    }
}


