import java.util.*;
public class CaesarCipher {
   public static void main(String [] args) {
   int shift;
   char ch;
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a message: ");
   String msg = input.nextLine();
   String codedMsg = "";
   msg = msg.toLowerCase();
   
   System.out.print("Enter your shift: ");
   shift = input.nextInt();
   
   for(int i = 0; i < msg.length(); i++) {
      ch = msg.charAt(i);
      if(Character.isLetter(ch))
         if(shift > 0) 
            if(ch + shift > 'z')
               codedMsg += (char)(ch + shift - 26);
            else
               codedMsg += (char)(ch + shift);
         else
            if(ch + shift < 'a')
               codedMsg += (char)(ch + shift + 26);
            else
               codedMsg += (char)(ch + shift);
         else
            codedMsg += ch;
}

   
   System.out.println("msg:    " + msg);
   System.out.println("cipher: " + codedMsg);

 }
}