import java.util.Scanner;

public class TypeCastin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // =========================================================
        // 1. EXPLICIT TYPE CASTING
        // =========================================================

        // 68.75f is a float.
        //
        // We are converting the float value into an int.
        // int cannot store the decimal part.
        //
        // Therefore:
        // 68.75f  --->  68
        //
        // (int) is called EXPLICIT TYPE CASTING because
        // we are manually telling Java to convert the type.

        int num = (int) (68.75f);

        System.out.println(num);       // Output: 68



        // =========================================================
        // 2. CASTING int TO byte
        // =========================================================

        // An int can store much larger numbers than a byte.
        //
        // int a = 257
        //
        // byte can store only:
        // -128 to 127
        //
        // So Java cannot automatically convert int to byte.
        // We have to explicitly cast it.

        int a = 257;

        byte b = (byte) a;

        // A byte has 8 bits.
        //
        // Therefore, when converting an integer to byte,
        // Java effectively keeps the lowest 8 bits.
        //
        // 257 % 256 = 1
        //
        // Therefore:
        // 257 ---> byte ---> 1

        System.out.println(b);         // Output: 1



        // =========================================================
        // 3. AUTOMATIC TYPE PROMOTION IN EXPRESSIONS
        // =========================================================

        // byte variables:

        byte x = 40;
        byte y = 50;
        byte z = 100;

        // You might think:
        //
        // byte result = x * y / z;
        //
        // But Java does NOT perform arithmetic using byte.
        //
        // When byte, short or char are used in an arithmetic
        // expression, Java automatically promotes them to int.
        //
        // So this:
        //
        // x * y / z
        //
        // is effectively treated as:
        //
        // int * int / int
        //
        // 40 * 50 / 100
        // = 2000 / 100
        // = 20
        //
        // Therefore the result is an int.

        int d = x * y / z;

        System.out.println(d);         // Output: 20



        // =========================================================
        // 4. WHY DOES THIS NOT WORK?
        // =========================================================

        // byte p = 50;
        //
        // p = p * 2;


        // The above gives a compilation error.
        //
        // Why?
        //
        // p is a byte.
        //
        // But when Java evaluates:
        //
        // p * 2
        //
        // the byte p is automatically promoted to int.
        //
        // So Java actually sees:
        //
        // int * int
        //
        // which produces an int.
        //
        // Therefore:
        //
        // p * 2
        //
        // produces an int, NOT a byte.
        //
        // Java will not automatically put that int back into
        // a byte because an int could contain a value too large
        // for a byte.
        //
        // You must explicitly cast it:

        byte p = 50;

        p = (byte) (p * 2);

        System.out.println(p);         // Output: 100



        // =========================================================
        // 5. CHARACTER TO INTEGER
        // =========================================================

        // A char is actually stored using a numeric Unicode value.
        //
        // The Unicode value of 'A' is 65.
        //
        // Therefore Java can automatically promote char to int.

        int number = 'A';

        System.out.println(number);    // Output: 65



        // =========================================================
        // 6. int + double/float PROMOTION
        // =========================================================

        // 6.45 is a double by default.
        //
        // Therefore:
        //
        // 7 * 6.45
        //
        // becomes:
        //
        // int * double
        //
        // Java promotes the int 7 to double.
        //
        // 7.0 * 6.45 = 45.15

        System.out.println(7 * 6.45);

        // Output:
        // 45.15



        // =========================================================
        // 7. int * int
        // =========================================================

        // Both 7 and 7 are int values.
        //
        // Therefore Java performs integer arithmetic.

        System.out.println(7 * 7);

        // Output:
        // 49
        

        b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;

        // Java automatically promotes smaller data types
        // when they are used in arithmetic expressions.

        double result = (f * b) + (i / c) - (d - s);

        System.out.println("f * b  = " + (f * b));
        System.out.println("i / c  = " + (i / c));
        System.out.println("d - s  = " + (d - s));

        System.out.println("Result = " + result);

    }
}