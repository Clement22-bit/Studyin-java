package exercise12;

import java.util.Scanner;

public class read3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("12. N1: ");
        double a = input.nextDouble();
        System.out.print("12. N2: ");
        double b = input.nextDouble();
        System.out.print("12. N3: ");
        double c = input.nextDouble();

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        input.close();
    }
}
    

