import java.util.TreeMap;

public class Car {

    // ATRIBUTOS:
    String brand = "Nissan";
    String model = "Versa";
    int year = 2023;
    double price = 150000;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You start the engine...");
    }
    void stop() {
        isRunning = false;
        System.out.println("You stop the engine...");
    }
    void drive() {
        System.out.printf("You are driving the %s %s\n", brand, model);
    }
    void brake() {
        System.out.printf("You brake the %s", model);
    }
    void crash() {
        System.out.printf("You crashed the %s %s that is worth around $%.2f\n", brand, model, price);
        price = 0;
        System.out.println("The car is now worth $" + price);
    }
}
