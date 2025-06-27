import java.util.Scanner;

public class methods_mathExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number;

        System.out.print("Enter the number you want to square: ");
        number = scanner.nextInt();

        System.out.println(cube(number));
    }
    static double square(double number) {

        return number * number;    // pode usar o comando "Math.pow" no lugar

    }
    static double cube(double number) {

        return number * number * number;    // // pode usar o comando "Math.pow" no lugar

    }
}
