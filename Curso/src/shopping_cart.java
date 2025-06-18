import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double preco;
        double quantidade;

        System.out.println("Que item você levará?: ");
        item = scanner.next();
        if (item.equals("nada")) {
            System.out.println("Você não levou nada");
            System.exit(0);
        }
        System.out.println("Qual o preço do item?: ");
        preco = scanner.nextDouble();
        System.out.println("Quantos desse item você quer?: ");
        quantidade = scanner.nextDouble();

        double mul = preco*quantidade;


        System.out.println("Você comprou "+quantidade+ " " +item+ "/s");
        System.out.println("O valor total é: R$"+mul);

    }

}
