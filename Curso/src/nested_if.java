import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior;
        double price = 9.99;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você é estudante?: ");
        isStudent = scanner.nextBoolean();
        System.out.println("Você é Idoso?: ");
        isSenior = scanner.nextBoolean();

        if (isStudent) {
            if (isSenior) {
                System.out.println("Você tem 10% de desconto");
                //System.out.println("Você tem 20% de desconto");
                price = price * 0.7;
            }
            else {
                System.out.println("Você tem 10% de desconto");
                price = price * 0.9;
            }
        }
        else {
            price = price * 1;
        }
        if (isSenior) {
            System.out.println("Você tem 20% de desconto");
            price = price * 0.8;
        }
        else {
            price = price * 1;
        }

        System.out.printf("O total é: R$%,.2f", price);







    }
}
