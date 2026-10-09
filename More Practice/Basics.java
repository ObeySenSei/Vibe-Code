public class Basics {

    public static void main(String[] args) {

        // 1. if statement
        if (true) {
            System.out.println("Hello World");
        }

        // 2. if statement with comparison
        int a = 10;

        if (a == 10) {
            System.out.println("Hello World");
        }

        // 3. while loop
        int count = 6;

        while (count != 10) {
            System.out.println(count);
            count++;
        }

        int count1 = 1;
        while (count1 != 5) {
            System.out.println(count1);
            count1++;
        }

        for (int count2=1; count2<6; count2++){
            System.out.println(count2);
        }
    }
}