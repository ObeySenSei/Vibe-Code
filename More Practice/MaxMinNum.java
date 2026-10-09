import java.util.Scanner;

public class MaxMinNum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println("Maximum = " + Max(num1, num2, num3));
        System.out.println("Minimum = " + Min(num1, num2, num3));
    }
    static int Max ( int a, int b ,int c ){

        int max = a;
        if ( b > max ){
            max = b;
        }
        if ( c > max){
            max = c;
        }
        return max;
    }
    static int Min ( int a,int b , int c){

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min ){
            min = c;
        }
        return min;
    }
}