import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*         System.out.println("Input: ");

        int num = 0;
        System.out.print("Enter the amoung of change from 1 to 99: ");
        num = scan.nextInt();

        int quarter = num / 25;


        System.out.println("\nOutput: ");
        System.out.println("\t" + num + " Cents in coins: ");

        System.out.println("\t" + quarter + " quarters\t\t" + (quarter*25));

        int dime = quarter / 10;
        System.out.println("\t" + dime + " dime\t\t" + (dime*10)); */

        int num;
        System.out.print("Enter the amount of change from 1 to 99: ");
        num = scan.nextInt();

        int quarter = num / 25;

        int dime = num / 10;

        int nickels = num / 5;

        int penny = num / 1;


        if(num>=1 && num<=99){
            if(num>=25){
                System.out.println("\t" + quarter + " quarters\t\t" + (quarter*25));
                
                if(num>=10){
                    System.out.println("\t" + dime + " dime\t\t\t" + (dime*10));
                }
            }
        }else{
            System.out.println("\nInvalid-Maximum is only 1-99: " + num);
        }
    }
}
