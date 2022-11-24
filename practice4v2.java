public class practice4v2 {
    public static void main(String[] args) {
        
        // First
        System.out.println("First Pattern\n");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second
        System.out.println("\nSecond Pattern\n");
        for (int i = 0; i <= 5; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Third
        System.out.println("\nThird Pattern\n");
        System.out.println("*");
        for (int i = 0; i <= 3; i++){
            String add = "**";
            for (int j = 0; j < i; j++){
                add += "*";
            }
            System.out.printf("%5s", add);
            System.out.println();
        }
        System.out.println();

    }
}

