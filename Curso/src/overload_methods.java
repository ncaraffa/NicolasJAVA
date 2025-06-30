public class overload_methods {
    public static void main(String[] args) {

        // Overload methods = métodos que compartilham o mesmo nome, mas com parâmetros diferentes
        // signature = name + parameters

        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");

        System.out.println(pizza);
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
