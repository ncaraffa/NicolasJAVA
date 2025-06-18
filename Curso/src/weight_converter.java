import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args) {

        double peso;
        int escolha;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao conversor de peso!\n");
        System.out.println("Opção 1: Converter kg/s para lbs\nOpção 2: Converter lbs para kg/s\n");
        escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.println("Qual seu peso original em kg/s?: ");
            peso = scanner.nextDouble();
            System.out.printf("Seu peso em lbs é: %,.2flbs", peso*2.2);
        }
        else if (escolha == 2) {
            System.out.println("Qual seu peso original em lbs?: ");
            peso = scanner.nextDouble();
            System.out.printf("Seu peso em kg/s é: %,.2fkg/s", peso/2.2);
        }
        else {
            System.out.println("Opção inválida");
        }
    }
}
