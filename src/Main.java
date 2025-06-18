import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nota 1: ");
        double n1 = scanner.nextDouble();

        System.out.println("Nota 2: ");
        double n2 = scanner.nextDouble();

        double n3 = n1+n2;

        System.out.println("Sua média é: "+ n3/2);
    }
}