import javax.swing.*;
public class Eggs {
   public static void main(String [] args)   {
      int amount, dozen, loose;
      double total;
      
   String input;
   input = JOptionPane.showInputDialog(null, "How many eggs would you like to order?", 
   "Welcome to Meadowdale Dairy Farm", JOptionPane.QUESTION_MESSAGE);
   amount = Integer.parseInt(input);
   
   dozen = amount / 12;
   loose = amount % 12;
   total = (dozen * 3.25) + (loose * 0.45);
   
   JOptionPane.showMessageDialog(null,
               " You ordered " + amount + " eggs." +
               "\n Thats's " + dozen + " dozen at $3.25 per dozen and " + loose + " loose eggs at 45 cents each." +
               "\n  Your total is $" + total);
   }
}   

