import java.util.Arrays;
import java.util.Scanner;

public class receipt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("*".repeat(25));
        System.out.print("Enter Cashier Name:\t\t");
        String name = scan.next();
        System.out.print("Enter O.R. No:\t\t\t");
        String ORnum = scan.next();
        System.out.println("*".repeat(25));
        System.out.print("Enter number of items:\t\t");
        int numOfItems = scan.nextInt();
        System.out.println("*".repeat(25));
        
        String products[] = new String[numOfItems];
        int prices[] = new int[numOfItems];
        int quantities[] = new int[numOfItems];

        String productName = "";
        int productQuantity = 0;
        for (int i = 1; i <= numOfItems; i++) {

            System.out.println("Product " + i);

            System.out.print("Enter Item Name:\t\t");
            productName = scan.next();
            products[i-1] = productName;

            System.out.print("Enter Item Price:\t\t");
            int productPrice = scan.nextInt();
            prices[i-1] = productPrice;

            System.out.print("Enter Item Quantity:\t\t");
            productQuantity = scan.nextInt();
            quantities[i-1] = productQuantity;
            
            System.out.println("-".repeat(25));
        }

        int productAmount = 0;
        int finalProductAmount = 0;
        for (int i = 0; i < numOfItems; i++) {
            productAmount = prices[i] * quantities[i];
            finalProductAmount += productAmount;
        }
        System.out.println(finalProductAmount);



        int totalPayment = 0;
        for (int i = 0; i < prices.length; i++) {
            totalPayment += prices[i];
        }

        System.out.println(totalPayment);

        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(quantities));

    }
}