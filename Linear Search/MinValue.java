public record MinValue() {
    public static void main(String[] args) {
        
        int[] arr = {70, 40, 50, -10, 20, 60, 30, 80};

        int minValue = checkMin (arr);
        System.out.println(minValue);

    }
    static int checkMin (int[] arr){

        int minNum = arr[0];

        for (int i=1; i<arr.length; i++){

            if (arr[i] < minNum){
                minNum = arr[i];
            }
        }
        return minNum;
    }
}
