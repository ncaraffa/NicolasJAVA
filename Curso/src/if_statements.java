import java.util.Scanner;

public class if_statements {
    public static void main (String[] args) {

        String nome;
        int idade;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Nome: ");
        nome = scanner.nextLine();

        System.out.println("Idade: ");
        idade = scanner.nextInt();

        System.out.println("Você é estudante?(true or false)");
        isStudent = scanner.nextBoolean();


        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        if (isStudent) {
            System.out.println("É estudante");
        }
        else {
            System.out.println("Não é estudante");
        }







    }
}
