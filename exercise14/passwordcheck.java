package exercise14;

import java.util.Scanner;

public class passwordcheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("14. Password: ");
        String pass = input.next();

        if (pass.equals("java123")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        input.close();
    }
}
