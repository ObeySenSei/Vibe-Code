import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your fruit to know its colour");
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("Yellow");
                break;

            case "Apple":
                System.out.println("Red");
                break;

            case "Orange":
                System.out.println("Orange");
                break;

            case "Capsicum":
                System.out.println("Green");
                break;

            default:
                System.out.println("Please enter a valid food!");
        }
    }
}

