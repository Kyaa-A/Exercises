import java.util.Scanner;

public class morsecode {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String morse = "";
        String word = "";
        String translate = "";
        boolean bool = false;
        int category;

        String letter[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        String code[] = { "*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**",
                "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**" };

        do {

            System.out.println("Category 0 - Convert texts to morse code");
            System.out.println("Category 1 - Convert morse code to texts");
            System.out.println("-".repeat(24) + "INPUT" + "-".repeat(23));
            System.out.print("Enter the Category:\t");
            category = scan.nextInt();

            if (category == 0) {
                System.out.println("You select Category 0 - Convert texts to morse code");
                System.out.println("-".repeat(52));
                System.out.print("Type your word here separated by - dash: ");

                word = scan.next();
                word = word.toLowerCase();

                String wordSplit[] = word.split("-");

                for (int i = 0; i < wordSplit.length; i++) {
                    for (int j = 0; j < letter.length; j++) {
                        if (wordSplit[i].equals(letter[j])) {
                            translate += code[j] + "|";
                            bool = true;
                        }
                    }
                }

            } else if (category == 1) {
                System.out.println("You select Category 1 - Convert morse code to text");
                System.out.println("-".repeat(52));
                System.out.print("Type your morse code here separated by | line: ");

                morse = scan.next();

                String morseSplit[] = morse.split("\\|");

                for (int i = 0; i < morseSplit.length; i++) {
                    for (int j = 0; j < code.length; j++) {
                        if (morseSplit[i].equals(code[j])) {
                            char c = letter[j].charAt(0);

                            if (i == 0) {
                                word += Character.toUpperCase(c);
                            } else {
                                word += c;
                            }
                            bool = true;
                        }
                    }
                }

            }


            if (category == 0) {
                System.out.println("-".repeat(24) + "OUTPUT" + "-".repeat(23));
                System.out.println(translate);
            } else if (category == 1) {
                System.out.println("-".repeat(24) + "OUTPUT" + "-".repeat(23));
                System.out.println(word);
            }

            System.out.print("\nDo you want to continue? Y/N: ");
            String willcontinue = scan.next();
            System.out.println();

            if (willcontinue.equalsIgnoreCase("Y")) {
                bool = true;
            } else {
                bool = false;
            }

            translate = "";
            word = "";

        } while (bool);
        scan.close();
        
    }
}