
public class StringConcepts {

    public static void main(String[] args) {

        // 1. String literals and the String Pool
        String a = "Debanga";
        String b = "Debanga";

        System.out.println("----- STRING LITERALS -----");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a == b: " + (a == b));          // Because both references point to the same object, a == b returns true.
        System.out.println("a.equals(b): " + a.equals(b));


        // 2. String objects created using new
        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println("\n----- STRING OBJECTS -----");
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
        System.out.println("name1 == name2: " + (name1 == name2));
        System.out.println("name1.equals(name2): " + name1.equals(name2));


        // 3. Accessing characters using charAt()
        System.out.println("\n----- CHARACTER ACCESS -----");
        System.out.println("First character: " + name1.charAt(0));
        System.out.println("Last character: " + name1.charAt(name1.length() - 1));
        System.out.println("Length: " + name1.length());


        // 4. String immutability
        System.out.println("\n----- STRING IMMUTABILITY -----");
        String language = "Java";

        language.concat(" Programming");
        System.out.println("After concat without assignment: " + language);

        language = language.concat(" Programming");      // language = language.concat(" Programming"); Now language refers to "Java Programming".
        System.out.println("After concat with assignment: " + language);


        // 5. String Pool and intern()
        System.out.println("\n----- INTERNING -----");
        String name3 = new String("Debanga");
        String name4 = name3.intern();

        System.out.println("a == name3: " + (a == name3));
        System.out.println("a == name4: " + (a == name4));
    }
}
