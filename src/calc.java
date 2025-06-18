import java.util.Scanner;

public class calc {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um valor: ");
        double n1 = scanner.nextDouble();

        System.out.println("Escolha outro valor: ");
        double n2 = scanner.nextDouble();

        System.out.println("Escolha a operação:\n 1.soma\n 2.subtração\n 3.multiplicação\n 4.divisão\n");
        int n3 = scanner.nextInt();

        double soma = n1+n2;
        double subtracao = n1-n2;
        double multiplicacao = n1*n2;
        double divisao = n1/n2;

        if (n3 == 1) {
            System.out.println(" "+n1+ " + "+n2+ " = "+soma);
            if (n3 == 1 && soma == 11) {
                System.out.println("\nNúmero da sorte!");
            }
        } else if (n3 == 2) {
            System.out.printf("%s - %s = %s", n1, n2, subtracao);
            if (n3 == 2 && subtracao == 11) {
                System.out.println("\nNúmero da sorte!");
            }

        } else if (n3 == 3) {
            System.out.printf("%s x %s = %s", n1, n2, multiplicacao);
            if (n3 == 3 && multiplicacao == 11) {
                System.out.println("\nNúmero da sorte!");
            }

        } else if (n3 == 4) {
            System.out.printf("%s : %s = %s", n1, n2, divisao);
            if (n3 == 4 && divisao == 11) {
                System.out.println("\nNúmero da sorte!");
            }

        } else {
            System.out.println("Escolha uma operação válida!");
        }

    }

}
