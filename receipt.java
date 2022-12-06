import java.io.IOException;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class receipt{
    
    public static void clearscreen(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  

    System.out.println(" "+"*".repeat(30));
        System.out.print(" Enter Cashier Name:\t");
            String name = scan.next();
        System.out.print(" Enter O.R. No:\t\t");
            String ORnum = scan.next();
    System.out.println(" "+"*".repeat(30));
        System.out.print(" Enter number of items:\t");
            int numOfItems = scan.nextInt();
    System.out.println(" "+"*".repeat(30));
        
        String products[] = new String[numOfItems];
        int prices[] = new int[numOfItems];
        int quantities[] = new int[numOfItems];

        String productName = "";
        int productQuantity = 0;
        for (int i = 1; i <= numOfItems; i++) {

            System.out.println(" Product " + i);
            System.out.println();
            System.out.print(" Enter Item Name:\t");
            productName = scan.next();
            products[i-1] = productName;

            System.out.print(" Enter Item Price:\t");
            int productPrice = scan.nextInt();
            prices[i-1] = productPrice;

            System.out.print(" Enter Item Quantity:\t");
            productQuantity = scan.nextInt();
            quantities[i-1] = productQuantity;
            
            System.out.println(" "+"-".repeat(30));
        }

        int productAmount = 0;
        int finalProductAmount = 0;
        for (int i = 0; i < numOfItems; i++) {
            productAmount = prices[i] * quantities[i];
            finalProductAmount += productAmount;
        }

        double tax = finalProductAmount*0.05;
        double totalPayment = finalProductAmount+tax;
        System.out.println(" TOTAL PAYMENT:\t\t"+totalPayment);
        System.out.println(" "+"*".repeat(30));

        System.out.print(" Enter Customer Payment:  ");
        int payment = scan.nextInt();

        while(payment<totalPayment){
            System.out.print(" Enter Customer Payment:  ");
            payment = scan.nextInt();
        }
        System.out.println(" "+"*".repeat(30));

        clearscreen();

        System.out.println("\t\tPURCHASE RECEIPT");
        System.out.println(" Cashier: " + name);
        System.out.print(" Date: " + formatter.format(date) + " ".repeat(8));
        System.out.println("O.R No.: " + ORnum);
        System.out.println(" "+"*".repeat(45));
        System.out.println(" Qty.\tItem/s\t\t\tPrice/s");

    
    }
}