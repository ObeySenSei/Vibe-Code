public class CountNum {
    public static void main(String[] args) {

       
         int num = 12377;
         int count = 0;

         while (num > 0){
            int remainder = num % 10;
            if (remainder == 7){
                count++;
            }
            num = num / 10;
         }

         System.out.println(count);

         /*
          * num % 10 → gets the last digit of the number.
          *
          * If the last digit is 7, count is increased by 1.
          *
          * num / 10 → removes the last digit.
          *
          * This repeats until there are no digits left.
          *
          * Example:
          *
          * 12377
          * 1237  → last digit 7 → count = 1
          * 123   → last digit 7 → count = 2
          * 12    → last digit 2
          * 1     → last digit 1
          * 0     → loop stops
          *
          * Therefore, the number 12377 contains 2 sevens.
          */
    } 
    
}