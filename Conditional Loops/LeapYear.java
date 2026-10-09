import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
         System.out.println("Enter start year : ");
         int start = in.nextInt();

         System.out.println("Enter end year : ");
         int end = in.nextInt();

         int leapyear;

        System.out.println("The leap years between " + start + "and " + end + "are: ");
         for (int i=start; i<=end; i++){
            if ( i%400 == 0 || ( i%4 == 0 && i%100 != 0 )){
                System.out.println(i);
            }
         }
    }
}

/* 

That's why the rule has two cases:
Divisible by 400 → Leap year → 2000 ✅
Divisible by 4 but NOT by 100 → Leap year → 2024 ✅

*/
