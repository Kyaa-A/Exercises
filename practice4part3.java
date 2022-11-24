public class practice4part3 {
    public static void main(String[] args) {
        
        String add;
        
        System.out.println("Third Pattern\n");

        System.out.println("*");
        for (int i = 0; i <= 3; i++){ 
            add = "**";
            for (int j = 0; j < i; j++){
                add += "*";
            }
            System.out.printf("%5s", add);
            System.out.println();
        }
        System.out.println(); 
    }
}   
