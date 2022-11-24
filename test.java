    //Exercise 3 ― Reversed Display
    //Having the same elements from Exercise 1, 
    /* create a java program that display the elements with indexes: 0,2,4,6,8 */

public class test {
    public static void main(String[] args) {

        int list[] = {12,23,120,60,320,45,93,21,60,310};

        System.out.print("Elements:\t");

        for (int i = 0; i < list.length; i+=2) {
        if(i>0){
            System.out.print(", ");
        }
        System.out.print(list[i]);
        }
        System.out.println();
    }
}
