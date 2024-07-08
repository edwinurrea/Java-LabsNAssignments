import java.nio.file.*;
import java.io.*;
public class ValidateAccountNumbers {
   public static void main(String[] args) throws IOException {
      Path file = Paths.get("AcctNumbers.txt");
      String acct;
      int acctNum, lastDigit, digit, sum;
      
      try {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         acct = reader.readLine();
         
         while(acct != null) {
            acctNum = Integer.parseInt(acct);
            
            lastDigit = acctNum % 10;
            acctNum = acctNum / 10;
            sum = 0;
         for(int i = 0; i < acct.length()-1; i++) {
            digit = acctNum % 10;
            sum += digit;
}
         sum = sum % 10;
         if(sum == lastDigit)
            System.out.println(acct + " is valid");
         else
            System.out.println(acct + " is invalid");
            acct = reader.readLine();
}
      reader.close();
}
   catch(NumberFormatException e) {
      System.out.println( "Not a valid number");
}
   catch(IOException e) {
      System.out.println("File not found");
}
   catch(Exception e) {
      System.out.println("Something went wrong");
  }
 }
}