package exercise11;

import java.util.Scanner;

public class classify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("11. Grade: ");
        int grade = input.nextInt();

        if (grade >= 90) {
            System.out.println("Excellent");
        } else if (grade >= 70) {
            System.out.println("Good");
        } else if (grade >= 50) {
            System.out.println("Regular");
        } else {
            System.out.println("Failed");
        }

        input.close();
    }
}
    

