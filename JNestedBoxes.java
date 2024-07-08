import javax.swing.*;
import java.awt.*;

public class JNestedBoxes extends JPanel {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Boxes");
      frame.setSize(400, 400);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.add(new JNestedBoxes());
}

   public void paint(Graphics g) {
      super.paint(g);
      int NUM_BOXES = 8;
      int INC = 20;
      int x = 40, y = 40;
      int w = 300, h = 300;
      
      for(int i = 0; i < NUM_BOXES; i++) {
         g.drawRect(x, y, w, h);
         x += INC;
         y += INC;
         w -= 2 * INC;
         h -= 2 * INC;
  }
 }
}