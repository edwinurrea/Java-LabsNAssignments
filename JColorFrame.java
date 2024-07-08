import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JColorFrame extends JFrame implements ActionListener {
   JPanel center = new JPanel();
   JPanel north = new JPanel();
   JPanel south = new JPanel();
   JPanel east = new JPanel();
   JPanel west = new JPanel();
   JButton button = new JButton("Click To Change A Color!"); 
     
   public static void main(String [] args) {
      JColorFrame frame = new JColorFrame();
      frame.setSize(250, 250);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
   public JColorFrame() {
      setLayout(new BorderLayout());
      add(center, BorderLayout.CENTER);
      add(north, BorderLayout.NORTH);
      add(south, BorderLayout.SOUTH);
      add(east, BorderLayout.EAST);
      add(west, BorderLayout.WEST);
      
      add(button, BorderLayout.CENTER);
      button.addActionListener(this);
}
   
   public void actionPerformed(ActionEvent e) {
      int r = (int)(Math.random()*256);
      int g = (int)(Math.random()*256);
      int b = (int)(Math.random()*256);
      Color random = new Color(r, g, b);
      int region = (int)(Math.random()*4)+1;
      
      switch(region) {
         case 1:
            north.setBackground(new Color(r,g,b));
            break;
         case 2:
            south.setBackground(new Color(r,g,b));
            break;
         case 3:
            east.setBackground(new Color(r,g,b));
            break;
         case 4:
            west.setBackground(new Color(r,g,b));
            break;
  }
 }
}