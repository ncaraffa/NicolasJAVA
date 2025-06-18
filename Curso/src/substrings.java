import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {

        //.subtring() = Um metodo para extrair uma porção de uma String
        //              .substring(start, end)
        Scanner scanner = new Scanner(System.in);

        String email;
        String usuario;
        String domain;
        String numero;

        System.out.println("Digite seu email: ");
        email = scanner.nextLine();
        System.out.println("Digite seu número de telefone: ");
        numero = scanner.nextLine();

        if (email.contains("@")) {
            System.out.printf("Email: %s\n", email);
            System.out.printf("Usuario: %s\n", email.substring(0, email.indexOf("@")));
            System.out.printf("Domínio: %s\n", email.substring(email.indexOf("@")));
        }
        else {
            System.out.println("Email inválido.");
            System.exit(0);
        }
        System.out.printf("DDD: %s\n", numero.substring(0, 2));
        System.out.printf("Número: %s\n", numero.substring(2));





    /*String email = "boxtanicolas@gmail.com";
    String usuario = email.substring(0,email.indexOf("@"));
    String domain = email.substring(email.indexOf("@"));
        System.out.println(usuario+domain);*/
    }
}
