import java.util.*;
public class SumOfNumbers {
   public static void main(String [] args) {
      int count = 1, number, sum = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a natural number: ");
      number = input.nextInt();
      
      System.out.print("The first " + number + " natural numbers are:\n\t");
     
      while (count <= number) { 
            System.out.print(count + " " );
            sum += count;
            count++;
     }    
            System.out.print("\n The sum is " + sum + ".");
          
}}