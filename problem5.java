import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sample");
        System.out.print("Input the year: ");
        int year = scan.nextInt();
        
        System.out.println("\n----Output---");
        if (year % 4 == 0){
            if ( year % 100 == 0){
                if ( year % 400 == 0){
                    System.out.println(year + " is a leap year");
                }
                else{
                    System.out.println(year + " is not a leap year");
                }
            }
            else{
                System.out.println(year + " is a leap year");
            }
        }
        else{
            System.out.println(year + " is not a leap year");
        }
        System.out.println( );
    }
}
