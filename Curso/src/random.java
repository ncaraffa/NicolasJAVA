import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main (String[] args) {

        Random random = new Random();

        int number;

        number = random.nextInt(1,20);

        System.out.println(number);
    }
}
