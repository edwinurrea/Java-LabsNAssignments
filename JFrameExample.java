import javax.swing.*;
import java.awt.*;

public class JFrameExample extends JFrame {
   JLabel title = new JLabel("Frame with multiple components");
   JLabel name = new JLabel("Enter your name");
   JTextField textInput = new JTextField(15);
   
   JLabel color = new JLabel("Choose a color");
   JRadioButton radio1 = new JRadioButton("red", true);
   JRadioButton radio2 = new JRadioButton("green");
   JRadioButton radio3 = new JRadioButton("blue");

   JLabel font = new JLabel("Choose a font");
   JCheckBox check1 = new JCheckBox("Arial");
   JCheckBox check2 = new JCheckBox("Calibri");   
   JCheckBox check3 = new JCheckBox("Rockwell");   
   
   JButton button = new JButton("Exit");
   
   Font comicFont = new Font("Comic Sans MS", Font.BOLD + Font.ITALIC, 15);
   Font lucidaFont = new Font("Lucida Calligraphy", Font.PLAIN, 15);
   
   public static void main( String args[] ) {
      JFrameExample frame = new JFrameExample();
      frame.setSize(375,200);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
   public JFrameExample() {
      super("Component Example");
      setLayout(new FlowLayout());
      title.setFont(lucidaFont);
      color.setFont(comicFont);
      font.setFont(comicFont);
      title.setForeground(new Color(100, 0, 100));
      color.setForeground(Color.MAGENTA);
      font.setForeground(Color.CYAN);
      button.setBackground(Color.BLACK);
      button.setForeground(Color.WHITE);
      textInput.setToolTipText("Enter your name");
      
      add(title);
      
      add(name);
      add(textInput);
      
      add(color);
      add(radio1);
      add(radio2);
      add(radio3);
      
      add(font);
      add(check1);
      add(check2);
      add(check3);
      
      add(button);
 }
}