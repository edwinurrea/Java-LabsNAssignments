import javax.swing.*;
public class Add extends Arithmetic {
   private double result;
   
   public Add() { 
   public Add(num1, num2);
   }
   public double performOperation() {
      result = getNum1() + getNum2();
      return result;
   }
   
   public void display() {
      JOptionPane.showMessageDialog(null,
         getNum1() + " + " + getNum2() + " = " + performOperation());   
   }
}
