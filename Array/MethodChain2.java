public class MethodChain2 {
    public static void main(String[] args) {

        int[] temperatures = {28, 30, 31, 29, 35, 36, 34, 38};
        temperatureReport(temperatures);
    }

    static void temperatureReport (int[] arr){  // Why void? Because this method's job is just to produce/print the report, not return a value.
        
       int risingDays = countRisingDays(arr);
       System.out.println("Total no. of days hotter than the previous day: " + risingDays);

       int longestPeriod =  longestRisingPeriod(arr);
       System.out.println("The longest consecutive period of rising temperature: " + longestPeriod);

       boolean hadIncrease = hadBigIncrease(arr);
       System.out.println("Was there a day where the temperature increased by at least 5°C ? " + hadIncrease);

       int largest = largestIncrease(arr);
       System.out.println("The largest temperature increase between consecutive days: " + largest);
    }

    static int countRisingDays (int[] arr){

        int isRisingDay = 0;

        for (int i=1; i<arr.length; i++){
            if (arr[i] > arr[i-1]){
                isRisingDay++;
            }
        }
        return isRisingDay;
    }
    static int longestRisingPeriod(int[] arr){
        
        int currentStreak = 0;
        int longestStreak = 0;
    
        for(int i=1; i<arr.length; i++){
           if (arr[i] > arr[i-1]){
                currentStreak++;
            } else {
                currentStreak =  0;
            }

        if (currentStreak > longestStreak){
            longestStreak = currentStreak;
            }
        }
        return longestStreak;
    }

    static boolean hadBigIncrease(int[] arr){

        for (int i=1; i<arr.length; i++){
            if (arr[i] - arr[i-1] >= 5){    // Was there a day where the temperature increased by at least 5°C from the previous day?
                return true;
            }
        }
        return false;
    }
    static int largestIncrease (int[] arr){

        int largestIncrease = 0;

        for (int i=1; i<arr.length; i++){
            if (arr[i] - arr[i-1] > largestIncrease){
                largestIncrease = arr[i] - arr[i-1];  // i.e largestIncrease = The value after subtracting arr[1] - arr[0]
            }
        }
        return largestIncrease;
    } 
}
