package BitwiseOperator;

public class And {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }
    static boolean isOdd (int n){

        return  (n & 1) == 1;
    }
}

/*

If the last bit is 1, the number is odd.
If the last bit is 0, the number is even.

   1 0 0 0 0 1 1    (67)
&  0 0 0 0 0 0 1    (1)
------------------
   0 0 0 0 0 0 1    (result = 1)  Least Significant Bit - LSB

In & Operation on 1 & 1 gives 1.
 */