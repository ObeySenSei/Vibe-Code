public class MethodChain {
    public static void main(String[] args) {
        
        int[] arr = {4, 7, 4, 2, 7, 10, 2};
        System.out.println(MethodChain(arr));
    }


    static int[] removeDuplicates(int[] arr) {

        int[] result = new int [arr.length];
        int count = 0;                           // Here we count the values stored so far

        for (int i=0; i<arr.length; i++){
            boolean found = false;
            
            for (int j=0; j<count; j++){
                if (arr[i]==result[j]){
                    found = true;
                    break;
                }
            }
            if (!found){
                result[count] = arr[i];
                count++;
            }
        }

        int[] uniqueArr = new int [count];    // Here a create anew array to remove the unused elements of size COUNT 
                                              
        for (int i=0; i<count; i++){     // because remember count actually stores the no. of unique elements in the array
            uniqueArr[i] = result[i];         // Then copy the actual values from int[] result array.
        }                                   
        return uniqueArr;
    }

    static int findLargest (int[] arr){
        
        int largestNum = arr[0];

        for (int i=1; i<arr.length; i++){   // i=1 because we have already assumed that arr[0] is the largestNum
                  
                if (arr[i] > largestNum){
                largestNum = arr[i];     
                }
            }
        return largestNum;
    }

    static boolean isEven (int n){

        if (n % 2 != 0){
            return false;
        }
        return true;
    }


    static boolean MethodChain(int[] arr){
        int[] uniqueArr = removeDuplicates(arr);
        int largest = findLargest(uniqueArr);
        return isEven (largest);
    }
}
