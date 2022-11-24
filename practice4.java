import java.util.Scanner;

/* 4. Write a program to print following */

public class practice4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int row;
        int column;

        System.out.print("Enter number of Rows: ");
        row = scan.nextInt();

        System.out.print("Enter number of Columns: ");
        column = scan.nextInt();

        scan.close();

        int table[][] = new int[row+1][column+1];

        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}
