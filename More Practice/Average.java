import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int n = in.nextInt();
        int sum = 0;

      
      for (int i=1;i<=n;i++){

         System.out.println("Enter number " + i + ":");
         int num = in.nextInt();
         
         sum = sum + num;
      }

      double average = (double) sum / n;
      System.out.println("The average of all the numbers is: "+ average);
      
      in.close();

      }
}
