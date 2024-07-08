import javax.swing.*;
import java.awt.*;
public class JScrollDemo extends JFrame {
   Container con = getContentPane();
   JPanel panel = new JPanel();
   JScrollPane scroll = new JScrollPane(panel,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
   JLabel label = new JLabel("Four score and seven years ago");
   Font font = new Font("Arial", Font.PLAIN, 20);
   
   public static void main(String [] args) {
      JScrollDemo frame = new JScrollDemo();
      frame.setSize(200,100);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
   public JScrollDemo() {
      label.setFont(font);
     // con.add(panel);
      con.add(scroll);
      panel.add(label);
 }
}