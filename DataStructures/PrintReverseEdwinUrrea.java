// Name: <Edwin Urrea>

// Class: CS 3305/Section#W02

// Term: Spring 2025

// Instructor: Umama Tasnim
import java.util.Scanner;
public class PrintReverseEdwinUrrea {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String choice = "Y";
      
      while (!choice.equals("N")) {
         System.out.print("Entered string: ");
         String input = scanner.nextLine();
         
         System.out.print("Reversed string: ");
         printCharsReverse(input);
         System.out.println();
      
         System.out.print("Try again (Y/N): ");
         choice = scanner.nextLine().toUpperCase();
      }
   }
   
   public static void printCharsReverse(String str) {
      if (str.length() == 0) {
         return;
      }
      System.out.print(str.charAt(str.length() - 1));
      printCharsReverse(str.substring(0, str.length() - 1));
   }
}