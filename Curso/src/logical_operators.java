public class logical_operators {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT

        double temp = 30;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("It`s sunny outside");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) {   //Ponto de exclamação = Valor oposto
            System.out.println("It`s sunny outside");
        } else if (temp >= 30 || temp <= 0) {
            System.out.println("The weather is bad");
        }
    }
}
