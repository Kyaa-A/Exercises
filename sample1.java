import java.util.Scanner;

public class sample1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
/*         String info[] = {"Name","Gender","Address"};


        for (int i = 0; i < 3; i++) {
            System.out.print("Input your " + info[i] + ":\t");
            info[i] = scan.nextLine();
        }
       System.out.println("Your name is " + info[0] + " and you are a " + info[1] + " and you live in " + info[2] );
 */    
        String noOfDays[][]= {{"w","Worked"},{"l","Late"},{"u","Undertime"},{"a","Absent"}};

        for (int i = 0; i < noOfDays.length; i++) {
            System.out.print("No. of days "+ noOfDays[i+1][1] +":\t    ");

            System.out.println();
        }
        

    }
}