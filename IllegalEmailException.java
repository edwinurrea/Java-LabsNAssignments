import javax.swing.*;
class IllegalEmailException extends Exception {
   public IllegalEmailException(String msg) {
   super(msg);
 }
}

class IllegalEmailCheck {
   public static void main(String [] args) throws IllegalEmailException {
      String email, userName, host, msg;
      int index;
      
      email = JOptionPane.showInputDialog(null, "Enter your email address");
      msg = "Your email is: " + email + "\n";
      index = email.indexOf('@');
      
      try {
         if(index == -1)
            throw new IllegalEmailException("missing @ symbol");
         else if(index == 0)
            throw new IllegalEmailException("missing user name");
         else if(index == email.length() - 1)
            throw new IllegalEmailException("missing user doamin"); 
         
         userName = email.substring(0, index);
         host = email.substring(index + 1, email.length());
         msg += "   user name = " + userName + "\n  domain = " + host;
}

      catch(IllegalEmailException e) {
         msg += "    " + e.getMessage();
}
      catch(Exception e) {
         msg += "    Invalid email";
}
      finally {
         JOptionPane.showMessageDialog(null, msg);
  }
 }
}