import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        // think of it as a variable that can store more than 1 value

        String[] fruits = {"apple", "orange", "watermelon", "banana"};

        // fruits.length

        /*for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);

        }*/

        //Arrays.sort(fruits);   // Array class, good for when using arrays
                               // Has a lot of funcionalities

        //*********************************

        //Arrays.fill(fruits, "pineapple");

        //*********************************

        // Enhanced for loop

        for (String fruit : fruits) {       // AKA "For each loop"
            System.out.println(fruit);      // Simplifies iterating a collection
        }

    }
}
