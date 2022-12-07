/*
 * Write a Program that prints and defines a number if it is Even or Odd.
 */


public class forloop2{
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {

            if(i % 2 == 0){
                System.out.println(i + " Even");
            }else{
                System.out.println(i + " Odd");
            }
        }
    }
}