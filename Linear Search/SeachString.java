import java.util.Arrays;

public class SeachString {
    public static void main(String[] args) {
        
        String name = "Debanga";
        char target = 'b';

        boolean isPresent = checkPresence (name,target);
        if (isPresent){
            System.out.println("Character is Present.");
        } else {
            System.out.println("Character is not Present.");
        }
    }
    static boolean checkPresence (String name, char target ){

        if (name.length() == 0){
            return false;
        }
        for (int i=0; i<name.length(); i++){
            if (name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
/*
for (char ch : name.chatAt(i)){
    if (ch == target){
    return true;
    }
}
    return false;

*/
