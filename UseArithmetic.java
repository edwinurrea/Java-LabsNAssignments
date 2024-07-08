import javax.swing.*;
public class UseArithmetic {
   public static void main (String [] args) {
      double num1, num2;
      String input;
      char operation;
      
      input = JOptionPane.showInputDialog(null, "Enter first number");
      num1 = Double.parseDouble(input);
      input = JOptionPane.showInputDialog(null, "Enter second number");
      num2 = Double.parseDouble(input);
      input = JOptionPane.showInputDialog(null, "Enter the operation (Add, Subtract, Multiply, Divide)");
      
      input = input.toLowerCase();
      operation = input.charAt(0);
      
      switch (operation) {
         case 'a': Add add = new Add(num1, num2); add.display(); break;
         case 's': Subtract sub = new Subtract(num1, num2); sub.display(); break;
//       case 'm': Mulitply multi = new Multiply(num1, num2); mult.display(); break;
//       case 'd': Divide div = new Divide(num1, num2); div.display(); break;
         default: JOptionPane.showMessageDialog(null, "Invalid Operation");
      }
   }
}