package BitwiseOperator;

public class UniqueElement {
    public static void main(String[] args) {
        int[]arr = { 1,2,3,4,6,4,3,2,1};
        int ans = findUnique(arr);
        System.out.println("Unique Element in the Array: " + ans);
    }
    static int findUnique(int[] arr){

        int unique = 0;

        for (int n: arr){
            unique = unique ^ n;
        }
        return unique;
    }
}
/*
   4 in binary: 100
   6 in binary: 110
   Bitwise XOR calculation:      (Same number leads to 0)
	• 1 ⊕ 1 = 0
	• 0 ⊕ 1 = 1
	• 0 ⊕ 0 = 0

 */
