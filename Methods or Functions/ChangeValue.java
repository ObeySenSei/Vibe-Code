import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {

        // Create an array
        int[] arr = {1, 3, 2, 45, 6};

        change(arr);

        System.out.println(Arrays.toString(arr));     // An array cannot be printed nicely just by doing: System.out.println(arr);
    }

    static void change(int[] nums) {

        nums[0] = 99;
    }
}

/*

Java is always pass-by-value.
For an int:
static void change(int x) {
    x = 99;
}
But for an array:
static void change(int[] nums) {
    nums[0] = 99;
}

*/