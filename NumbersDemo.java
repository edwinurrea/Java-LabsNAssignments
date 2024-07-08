import javax.swing.*;
public class NumbersDemo {
   public static void main(String [] args) {
   int number;
   
   number = inputNumber();
   displayTwiceTheNumber(number);
   displayNumberPlusFive(number);
   displayNumberSquared(number);

}
   public static int inputNumber() {
      int number;
      String input;
      input = JOptionPane.showInputDialog(null, "Enter your number: ", "Numbers Demo", JOptionPane.QUESTION_MESSAGE);
      number = Integer.parseInt(input);
      return number;
}  
   
  public static void displayTwiceTheNumber(int number) {   
   int twice = number * 2;
   System.out.println(number + " doubled is " + twice + ".");
   
}
  public static void displayNumberPlusFive(int number) {   
   int plusfive = number + 5;
   System.out.println(number + " plus five is " + plusfive + ".");
}
  public static void displayNumberSquared(int number) {   
   int squared = number * number;
   System.out.println(number + " squared is " + squared + ".");  
   }
} 
   
   
   