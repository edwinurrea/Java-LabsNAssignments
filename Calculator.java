import javax.swing.*;
public class Calculator {
   public static void main(String[] args) {
      int num1, num2, operation;
      
      num1 = inputNumber("Enter first number");
      num2 = inputNumber("Enter second number");
      operation = inputOperation();
      display(num1, num2, operation);
 }

   public static int inputNumber(String msg) {
      int number = 0;
      String input, errorMsg = "";
      boolean goodNumber = false;
      
      while(!goodNumber) {
         try {
            input = JOptionPane.showInputDialog(null, errorMsg + msg);
            number = Integer.parseInt(input);
            goodNumber = true;
}
         catch(NumberFormatException e) {
            errorMsg = "Invalid number, must be an integer. \nTry again! \n";
}         
         catch(Exception e) {
            errorMsg = "Something went wrong. \nTry again! \n";
 }
}
      return number;
}
   public static int inputOperation() {
      int number = 1;
      String input, errorMsg = "";
      String msg = "Enter your operation: \n" +
                   "1)  Add \n" +
                   "2)  Subtract \n" +
                   "3)  Multiply \n" +
                   "4)  Divide\n\n";
  
   boolean goodNumber = false;
   
         while(!goodNumber) {
         try {
            input = JOptionPane.showInputDialog(null, errorMsg + msg);
            number = Integer.parseInt(input);
            if(number < 1 || number > 4)
               throw new IllegalArgumentException();
            goodNumber = true;
}
         catch(NumberFormatException e) {
            errorMsg = "Invalid number, must be an integer (1 - 4). \nTry again! \n";
}         

         catch(IllegalArgumentException e) {
            errorMsg = "Not a valid choice, must be between 1 and 4. \nTry again! \n";
}         
         catch(Exception e) {
            errorMsg = "Something went wrong. \nTry again! \n";
 }
}
      return number;
}
   
   public static void display(int n1, int n2, int choice) {
      String msg = "";
      try {
         switch (choice) {
            case 1: msg = n1 + " + " + n2 + " = " + (n1+n2); break;
            case 2: msg = n1 + " - " + n2 + " = " + (n1-n2); break;
            case 3: msg = n1 + " * " + n2 + " = " + (n1*n2); break;
            case 4: if(n2 == 0)
                       throw new ArithmeticException();
                    else msg = n1 + " / " + n2 + " = " + (1.0*n1/n2); break;
      
 }      
}
      catch(ArithmeticException e) {
         msg = n1 + " / " + n2 + "\nCannot Divide by Zero";
}
      JOptionPane.showMessageDialog(null, msg);
 }
}