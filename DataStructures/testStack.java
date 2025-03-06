// Name:       <Edwin Urrea>

// Class:      CS 3305/Section#W02

// Term:       Spring 2025

// Instructor: Umama Tasnim
// Assignment: 3
import java.util.*;

public class testStack {
   
   //Displays The Stack of Integers From Top To Bottom
   public static void topToBottom(Stack<Integer> stack) {
      Stack<Integer> tempStack = new Stack<>();
      
      while (!stack.isEmpty()) {
         int value = stack.pop();
         System.out.print(value + " ");
         tempStack.push(value);
      }
      System.out.println(); //New Line
      
      //Push Back Into Stack
      while (!tempStack.isEmpty()) {
         stack.push(tempStack.pop());
      }
   }
   
   //Displays The Stack of Doubles From Bottom To Top
   public static void bottomToTop(Stack<Double> stack) {
      Stack<Double> tempStack = new Stack<>();
      
      for (Double num : stack) {
         tempStack.push(num);
      }
      
      //Print Reversed/Bottom To Top 
      while (!tempStack.isEmpty()) {
         System.out.print(tempStack.pop() + " ");
      }
      System.out.println(); //New Line
   }
   
   //Returns Stack of Strings Given, But Reversed
   public static Stack<String> flipStack(Stack<String> stack) {
      Stack<String> tempStack = new Stack<>();
      
      while (!stack.isEmpty()) {
         tempStack.push(stack.pop());
      }
      
      return tempStack;
   }
   
   //Returns True If Target Exists, Otherwise Returns False
   public static boolean searchStack(Stack<Integer> stack, int target) {
      Stack<Integer> tempStack = new Stack<>();
      boolean found = false;
      
      //Search for Target
      while (!stack.isEmpty()) {
         int value = stack.pop();
         if (value == target) {
            found = true;
         }
         tempStack.push(value);
      }
      
      //Fix The Stack
      while (!tempStack.isEmpty()) {
         stack.push(tempStack.pop());
      }
      
      return found;
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean running = true;
      
      while(running) {
         System.out.println("\n-----MAIN MENU-----" +
                            "\n1. Test function topToBottom with integer stack" +
                            "\n2. Test function bottomToTop with double stack" +
                            "\n3. Test function flipStack with string stack" +
                            "\n4. Test function searchStack with integer stack" +
                            "\n5. Exit Program");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
           
         switch (choice) {
            //Testing topToBottom
            case 1:
               System.out.println("\nTesting function topToBottom:");
               System.out.print("Enter integers to push onto the stack (space-separated): ");
               scanner.nextLine();
               String integerInput = scanner.nextLine();
               String[] integerValues = integerInput.split(" ");
               Stack<Integer> integerStack = new Stack<>();
               
               for (String value : integerValues) {
                  integerStack.push(Integer.parseInt(value));
               }
               
               System.out.print("Stack content: ");
               System.out.println(integerStack);
               System.out.print("Function output: ");
               topToBottom(integerStack);               
               break;
            //Testing bottomToTop
            case 2:
               System.out.println("\nTesting function bottomToTop:");
               System.out.print("Enter doubles to push onto the stack (space-separated): ");
               scanner.nextLine();
               String doubleInput = scanner.nextLine();
               String[] doubleValues = doubleInput.split(" ");
               Stack<Double> doubleStack = new Stack<>();
               
               for (String value : doubleValues) {
                  doubleStack.push(Double.parseDouble(value));
               }
               
               System.out.print("Stack content: ");
               System.out.println(doubleStack);
               System.out.print("Function output: ");
               bottomToTop(doubleStack);
               break;
            //Testing flipStack
            case 3:
               System.out.println("\nTesting function flipStack:");
               System.out.print("Enter strings to push onto the stack (space-separated): ");
               scanner.nextLine();
               String stringInput = scanner.nextLine();
               String[] stringValues = stringInput.split(" ");
               Stack<String> stringStack = new Stack<>();
               
               for (String value : stringValues) {
                  stringStack.push(value);
               }
               
               System.out.print("Stack content before calling flipStack: ");
               System.out.println(stringStack);
               stringStack = flipStack(stringStack);
               System.out.print("Stack content after calling flipStack: ");
               System.out.println(stringStack);
               break;
            //Testing searchStack
            case 4:
               System.out.println("\nTesting function searchStack:");
               System.out.print("Enter integers to push onto the stack (space-separated): ");
               scanner.nextLine();
               String searchInput = scanner.nextLine();
               String[] searchValues = searchInput.split(" ");
               Stack<Integer> searchIntStack = new Stack<>();
               
               for (String value : searchValues) {
                  searchIntStack.push(Integer.parseInt(value));
               }
               
               System.out.println("Stack content: " + searchIntStack);
               System.out.print("Enter target value to search for: ");
               int target = scanner.nextInt();
               System.out.println("Function output: " + searchStack(searchIntStack, target));
               break;
            //Exit
            case 5:
               running = false;
               break;
            default:
               System.out.println("Invalid choice. Try again.");
         }
      }
   }
}