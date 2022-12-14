import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ageidentifier {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();

        int mybday[] = new int[3];
        int currdate[] = new int[3];

        boolean datevalid = true;
        String birthday = "";

        String dateNow = dtf.format(now);
        System.out.println("Current Date: " + dateNow);

        do {
            try {
                System.out.print("\nEnter Your Birthday (MM/dd/yyyy): ");
                birthday = scan.nextLine();
                dtf.parse(birthday);
                datevalid = true;
            } catch (Exception e) {
                System.out.println("Error, Try Again...");
                datevalid = false;
            }
        } while (!datevalid);

        String date[] = dateNow.split("/");
        String bday[] = birthday.split("/");

        for (int i = 0; i < bday.length; i++) {
            mybday[i] = Integer.parseInt(bday[i]);
        }

        for (int i = 0; i < date.length; i++) {
            currdate[i] = Integer.parseInt(date[i]);
        }

        int age = currdate[2] - mybday[2];

        if (mybday[0] > currdate[0]) {
            age--;
        } else if (mybday[0] == currdate[0]) {
            if (mybday[1] > currdate[1]) {
                age--;
            }
        }
        System.out.println("\nYou are " + age + " years old. " + "\n");
    }
}