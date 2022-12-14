public class splitTest {
    public static void main(String[] args) {

        /*
         * String intro = "Hello/im/Asnari/B/Pacalna";
         * String test[] = intro.split("/");
         * 
         * for (int i = 0; i < test.length; i++) {
         * System.out.println(test[i]);
         * }
         */

        String str = " Hello, World ";

        // print the string without any function
        System.out.println("String is");
        System.out.println("#" + str + "#");
        System.out.println();

        // using strip() method - Remove spaces
        System.out.println("Using strip()");
        System.out.println("#" + str.strip() + "#");
        System.out.println();

        // using stripLeading() method - Remove spaces from the start
        System.out.println("Using stripLeading()");
        System.out.println("#" + str.stripLeading() + "#");
        System.out.println();

        // using stripTrailing() method - Remove spaces from the end
        System.out.println("Using stripTrailing()");
        System.out.println("#" + str.stripTrailing() + "#");
    }
}
