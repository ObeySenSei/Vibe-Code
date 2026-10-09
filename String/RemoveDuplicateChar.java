public class RemoveDuplicateChar {
    public static void main(String[] args) {
        
        String str = "programming";
        String newString = removeDuplicates (str);
        System.out.println("The new string with no duplicates: " + newString);

    }
    static String removeDuplicates(String str){

        String noDuplicates = " ";              // We will recrete the new string with no duplicate characters

        for (int i=0; i<str.length(); i++){        // String noDuplicates is at "prog____"
            char ch = str.charAt(i);               // lets say char ch = r

            if (!noDuplicates.contains(String.valueOf(ch))){      // This returns true if result already contains that character.
                noDuplicates = noDuplicates + ch;
            }   
        }
        return noDuplicates;
    }
}

/*   
Keep a character only if it hasn't already been added. That preserves the order of first appearances.

Character already exists? Skip it.
Character doesn't exist? Add it.

*/
