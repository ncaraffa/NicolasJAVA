import java.util.Scanner;

public class for_loops {
    public static void main(String[] args) {

        // for loop = executar um codigo uma certa QUANTIA de vezes

        Scanner scanner = new Scanner(System.in);

        int choice;

        System.out.println("How many times do you want to loop?: ");
        choice = scanner.nextInt();

        for (int i = 1; i <= choice; i++) {
            System.out.println(i);
        }
    }
}
