import javax.swing.*;
import java.awt.*;

public class JDiagonalLines extends JFrame {
   public static void main(String[] args) {
      JDiagonalLines frame = new JDiagonalLines();
      frame.setSize(300, 300);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
}
    public void paint(Graphics g) {
      super.paint(g);
      int x = 50;
      int y = 50;
      int w = 200;
      int h = 200;
      
      g.drawRect(x, y, w, h);
      for (int i = 0; i < w; i += 10) {
         g.drawLine(x + i, y, x, y + i);
         g.drawLine(x + w, y + i, x + i, y + h);
  }
 }
}