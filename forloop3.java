/*
 * Write a program that will print a box of *’s taking from user the height and width values.
 */


public class forloop3{
    public static void main(String[] args) {

        int num = 5;
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}