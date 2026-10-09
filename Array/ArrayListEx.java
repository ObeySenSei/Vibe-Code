import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        
        ArrayList <Integer> list =  new ArrayList<> (10);             // An ArrayList that stores Integer values "ArrayList<Integer>""
        
        list.add(101);
        list.add(546);
        list.add(235);
        list.add(675);
        list.add(987);
    
        System.out.println(list);

        System.out.println(list.contains(1111)) ;               // To check if a value is present
                
        list.set (0, 1);                           // To change a particular value
        System.out.println(list);                   
                      
        list.remove (2);                                   // To remove a particular value
        System.out.println(list);
    }
}


 /*
 An ArrayList is basically a resizable list.    You can add or remove elements.

Why Integer instead of int ?
int is a primitive data type.
Integer is the wrapper class for int.

int       → Integer
double    → Double
char      → Character
boolean   → Boolean

You don't need a loop to print all the 5 items. They can all be printed all at once in a single line using "system.out.println(list)";

 */