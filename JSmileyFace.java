import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSmileyFace extends JFrame implements ActionListener {
      Container con = getContentPane();
      JButton button = new JButton("Click Me");
      boolean smile = true;
      String str = "I'm Happy";
      Font font = new Font("Comic Sans MS", Font.ITALIC, 18);
      
   public static void main(String[] args) {
      JSmileyFace frame = new JSmileyFace();
      frame.setSize(400, 400);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

   public JSmileyFace() {
      con.setLayout(new FlowLayout());
      con.add(button);
      button.addActionListener(this);
}
   
   public void actionPerformed(ActionEvent e) {
      if(smile) {
         smile = false;
         str = "I'm Sad";
}     else {
         smile = true;
         str = "I'm Happy";
}
      repaint();
}
   
   public void paint(Graphics g) {
      super.paint(g);
      if(smile)
         g.setColor(Color.YELLOW);
      else
         g.setColor(new Color(173, 216, 230));
      
      g.fillOval(100, 100, 200, 200);
      g.setColor(Color.BLACK);
      g.fillOval(140, 150, 20, 25);
      g.fillOval(240, 150, 20, 25);
      g.setFont(font);
      g.drawString(str, 100, 350);
      
      if(smile)
         g.drawArc(140, 150, 120, 120, 200, 140);
      else
         g.drawArc(140, 220, 120, 120, 30, 120);
 }
}