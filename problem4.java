import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month[][] = {
            {"January", "31"},
            {"February", "28"},
            {"March", "31"},
            {"April", "30"},
            {"May", "31"},
            {"June", "30"},
            {"July", "31"},
            {"August", "31"},
            {"September", "30"},
            {"October", "31"},
            {"November", "30"},
            {"December", "31"}
        };

        System.out.println("Sample");
        System.out.print("Input a month number: ");
        int num = scan.nextInt();

        System.out.print("Input a year: ");
        int year = scan.nextInt();
        scan.close();

        if (num == 2){
            if (year % 4 == 0){
                if ( year % 100 == 0){
                    if ( year % 400 == 0){
                        month[1][1] = "29";
                    }
                    else{
                        month[1][1] = "28";
                    }
                }
                else{
                    month[1][1] = "29";
                }
            }
            else{
                month[1][1] = "28";
            }
           
        }

        System.out.println("\nOutput: ");
        System.out.println(month[num-1][0] + " " + year +
        " has " + month[num-1][1] + " days");
        System.out.println();



    }
}
