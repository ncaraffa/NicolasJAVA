import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {

        //HIPOTENUSA c = Math.sqrt(a²+ b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Qual o valor de a?: ");
        a = scanner.nextDouble();
        System.out.println("Qual o valor de b?: ");
        b = scanner.nextDouble();

        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        c = Math.sqrt(a+b);

        System.out.println("O resultado é "+c);



    }
}
