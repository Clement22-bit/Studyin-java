package exercise07;

import java.util.Scanner; 

public class two {
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in); 

        System.out.print("6. Name: ");
        String name6 = input.nextLine();
        
        System.out.print("6. Age: ");
        int age6 = input.nextInt();
        
        System.out.println(name6 + " " + age6);
        
        input.close(); 
    } 
} 



    

    