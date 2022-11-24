
/*     1. Write a Java program to find the second largest element in an array.*/    

public class practice1 {
 
    public static void main(String[] args) {
   
        int num[] = {32, 76, 82, 36, 47, 96, 62, 56, 74, 89};
        int largest = num[0];
        int secondLargest = num[0];
      
        for (int i = 0; i < num.length; i++) {
   
            if (num[i] > largest) {
                
            secondLargest = largest;
            largest = num[i];

            } else if (num[i] > secondLargest) {
            secondLargest = num[i];
            }
        }
        System.out.println("Second largest number is: " + secondLargest);
    }
}