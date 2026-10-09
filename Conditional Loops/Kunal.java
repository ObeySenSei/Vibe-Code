// Kunal is allowed to go out with his friends only on the even days of a given month. 
// Write a program to count the number of days he can go out in the month of August.

public class Kunal {
    public static void main(String[] args) {

        int count = 0;

        for (int day = 1; day <= 31; day++) {
            if (day % 2 == 0) {
                count++;
            }
        }
        System.out.println("Kunal can go out for " + count + " days.");
    }
}