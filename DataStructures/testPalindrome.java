// Name:       <Edwin Urrea>

// Class:      CS 3305/Section#W02

// Term:       Spring 2025

// Instructor: Umama Tasnim
// Assignment: 4
import java.util.*;

public class testPalindrome {
   //Main
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int option;
      
      //Menu
      do {
         System.out.println("\n-----MAIN MENU-----" +
                            "\n1. Test character-by-character palindrome" +
                            "\n2. Test word-by-word palindrome" +
                            "\n3. Exit Program");
         System.out.print("Enter option number: ");
         option = scanner.nextInt();
         scanner.nextLine();
         
         //Switch Case Uses Each Function and Only Stops If Case 3 Is Selected
         switch (option) {
            case 1: 
               checkCharPalindrome(scanner); //Character-by-Character Function
               break;
            case 2:
               checkWordPalindrome(scanner); //Word-by-Word Function
               break;
            case 3:
               System.out.println("Exiting program"); //Exit Case
            default:
               System.out.println("Invalid choice. Try again."); //Default/Error Catcher Case
         }
      }
      //Loop Switch Case Unless Case 3 is Selected
      while (option != 3);
   }
   
   //Character-by-Character Palindrome Check Function
   public static void checkCharPalindrome(Scanner scanner) {
      System.out.print("Enter a string: ");
      String input = scanner.nextLine();
      
      //Cleaning; Take Away Non Letters or Numbers and Convert to Lowercase 
      String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      String reversed = new StringBuilder(clean).reverse().toString(); //Reverse Clean String
      
      String result = "";
      
      //Check if CLean String Matches Reversed String
      if (clean.equals(reversed)) {
         result = "Palindrome";
      }
      else {
         result = "Not Palindrome";
      }
      
      System.out.println("\nYou selected: Option 1");
      System.out.println("You entered: " + input);
      System.out.println("Judgement: " + result);
   }
   
   //Word-by-Word Palindrome Check Function
   public static void checkWordPalindrome(Scanner scanner) {
      System.out.print("Enter a string: ");
      String input = scanner.nextLine();
      
      //Cleaning; Take Away Non Letters or Numbers (Except Spaces) and Convert to Lowercase 
      String clean = input.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
      
      //Split into Words using Spaces
      String[] words = clean.split("\\s+");
      
      Queue<String> queue = new LinkedList<>(Arrays.asList(words));
      Stack<String> stack = new Stack<>();
      
      //Reverse Order
      for (String word : words) {
         stack.push(word);
      }      
      
      //Check If Words Equal A Palindrome by Comparing First and Last Words
      boolean isPalindrome = true;
      while (!queue.isEmpty()) {
         if (!queue.poll().equals(stack.pop())) {
            isPalindrome = false;
            break;
         }
      }
      
      String result = "";
      
      //Produces String Result from isPalindrome, for Output
      if (isPalindrome == true) {
         result = "Palindrome";
      }
      else {
         result = "Not Palindrome";
      }
      
      System.out.println("\nYou selected: Option 2");
      System.out.println("You entered: " + input);
      System.out.println("Judgement: " + result);
   }
}