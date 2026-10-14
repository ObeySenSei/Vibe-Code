import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {

        System.out.println('a' + 'b');
        System.out.println("a"+"b");

        System.out.println('a' + 3);              // Value of small 'a' is ASCII is 97.
        System.out.println ((char) ('a' + 3));    // Type Casting         a + 3 = b, c, d

        System.out.println("a" + 3);
        // When an integer is concatenated with a string, it is converted to its wrapper class integer

        System.out.println("Debanga" + new ArrayList<>());
        System.out.println("Debanga" + new Integer (56));

    }
}
