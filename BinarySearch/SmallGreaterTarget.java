// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// Smallest character strictly greater than the target.
public class SmallGreaterTarget {
    public static void main(String[] args) {
        
        char[] ch = {'c','f','j', 'k'};      // Declaration for Character Array.
        char target = 'j';                   // For a specific character. Notice we dont use {} Curly Braces.

        char ans = findChar(ch,target);
        System.out.println("The smallest character in the array stricly Greater than " + target  + " is: " + ans);
    }
    
    static char findChar (char[] ch, char target){

        int start = 0;
        int end = ch.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target >= ch[mid]){             // Eliminate c and f cuz neighter can be the ans. We need a character strictly greater than 'f'.
                start = mid + 1;
            } else {
                end = mid - 1;                   // These lines are They're updating the search boundaries.
            }
        } 
        return ch [start % ch.length];          // return ch[2 % 4]; i.e  return ch[2] = 'j'
        
    }
}



/*
if (start == letters.length) {
    return letters[0];
}
return letters[start];



Formula	Calculation	Result
(start + end) / 2	
start + (end - start) / 2	
So why prefer the second formula?
Integer overflow.
Java's int has a maximum value of 2,147,483,647. If start + end exceeds that limit, the addition can overflow and produce an incorrect result.

*/