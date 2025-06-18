import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome1;
        String adjetivo1;
        String nome2;
        String verbo1;
        String adjetivo2;

        System.out.println("Escolha um nome: ");
        nome1 = scanner.next();

        System.out.println("Escolha um adjetivo: ");
        adjetivo1 = scanner.next();

        System.out.println("Escolha outro nome: ");
        nome2 = scanner.next();

        System.out.println("Escolha um verbo: ");
        verbo1 = scanner.next();

        System.out.println("Escolha outro adjetivo: ");
        adjetivo2 = scanner.next();

        System.out.println("Oi, eu sou "+nome1);
        System.out.println("Eu sou "+adjetivo1);
        System.out.println("Hoje eu vi meu amigo(a) "+nome2);
        System.out.println("Estavamos comendo, até que nós nos "+verbo1);
        System.out.println("E assim estamos, "+adjetivo2+ " para sempre");
    }
}