public class Fibonacci {
    public static void main(String[] args) {

        int termos = 15;
        int n1 = 0;
        int n2 = 1;

        for (int i = 3; i <= termos; i++) {
            int proximo = n1 + n2;
            System.out.println("O proximo número de fibonacci é: "+ proximo);

            n1 = n2;
            n2 = proximo;
        }

    }
}
