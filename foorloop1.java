
// Adding Up Integers

/* Write a program that add integers that the user enters. First the 
 * program asks how many numbers will be added up. then the 
 * program propmts the user for each number.
 * Finally it prints the sum. You may use any looping structures.
 */


import java.util.Scanner;

public class foorloop1{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("How many integers will be added: ");
        int total = scan.nextInt();
        System.out.println();
        
        int sum = 0;
        for (int i = 0; i < total; i++) {
            System.out.print("Enter an Integer:\t");
            int num = scan.nextInt();
            sum += num;
        }

        System.out.println("Total: " + sum);
    }
}



