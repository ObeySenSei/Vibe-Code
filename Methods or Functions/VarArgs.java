import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(2,3,4,5,6,7);
    }

    static void fun(int... n) {
        System.out.println(Arrays.toString(n));
    }
}