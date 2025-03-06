import java.util.Scanner;

public class TestBill {
   public static void main(String[] args) {
      Bill bill1 = new Bill(998, "Hazel", 20.0);
      Bill bill2 = new Bill("Bob");
      
      System.out.println(bill1);
      System.out.println(bill2);
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a double value for tax: ");
      double percentage = scan.nextDouble();
      
      bill1.calculateTax(percentage);
      bill2.calculateTax(percentage);
      
      System.out.println("\nTax for Bill 1: " + bill1.calculateTax(percentage));
      System.out.println("Tax for Bill 2: " + bill2.calculateTax(percentage));
   }
}