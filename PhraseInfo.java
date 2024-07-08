import java.util.*;
public class PhraseInfo {
   public static void main(String [] args) {
   String phrase, newStr = "";
   int index, countVowels = 0, countWords = 1;
   char ch;
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter a phrase: ");
   phrase = input.nextLine();

   for(index = 0; index < phrase.length()-1; index++) {
      if(phrase.charAt(index) == ' ' && phrase.charAt(index+1) != ' ')
         countWords++;
   }   

   for(index = 0; index < phrase.length(); index++) {
      ch = phrase.charAt(index);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
         ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
         ch == 'O' || ch == 'U')
         countVowels++;
   }

   for(index = 0; index < phrase.length(); index++) {
      ch = phrase.charAt(index);
      if(Character.isLetterOrDigit(ch))
         newStr += ch;
         newStr = newStr.replace("a",""); newStr = newStr.replace("e",""); newStr = newStr.replace("i",""); 
         newStr = newStr.replace("o",""); newStr = newStr.replace("u",""); 
         newStr = newStr.replace("A",""); newStr = newStr.replace("E",""); newStr = newStr.replace("I",""); 
         newStr = newStr.replace("O",""); newStr = newStr.replace("U","");
   }



   System.out.println("Your phrase: " + phrase + 
                      "\n\thas " + countWords++ + " words and " + countVowels++ + " vowels\n" +
                      "coded: " + newStr);
   
 }
}