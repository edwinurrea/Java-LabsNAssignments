import java.util.*;
public class EvenOdd {
   public static void main (String [] args ) {
      int number;
      Scanner input = new Scanner(System.in);
      
      System.out.println("This program determines if a number is even or odd.");
      System.out.println("Enter your number: ");
      number = input.nextInt();
      
      if(number < 0)
         System.out.println(number + " is a negative number." +  
                           "\nThe number must be a positive." +
                           "\nPlease try again with a positive.");
      else if(number % 2 == .0)
         System.out.println(number + " is an even number.");
         else
            System.out.println(number + " is an odd number.");
       }
}