import java.util.Scanner;

public class sample1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String info[] = {"Name","Gender","Address"};


        for (int i = 0; i < 3; i++) {
            System.out.print("Input your " + info[i] + ":\t");
            info[i] = scan.nextLine();
        }
       System.out.println("Your name is " + info[0] + " and you are a " + info[1] + " and you live in " + info[2] );
    }
}