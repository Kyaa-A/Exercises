import java.io.*;

public class bufffered {

    public static void clearscreen() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size: ");
        int size = Integer.parseInt(br.readLine());

        clearscreen();
        
        for (int i = 1; i <= size - 1; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <= i - 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= size - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}