// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String[] args) {
        
        int[] nums = {12, 345, 2, 6, 7896};

        int ans = findNums(nums);
        System.out.println("Numbers with even digits in the array: " + ans);

    }

    static int findNums (int[] nums){

        int count = 0;

        for (int i=0; i<nums.length; i++){
            if (countDigits(nums[i]) % 2 == 0){      // if the no. of digits at index i (at a particular index)
                count++;
            }
        }
        return count;
    }
    static int countDigits(int n){

        int digit = 0;

        while (n > 0){
            n = n / 10;
            digit++;
        }
        return digit;    
    }
}

/*

int countDigits (int n){
if (n <0){
n = n * - 1 }  // converts the negative number in positive
}
return (int)(Math.log10(n)) + 1;
 */


