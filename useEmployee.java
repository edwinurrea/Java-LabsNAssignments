import java.util.*;
public class useEmployee {
   public static void main(String [] args ) {
      String name;
      double wage, hours;
      Scanner s = new Scanner(System.in);
      Employee ans = new Employee();
      System.out.println("Enter Employee name: "); 
      name = s.next();
      wage = inputMethod("Enter hourly wage: ");
      hours = inputMethod("Enter hours worked: ");
      
      ans.setN(name);
      ans.setWG(wage);
      ans.setHR(hours);
      
      ans.display();
}
      public static double inputMethod(String msg) {
      double coefficient;
      Scanner input = new Scanner(System.in);
      System.out.print(msg);
      coefficient = input.nextDouble();
      return coefficient;
 }
}