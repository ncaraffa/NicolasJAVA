import java.util.Scanner;

public class par_impar_ternary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Escolha um número: ");
        numero = scanner.nextInt();
        String parOuImpar = (numero%2 == 0) ? "par" : "ímpar";
        System.out.println(parOuImpar);
    }
}
