import java.util.Scanner;

public class countdown_for {
    public static void main(String[] args) throws InterruptedException {  //serve para o sleep funcionar

        int start;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown from?: ");
        start = scanner.nextInt();
        System.out.println("We're starting the countdown!");

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year!");
    }
}
