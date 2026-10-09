import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter day number: ");
        int day = in.nextInt();

        // 1. Traditional switch
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }

        // 2. Modern switch using ->
        switch (day) {

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        // 3. Multiple cases using traditional syntax
        switch (day) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day");
        }

        // 4. Multiple cases using modern syntax
        switch (day) {

            case 1, 2, 3, 4, 5 ->
                System.out.println("Weekday");

            case 6, 7 ->
                System.out.println("Weekend");

            default ->
                System.out.println("Invalid day");
        }

        in.close();
    }
}