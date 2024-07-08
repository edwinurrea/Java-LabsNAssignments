import java.util.*;
public class BadSubscriptCaught {
   public static void main(String[] args) {
      String[] names = {"Timmy", "John", "Frank", "Bob", "Mario",
                        "Peach", "Eve", "Rebecca", "Daisy", "Ellie"};
      Scanner input = new Scanner(System.in);
      
      try {
         System.out.print("Enter an integer between 0 and 9: ");
         int index = input.nextInt();
         System.out.println("The name at position " + index + " is " + names[index]);
}
      catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("Error: Index out of range. Please try again!");
  }
 }
}