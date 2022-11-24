import java.util.Arrays;

/* 3. Write a Java program to find the maximum and minimum value of an array*/

public class practice3 {
    public static void main(String[] args) {
        int num[] = {32, 76, 82, 36, 47, 96, 62, 56, 74, 89};
        
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int temp;
                if(num[i]>num[j]){ 
                    temp = num[i]; 
                    num[i] = num[j]; 
                    num[j] = temp; 
                }
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Largest number is:  " + num[num.length-1]);
        System.out.println("Smallest number is: " + num[0]);
    }
}
