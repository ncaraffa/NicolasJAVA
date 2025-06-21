import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String unit;
        double temp;

        System.out.println("Welcome, do you want to convert fahrenheit or celsius?");
        unit = scanner.nextLine();
        System.out.println("What's the temperature?");
        temp = scanner.nextDouble();

        double newTemperature = (unit.equalsIgnoreCase("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;
        System.out.printf("The temperature is: %,.1f°%s", newTemperature, unit);

    }
}
