public class Performance {
    public static void main(String[] args) {

        // 1. String - Immutable
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println("String: " + series);

        // 2. StringBuilder - Mutable
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println("StringBuilder: " + builder);
    }
}
/*

The key difference: String vs. StringBuilder

String — Immutable
Each concatenation creates a new string value rather than modifying the existing String object.
"" → "a" → "ab" → "abc"


StringBuilder — Mutable
The same builder object can be modified by appending characters.
"" → "a" → "ab" → "abc"


Why does this matter for performance?
- String: Repeated concatenation inside a loop can create many temporary objects and copy characters repeatedly.
- StringBuilder: append() generally avoids creating a new string for every character, making repeated construction more efficient.
One important detail: StringBuilder is not modifying a String; it is a separate, mutable object.
Remember: Use String for ordinary text. Use StringBuilder when you repeatedly build or modify text, especially inside loops.
 */
