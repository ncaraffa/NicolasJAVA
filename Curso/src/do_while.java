import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {                                                       // primeiro execute o que é pedido pelo menos uma vez
            System.out.print("Enter a number between 1 - 10: ");   // depois veja se a condição é verdadeira ou falsa
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.print("You picked "+ number);

    }
}
