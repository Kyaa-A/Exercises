import java.util.Scanner;

public class sample1 {
    
    //Exercise 4 ― Odd and Even using array
    /* Ask 10 numbers from the user then determine the odd and even numbers entered by the user */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[10];
        int[] evenNum = new int[10];
        int[] oddNum = new int[10];

        System.out.println("***********INPUT***********");
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a number:\t");
            num[i] = scan.nextInt();
        }
        scan.close();

        System.out.println();
        System.out.println("***********OUTPUT***********");
        System.out.println();
        System.out.print("Even Elements:\t");
        for (int i = 0; i < evenNum.length-1; i++) {
            if (num[i]%2 == 0){
                evenNum[i] = num[i];
                if (i >= 0) {
                    System.out.print(evenNum[i]+ ", ");
                }
            }
        }
        System.out.print(evenNum[num.length-1]);
        System.out.println();

        System.out.print("Odd Elements:\t");
        for (int i = 1; i < oddNum.length; i++) {
            if (num[i]%2 == 1){
                oddNum[i] = num[i];
            }
            if (oddNum[i] != 0) {
                if (i >= 0) {
                    System.out.print(oddNum[i]+", ");
                }
            }
        }
        System.out.print(oddNum[oddNum.length-1]);
        System.out.println();
    }

}