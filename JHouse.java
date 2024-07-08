import javax.swing.*;
import java.awt.*;

public class JHouse extends JFrame {
   Container con = getContentPane();
   HouseCanvas canvas;

   public static void main(String[] args) {
      JHouse frame = new JHouse();
      frame.setSize(600, 450);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
   public JHouse() {
      con.setLayout(new BorderLayout());
      canvas = new HouseCanvas();
      canvas.setPreferredSize(new Dimension(600, 400));
      con.add(canvas, "Center");
}
   
   class HouseCanvas extends JPanel {
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         setBackground(new Color(0, 204, 255)); //sky blue
         
         // Sun
         g.setColor(Color.YELLOW);
         g.fillOval(480, 10, 80, 80);
         
         // Trees
         g.setColor(new Color(102, 51, 0)); //brown
         g.fillRect(30, 200, 20, 80);
         g.fillRect(120, 200, 20, 80);
         g.fillRect(450, 200, 20, 80);
         g.fillRect(540, 200, 20, 80);
         g.setColor(new Color(0, 204, 0)); // green
         g.fillOval(0, 150, 80, 80);
         g.fillOval(90, 150, 80, 80);
         g.fillOval(420, 150, 80, 80);
         g.fillOval(510, 150, 80, 80);
         
         // Chimney (moved here to be behind house)
         g.setColor(new Color(102, 51, 0)); // brown
         g.fillRect(350, 80, 20, 70);
         g.setColor(Color.GRAY);
         g.fillRect(350, 80, 20, 1); // chimney top
            
         // House
         g.setColor(new Color(255, 153, 51)); // orangish
         g.fillRect(200, 150, 200, 150);
         g.setColor(Color.WHITE);
         g.fillRect(220, 180, 40, 50); // window 1
         g.fillRect(340, 180, 40, 50); // window 2
         g.setColor(new Color(153, 76, 0)); // brown
         Polygon roof = new Polygon();
         roof.addPoint(200, 150);
         roof.addPoint(400, 150);
         roof.addPoint(300, 100);
         g.fillPolygon(roof);
         g.setColor(new Color(153, 76, 0)); // brown
         g.fillRect(285, 250, 30, 50); // door
         
         // Garage
         g.setColor(new Color(255, 153, 51)); // brown
         g.fillRect(400, 200, 120, 100);
         g.setColor(new Color(153, 76, 0)); // brown
         Polygon garageRoof = new Polygon();
         garageRoof.addPoint(400, 200);
         garageRoof.addPoint(520, 200);
         garageRoof.addPoint(460, 150);
         g.fillPolygon(garageRoof);
         g.setColor(Color.WHITE);
         g.fillRect(410, 210, 100, 90); // door
         
         // Car
         g.setColor(Color.BLACK);
         g.fillRect(420, 290, 80, 40); // body
         g.setColor(Color.GRAY);
         g.fillRect(420, 270, 80, 20); // windshield (tinted)
         g.setColor(Color.BLACK);
         g.fillRect(420, 270, 80, 4); // windshield border Top
         g.fillRect(420, 270, 4, 40); // windshield border (L)
         g.fillRect(496, 270, 4, 40); // windshield border (R)
         g.setColor(Color.BLACK);
         g.fillOval(407, 286, 15, 8); // side mirror (L)
         g.fillOval(498, 286, 15, 8); // side mirror (R)
         g.setColor(Color.YELLOW);
         g.fillOval(425, 295, 20, 10); // headlight
         g.fillOval(475, 295, 20, 10); // headlight
         g.setColor(Color.WHITE);
         g.fillRect(445, 320, 30, 5); // license plate
         
         // Street
         g.setColor(new Color(51, 51, 51)); // darker gray
         g.fillRect(0, 350, 600, 50);
         g.setColor(Color.WHITE);
         for (int i = 0; i < 600; i += 40) {
            g.fillRect(i, 375, 20, 5); // white lines
}
        
         // Mailbox
         g.setColor(new Color(255, 153, 51)); // brown
         g.fillRect(80, 280, 10, 70);
         g.setColor(Color.RED);
         g.fillRect(65, 280, 40, 40); // mailbox
         g.setColor(Color.BLACK);
         g.fillRect(80, 290, 10, 5);
        
         // Flowers
         g.setColor(Color.YELLOW);
         g.fillOval(150, 280, 20, 20);
         g.setColor(Color.PINK);
         g.fillOval(180, 280, 20, 20);
         g.setColor(Color.WHITE);
         g.fillOval(160, 275, 20, 20);
         g.fillOval(170, 290, 20, 20);

  }
 }
}