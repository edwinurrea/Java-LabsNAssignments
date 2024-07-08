import javax.swing.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class CheckPassword {
   public static void main(String [] args) throws IOException {
      Path file = Paths.get("passwordlist.txt");
      InputStream input = null;
      OutputStream output = null;
      String userId, password, line;
      String [] array = new String[2];
      boolean userFound = false; 
      boolean goodPassword = false;
      
      userId = JOptionPane.showInputDialog(null, "Enter user ID:");
      password = JOptionPane.showInputDialog(null, "Enter password:");
      
   try {
      input = Files.newInputStream(file);
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      line = reader.readLine();
      while(line != null) {
         array = line.split(",");
         if(userId.equals(array[0])) {
            userFound = true;
            if(password.equals(array[1]))
               goodPassword = true;
            break;
}
         line = reader.readLine();
}
      reader.close();
}
   catch(IOException e) {
      System.out.println("IO Message: " + e);
}
   catch(Exception e) {
      System.out.println("Exception Message: " + e);
}
   if(!userFound) {
      int result = JOptionPane.showConfirmDialog(null, "Are you a new customer?");
      if(result == JOptionPane.YES_OPTION) {
         output = Files.newOutputStream(file, APPEND);
         output = new BufferedOutputStream(output);
         line = "\n" + userId + "," + password;
         byte [] data = line.getBytes();
         output.write(data);
         
         output.close();
}
   else
      JOptionPane.showMessageDialog(null, "Thanks for dropping by.");
}
   else if(!goodPassword)
      JOptionPane.showMessageDialog(null, "Invalid password for " + userId + ".");
   else
      JOptionPane.showMessageDialog(null, "Welcome \n Time to place your order!");
 }
}