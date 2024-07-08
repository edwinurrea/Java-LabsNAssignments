import java.util.*;
public class Payroll {
   public static void main(String [] args ) {
      double skill, hours, total;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter skill level (1,2,3): ");
         skill = input.nextDouble();
      System.out.print("Enter hours worked: ");
         hours = input.nextDouble();

         
      if (skill == 1) {
         skill = 17.00;
            if (hours > 40)
               skill = 1.5 * skill;
         total = skill * hours;
         System.out.print("Your net pay for Level 1 with " + hours + " hours is $" + total);   
}      
      else if (skill == 2) {
         skill = 20.00;
            if (hours > 40)
               skill = 1.5 * skill;
         total = skill * hours;
         System.out.print("Your net pay for Level 2 with " + hours + " hours is $" + total);    
}      
      else if (skill == 3) {
         skill = 22.00;
            if (hours > 40)
               skill = 1.5 * skill;
         total = skill * hours;
         System.out.print("Your net pay for Level 3 with " + hours + " hours is $" + total);
}      
      else
         System.out.print("Invalid Input! Please Select 1, 2, 3 And Try Again."); 

 }
}