import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empID = in.nextInt();

        switch (empID) {

            case 1:
                System.out.println("Employee: Kunal Kushwaha");
                break;

            case 2:
                System.out.println("Employee: Aman Sharma");
                break;

            case 3:
                System.out.println("Employee: Rahul Verma");

                System.out.print("Enter Department: ");
                String department = in.next();

                switch (department) {

                    case "IT":
                        System.out.println("Department: IT");
                        break;

                    case "HR":
                        System.out.println("Department: HR");
                        break;

                    case "Finance":
                        System.out.println("Department: Finance");
                        break;

                    default:
                        System.out.println("Invalid Department");
                }

                break;

            default:
                System.out.println("Enter correct Employee ID");
        }

        in.close();
    }
}