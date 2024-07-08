import java.util.NoSuchElementException;

public class StringReverser {
   private MyStack<Character> stack;
   
   public StringReverser() {
      stack = new MyStack<>();
}

   public String reverseWord(String input) {
      char[] characters = input.toCharArray();
      
      for (char c : characters) {
         stack.push(c);
}
      StringBuilder reversedString = new StringBuilder();
      while(!stack.isEmpty()) {
         reversedString.append(stack.pop());
}
      return reversedString.toString();
}

   public static void main(String[] args) {
      StringReverser reverser = new StringReverser();
      
      String input = "Turtle";
      String reversed = reverser.reverseWord(input);
      
      System.out.println("Input: " + input);
      System.out.println("Reversed: " + reversed);
 }
}