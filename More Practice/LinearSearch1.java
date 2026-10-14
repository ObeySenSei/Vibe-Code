public class LinearSearch1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 6;
        
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        
    }

    static int linearSearch (int[] arr, int target){     // what do i want to search
        if (arr.length == 0){
            return -1;
        }

        for (int i=0; i<arr.length; i++){    //check for element at every index if its equal to taget
            
            int element = arr[i];      // We initialize element inside the for loop because the element we want to check changes with every iteration.

            if (element == target){
                return i;
            }
        }    
        return -1;  
    }
}
