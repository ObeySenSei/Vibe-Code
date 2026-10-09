import java.util.Arrays;

public class PassArr {

    public static void main(String[] args) {

        int[] arr = {1, 0, 4, 5, 7};

        System.out.println("Before change: " + Arrays.toString(arr));
        
        change(arr);       // Method Call
       
        System.out.println("After change:  " + Arrays.toString(arr));

        /* 
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        */
    }
    static void change(int[] arr) {
        arr[1] = 99;
    }
}