import java.util.Scanner;

public class ternary_operator_exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String natty;
        System.out.println("O que natty é?: ");
        natty = scanner.nextLine();
        String fato = (natty.equals("linda")) ? "simm" : "ela é linda e ponto final";
        System.out.println(fato);
    }
}
