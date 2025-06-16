import java.util.Scanner;

public class circunferencia_area_volume {
    public static void main(String[] args) {

        //circumference = 2 * PI * radius
        //area = PI.r²
        //volume = 4/3 * PI * r³ -------> Volume de uma Esfera

        double radius;
        double circ;
        double area;
        double volume;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do raio?: ");
        radius = scanner.nextDouble();

        circ = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius, 2);
        volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);  //(4/3) é diferente de (4.0/3.0)
                                                     //Um é divisão de inteiros, e o outro é divisão decimal.

        System.out.printf("A circunferência mede: %.2fcm\n", circ);
        System.out.printf("A area mede: %.2fcm²\n", area);
        System.out.printf("O volume é de: %.2fm³\n", volume);



    }
}
