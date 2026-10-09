import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter some input !");
        int rollno = input.nextInt();
        System.out.println("Your roll no is " + rollno);

        int a = 234_000_000;

        System.out.println("Value of A is: $ " + String.format("%,d", a));
    }

}

// basically tells Java:  %,d Take this integer and display it with thousands separators."
// "%,d"

// This is the format instruction.

// Break it further:

// %   ,   d
// │   │   │
// │   │   └── decimal integer
// │   └────── use grouping separator (,)
// └────────── formatting starts