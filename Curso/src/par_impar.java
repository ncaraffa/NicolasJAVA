import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1;

        System.out.println("Digite um valor: ");
        n1 = scanner.nextInt();

        if (n1 % 2 == 0) {
            System.out.println(""+n1+" é par");
        }

        else {
            System.out.println(""+n1+" é impar");
        }





    }
}
