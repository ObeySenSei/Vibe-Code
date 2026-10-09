/*Write a program that will ask the user to enter his/her marks (out of 100).  Define a method that will display grades according to the marks entered as below
Marks        Grade 
91-100         A+ 
81-90          A
71-80          B 
61-70          C 
51-60          D
41-50          E
<=40          Fail 
*/

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
    convertMarks();

}
    static void convertMarks (){    

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = in.nextInt();

        String grade;                                    // marks <= 80 as "all grades up to 80" → B, C, D, E, Fail.

        if (marks <= 40) {                               //   But 'else if' Check this only if the previous condition was false
            grade = "Fail";
        } 
        else if (marks <= 50) {
            grade = "D";
        } 
        else if (marks <= 60) {
            grade = "C";
        } 
        else if (marks <= 70) {
            grade = "B";
        } 
        else if (marks <= 80) {
            grade = "B";
        } 
        else if (marks <= 90) {
            grade = "A";
        } 
        else if (marks <= 100) {
            grade = "A+";
        } 
        else {
            grade = "Invalid marks";
        }

        System.out.println(marks + " in Grade format is: " + grade);
    }
}
// Since the exercise says "Define a method that will display grades", you actually don't need the method to return anything. So void is more appropriate.
