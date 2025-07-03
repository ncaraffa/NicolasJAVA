import java.util.Scanner;

public class user_input_array2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] countries;
        int size;

        System.out.println("How many countries do you want to list?: ");
        size = scanner.nextInt();
        scanner.nextLine();    //  <------ ESSE SCANNER É USADO POIS SCANEAMOS UM INTEIRO E DEPOIS UMA LINHA
                               //          LOGO ELE É NECESSÁRIO PARA NAO PULARMOS UMA RESPOSTA (Limpar o buffer)!!!!!

        countries = new String[size];

        for (int i = 0; i < countries.length; i++) {
            System.out.printf("Enter %d countries: ", size--);
            countries[i] = scanner.nextLine();
        }
        for (String country : countries) {
            System.out.println("You chose: "+ country);
        }
    }
}