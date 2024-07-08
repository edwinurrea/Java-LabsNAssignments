import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jdsc extends JFrame implements MouseMotionListener {
   JLabel welcome = new JLabel("", JLabel.CENTER);
   JMenuBar menuBar = new JMenuBar();
   JMenu schoolMenu = new JMenu("Schools");
   JMenuItem liberalArtsItem = new JMenuItem("Liberal Arts");
   JMenuItem businessItem = new JMenuItem("Business");
   JMenuItem mathScienceItem = new JMenuItem("Math & Science");
   
   JMenu majorsMenu = new JMenu("Majors");
   JMenuItem major1Item = new JMenuItem("General Studies, Computer Science Pathway");
   JMenuItem major2Item = new JMenuItem("Computer Networking and Service Technology");
   
   JMenu activitiesMenu = new JMenu("Activities");
   JMenuItem activity1Item = new JMenuItem("The Nest");
   JMenuItem activity2Item = new JMenuItem("Community Engagement");
   
   public static void main(String[] args) {
      Jdsc frame = new Jdsc();
      frame.setSize(800, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
   public Jdsc() {
      setTitle("Dalton State College");
      welcome.setFont(new Font("Times New Roman", Font.BOLD, 24));
      welcome.setForeground(Color.WHITE);
      
      add(welcome);
      
      setJMenuBar(menuBar);
            
      menuBar.add(schoolMenu);
         schoolMenu.add(liberalArtsItem);
         schoolMenu.add(businessItem);
         schoolMenu.add(mathScienceItem);
      menuBar.add(majorsMenu);
         majorsMenu.add(major1Item);
         majorsMenu.add(major2Item);
      menuBar.add(activitiesMenu);
         activitiesMenu.add(activity1Item);
         activitiesMenu.add(activity2Item);
      
      addMouseMotionListener(this);
}

   public void mouseMoved(MouseEvent e) {
      getContentPane().setBackground(new Color(0, 48, 73));
      welcome.setText("Welcome to Dalton State College!");
}
   
   public void mouseDragged(MouseEvent e) {
}
}