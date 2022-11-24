import java.util.Arrays;

/*  1. Write a Java program to find the second largest element in an array.*/    

public class practice1v2 {
    public static void main(String[] args) {
        
        int num[] = {32, 76, 82, 36, 47, 96, 62, 56, 74, 89};
        
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int temp; //temporary container
                if(num[i]>num[j]){   // num[0], num[1]
                    temp = num[i];   // temp = 32 
                    num[i] = num[j]; // num i = 76
                    num[j] = temp;   // num j = 32
                }
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Second largest number is: " + num[num.length-2]);
    }
}
