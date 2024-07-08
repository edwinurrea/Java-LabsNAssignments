import java.io.*;
public class LetterCounter {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try{
         System.out.print("Enter the name of the file: ");
         String fileName = br.readLine();
         System.out.print("Enter the character to count: ");
         char c = (char) br.read();
         
         FileInputStream fis = new FileInputStream(fileName);
         int count = 0;
         int value;
         
         while((value = fis.read()) != -1) {
            if((char) value == c) {
               count++;
 }
}
   System.out.println("The character " + c + " appears " + count + 
                      " times in the files " + fileName + ".");
}
   catch(FileNotFoundException e) {
      System.out.println("File not found.");
}
   catch(IOException e) {
      System.out.println("Input/output error.");
  }
 }
}