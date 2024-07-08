import javax.swing.*;
import java.awt.*;

public class JHistoricalFacts extends JFrame {
   JLabel title = new JLabel("Historical Facts");
   JLabel personal = new JLabel("Enter your own fact here:");
   JTextField textInput = new JTextField(15);
   
   JLabel fact1 = new JLabel("For respect of their pharaohs and queens, the Egyptians made pyramids to use as their tombs."); 
   JLabel fact2 = new JLabel("On December 17, 1903, the Wright Brothers created the first ever successful plane.");   
   JLabel fact3 = new JLabel("The largest ship in the world, made in 1912, was The Titanic.");   
   JLabel fact4 = new JLabel("The Great Wall of China is the longest wall in the world, at 13,000 miles.");   
   JLabel fact5 = new JLabel("On June 29th, 2007, the first ever iPhone was released.");
   
   JTextField textField = new JTextField(15);
   
   Font monospaceFont = new Font("Monospaced", Font.PLAIN, 9);
   Font sansSerifFont = new Font("SansSerif", Font.BOLD, 10);
   Font serifFont = new Font("Serif", Font.PLAIN, 11);
   Font arialFont = new Font("Arial", Font.BOLD, 12);
   Font dialogFont = new Font("Dialog", Font.PLAIN, 16);   
   
   public static void main(String args[]) {
      JHistoricalFacts frame = new JHistoricalFacts();
      frame.setSize(550, 200);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

   public JHistoricalFacts() {
      super("Historical Facts");
      setLayout(new FlowLayout());
      title.setFont(arialFont);
      title.setForeground(new Color(100, 0, 100));
      
      fact1.setFont(monospaceFont);
      fact2.setFont(sansSerifFont);
      fact3.setFont(serifFont);
      fact4.setFont(arialFont);
      fact5.setFont(dialogFont);
      
      textField.setToolTipText("Enter your own fact here:");
      
      add(title);
      
      add(fact1);
      add(fact2);      
      add(fact3);      
      add(fact4);
      add(fact5);
      
      add(personal);
      add(textField);
 }
}