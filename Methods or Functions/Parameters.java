public class Parameters {

    public static void main(String[] args) {

        // Passing two parameters
        int ans = sum(20, 30);
        System.out.println("Sum is: " + ans);

        // Passing one parameter
        String message = Greet("Kunal Kushwaha");
        System.out.println(message);
    }

    // Two parameters
    static int sum(int a, int b) {

        int sum = a + b;
        return sum;
    }

    // One parameter
    static String Greet(String name) {

        String message = "Hello " + name;
        return message;
    }
}