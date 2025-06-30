public class variable_scope {

    static int x = 3;  // CLASS
                       // Esse cara ta andando na rua

    public static void main(String[] args) {

        // variable scope = onde uma variável pode ser acessada

        int x = 1;  // LOCAL
                    // Esse cara ta dentro de casa, e consegue ver o cara andando na rua

        System.out.println(x);

        doSomething();
    }
    static void doSomething() {

        int x = 2;  // LOCAL
                    // Esse cara tambem ta dentro de casa vendo o cara andando na rua, mas o vizinho dele nao sabe
                    // O vizinho dele é o metodo Main

        System.out.println(x);
    }
}
