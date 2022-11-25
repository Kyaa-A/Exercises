import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input:");
        System.out.print("Enter the amount of change from 1 to 99:\t");
        int num = scan.nextInt();
        int cents = num;

        int quarter = cents / 25;
        cents %= 25;

        int dime = cents / 10;
        cents %= 10;
        
        int nickels = cents / 5;
        cents %= 5;
        
        int penny = cents;

        System.out.println("\nOutput: ");

        if(num>=1 && num<=99){
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
            System.out.println("\nInvalid-Maximum is only 1-99: " + num);
        }
        System.out.println();
    }
}
