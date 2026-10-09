public class Shadowing {

    static int x = 90; // class/static variable

    public static void main(String[] args) {

        System.out.println(x); // 90

        int x = 40; // local variable shadows static x

        System.out.println(x); // 40

        fun();
    }

    static void fun() {
        System.out.println(x + 1); // 90
    }
}