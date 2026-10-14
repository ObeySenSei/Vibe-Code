public class PrettyPrinting {
    public static void main(String[] args) {

        float a = 123.5321f;
        System.out.printf("Formatted number is: %.2f", a);   // %.2f is a Placeholder
        System.out.println();

        System.out.printf("%.3f", Math.PI);     // use printf
        System.out.println();

        // Printing text and numbers together

        String name = "Debanga";
        int age = 26;
        double marks = 89.956;
        System.out.printf("Name: %s, Age: %d, Marks: %.2f", name, age, marks);
        System.out.println();

        System.out.printf("Hello my name is %s and I am a %s", "Debanga", "Male");
        System.out.println();

    }
}

/*
In Java, we use printf() when we want to print output in a specific format —
especially when controlling decimal places, aligning columns, or combining different data types neatly.

Think of it this way:
- print() → print without automatically moving to the next line.
- println() → print and move to the next line.
- printf() → print using a format you specify.

 */
