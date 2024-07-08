import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class GraphicsWindow extends JFrame implements ItemListener {
   Container con = getContentPane();
   JPanel checkBoxPanel = new JPanel();
   DrawCanvas canvas;
   JCheckBox [] checkBoxes = new JCheckBox[7];
   String [] title = {"Line", "Rectangle", "Filled Rectangle",
                      "Oval", "Filled Oval", "Arc", "Filled Arc"};
   boolean [] draw = new boolean[7];
   
   public static void main(String[] args) {
      GraphicsWindow frame = new GraphicsWindow();
      frame.pack(); //use panel sizes
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

   public GraphicsWindow() {
      con.setLayout(new BorderLayout());
      checkBoxPanel.setPreferredSize(new Dimension(150, 300));
      checkBoxPanel.setBackground(Color.GRAY);
      
      canvas = new DrawCanvas();
      canvas.setPreferredSize(new Dimension(300, 300));
      canvas.setBackground(Color.WHITE);
      
      con.add(canvas, "Center");
      con.add(checkBoxPanel, "East");
      
      buildCheckBoxPanel();
}

   public void buildCheckBoxPanel() {
      checkBoxPanel.setLayout(new GridLayout(7, 1));
      for(int i = 0; i < title.length; i++) {
         checkBoxes[i] = new JCheckBox(title[i]);
         checkBoxPanel.add(checkBoxes[i]);
         checkBoxes[i].addItemListener(this);
 }
}

   public void itemStateChanged(ItemEvent e) {
      Object source = e.getSource();
      for(int i = 0; i < draw.length; i++)
         if(checkBoxes[i].isSelected())
            draw[i] = true;
         else
            draw[i] = false;
      canvas.repaint();
}

   class DrawCanvas extends JPanel {
      public void paint(Graphics g) {
         super.paint(g);
         Graphics2D g2D = (Graphics2D)g;
         g.setColor(Color.BLACK);
         BasicStroke stroke = new BasicStroke(10.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
         g2D.setStroke(stroke);
         
         if(draw[0])
            g2D.draw(new Line2D.Double(0, 0, 300, 300));
         if(draw[1])
            g2D.draw(new Rectangle2D.Double(20, 20, 100, 100));
         if(draw[2])
            g.fillRect(50, 30, 120, 120);
         if(draw[3])
            g2D.draw(new Ellipse2D.Double(40, 155, 75, 50));
         if(draw[4])
            g.fillOval(200, 125, 75, 50);
         if(draw[5])
            g2D.draw(new Arc2D.Double(200, 40, 75, 50, 0 , 90, Arc2D.PIE)); //.CHORD, .OPEN
         if(draw[6])
            g.fillArc(100, 155, 75, 50, 0, 90);
  }
 }
}