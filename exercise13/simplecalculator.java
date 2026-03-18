package exercise13;

import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("13. V1: ");
        double v1 = input.nextDouble();
        System.out.print("13. V2: ");
        double v2 = input.nextDouble();

        System.out.println(v1 + v2);
        System.out.println(v1 - v2);
        System.out.println(v1 * v2);
        if (v2 != 0) {
            System.out.println(v1 / v2);
        }

        input.close();
    }
}
    

