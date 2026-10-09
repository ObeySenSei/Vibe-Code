public class isRotation {
    public static void main(String[] args) {

        String s1 = "abcd";
        String s2= "cdab";

        boolean isRotation = check(s1,s2);
        if (isRotation){
            System.out.println("One string can be obtained by rotating another");
        } else {
            System.out.println("One string cannot be obtained by rotating another");
        }
    }
    
    static boolean check (String s1,String s2){

        if(s1.length() != s2.length()){
            return false;
        }

    String doubled = s1 + s1;

    return doubled.contains(s2);     // in short what does .contains() checks whether a string contains a specific sequence of characters
    } 
}
