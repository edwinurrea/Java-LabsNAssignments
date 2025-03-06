// Name:       <Edwin Urrea>

// Class:      CS 3305/Section#W02

// Term:       Spring 2025

// Instructor: Umama Tasnim
// Assignment: 3
import java.util.*;

public class isBalanced {

   //Stack Class
   static class Stack {
      private ArrayList<Character> stack;
      
      //Constructor
      public Stack() {
         stack = new ArrayList<>();
      }
      
      //Push onto Stack
      public void push(char c) {
         stack.add(c);
      }
      
      //Pop Stack
      public char pop() {
         if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
         }
         else {
            throw new IllegalStateException("Error! Stack is empty.");
         }
      }
      
      //Peek at Stack
      public char peek() {
         if (!isEmpty()) {
            return stack.get(stack.size() - 1);
         }
         else {
            throw new IllegalStateException("Error! Stack is empty.");
         }
      }
      
      //Check if Stack is Empty
      public boolean isEmpty() {
         return stack.isEmpty();
      }
   } 
   
   //IsBalanced Function To Check Parenthesis
   public static boolean isBalanced(String expression) {
      Stack stack = new Stack();
      
      for (int i = 0; i < expression.length(); i++) {
         char currentChar = expression.charAt(i);
         
         //Push onto Stack if Opening/Left Bracket
         if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
            stack.push(currentChar);
         }
         
         //Balance Logic for Closing/Right Bracket
         else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
            if (stack.isEmpty()) {
               return false;
            }
            char top = stack.pop();
            
            //Checks if Top of Stack (Left Bracket) Matches Closing Bracket
            if ((currentChar == ')' && top != '(') ||
               (currentChar == '}' && top != '{') ||
               (currentChar == ']' && top != '[')) {
               return false;
            }
         }
      }
      return stack.isEmpty(); //Technically Balanced If Empty
   }
   
   //Test Cases
   public static void main(String[] args) {
      System.out.println(isBalanced("(())")); //True
      System.out.println(isBalanced("{{[]}}")); //True
      System.out.println(isBalanced("()[]{}")); //True
      System.out.println(isBalanced("({[})")); //False
      System.out.println(isBalanced(")(")); //False
      System.out.println(isBalanced("{[}")); //False
      System.out.println(isBalanced("")); //True
   }
}