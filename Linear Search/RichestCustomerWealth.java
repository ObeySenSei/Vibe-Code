// https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        
        int[][] accounts = {{1,5},
                     {7,3},
                     {3,5}};

        int ans = findMaxSum(accounts);
        System.out.println("The highest total wealth is: " + ans);
    }
    static int findMaxSum(int[][] arr){

        int maxSum = 0;

        for ( int person = 0; person < arr.length; person++){
            int rowSum = 0;

            for (int account = 0; account < arr[person].length; account++){

                rowSum = rowSum + arr[person][account];
            }

            if (rowSum > maxSum){
                maxSum = rowSum;
            }
        }
        return maxSum;
    }
}

/*

maxSum is outside the outer loop, so it remembers the highest total across all people.
rowSum is inside the outer loop, so it resets to zero for each new person.

*/
