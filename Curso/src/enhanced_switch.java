import java.util.Scanner;

public class enhanced_switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.println("What's the day of the week?: ");
        day = scanner.nextLine();

        switch (day) {
            case "Monday" -> System.out.println("It's monday");         //SETA == "FAÇA ISSO"
            case "Tuesday" -> System.out.println("It's tuesday");
            case "Wednesday" -> System.out.println("It's Wednesday");
            case "Thursday" -> System.out.println("It's Thursday");
            case "Friday" -> System.out.println("It's Friday");
            case "Saturday" -> System.out.println("It's Saturday");
            case "Sunday" -> System.out.println("It's Sunday");
            default -> System.out.printf("%s is not a day", day);
        }



    }
}
