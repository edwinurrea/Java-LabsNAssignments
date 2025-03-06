// Name: <Edwin Urrea>

// Class: CS 3305/Section#W02

// Term: Spring 2025

// Instructor: Umama Tasnim
import java.util.Scanner;
public class AverageGradeEdwinUrrea {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String choice = "Y";
      
      while (!choice.equals("N")) {
         System.out.print("Class size: ");
         int classSize = scanner.nextInt();
         int[] grades = new int[classSize];
         
         System.out.print("Entered grades: ");
         for (int i = 0; i < classSize; i++) {
            grades[i] = scanner.nextInt();
         }
         
         double average = computerAverage(grades, classSize);
         System.out.printf("Class average: %.2f\n", average);
      
         System.out.print("Try again(Y/N): ");
         scanner.nextLine();
         choice = scanner.nextLine().toUpperCase();
      }
   }
 
   public static double computerAverage(int[] grades, int size) {
      if (size == 1) {
         return grades[0];
      }
      return (grades[size - 1] + (size - 1) * computerAverage(grades, size - 1)) / size;
   }
 }