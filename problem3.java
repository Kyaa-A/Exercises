import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input:");
        System.out.print("\tEnter the amount of change from 1 to 99:\t");
        int num = scan.nextInt();
        scan.close();
        
        int cents = num;
        int quarter = cents / 25;
        cents %= 25;
        int dime = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        cents %= 5;
        int penny = cents;

        if(num>=1 && num<=99){
            System.out.println("\nOutput: ");
            System.out.println("\t" + num + " Cents in coins:");

            if(num>=25){
                System.out.println("\t" + quarter + " quarters\t\t" + (quarter*25));
                
                if(num>=10){
                    System.out.println("\t" + dime + " dime\t\t\t" + (dime*10));

                    if(num>=5){
                        System.out.println("\t" + nickels + " nickles\t\t" + (nickels*5));

                        if(num>=1){
                            System.out.println("\t" + penny + " penny\t\t\t" + penny);
                        }
                    }
                }
            }
        }else{
            System.out.print("\nOutput: ");
            System.out.println("\n\tInvalid-Maximum is only 1-99");
        }
        System.out.println();
    }
}
