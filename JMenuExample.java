import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuExample extends JFrame
   implements ActionListener, ItemListener, MouseListener {
   
   Container con = getContentPane();
   JLabel welcome = new JLabel("Welcome", JLabel.CENTER);
   JLabel info = new JLabel("Information goes here");
   
   JMenuBar menuBar = new JMenuBar();
   JMenu fileMenu = new JMenu("File");
   JMenu colorMenu = new JMenu("Color");
   JMenu helpMenu = new JMenu("Help");
   
   JMenuItem exit = new JMenuItem("Exit");
   
   JRadioButtonMenuItem black = new JRadioButtonMenuItem("Black", true);
   JRadioButtonMenuItem red = new JRadioButtonMenuItem("Red");
   JRadioButtonMenuItem green = new JRadioButtonMenuItem("Green");
   JCheckBoxMenuItem visible = new JCheckBoxMenuItem("Visible", true);
   ButtonGroup group = new ButtonGroup();
   
   JMenuItem fileHelp = new JMenuItem("File Help");
   JMenuItem colorHelp = new JMenuItem("Color Help");
   
   public static void main(String[] args) {
      JMenuExample frame = new JMenuExample ();
      frame.setSize(300, 300);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
   public JMenuExample() {
      con.setLayout(new GridLayout(2,0));
      welcome.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      info.setFont(new Font("Ariel", Font.PLAIN, 16));
      
      con.add(welcome);
      con.add(info);
      
      group.add(black);
      group.add(red);
      group.add(green);
      
      setJMenuBar(menuBar);
      
      menuBar.add(fileMenu);
         fileMenu.add(exit);
      
      menuBar.add(colorMenu);
         colorMenu.add(black);
         colorMenu.add(red);
         colorMenu.add(green);
         colorMenu.addSeparator();
         colorMenu.add(visible);
      
      menuBar.add(helpMenu);
         helpMenu.add(fileHelp);
         helpMenu.add(colorHelp);
         
      fileMenu.setMnemonic('F');
      colorMenu.setMnemonic('C');
      helpMenu.setMnemonic('H');
      black.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_MASK));
      red.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
      green.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_MASK));
      visible.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.SHIFT_MASK));
      
      exit.addActionListener(this);
      black.addActionListener(this);
      red.addActionListener(this);
      green.addActionListener(this);
      visible.addItemListener(this);
      fileHelp.addActionListener(this);
      colorHelp.addActionListener(this);
      addMouseListener(this);
}      

   public void actionPerformed(ActionEvent e) {
      Object source = e.getSource();
      if(source == exit)
         System.exit(0);
      else if (source == black)
         info.setForeground(Color.BLACK); 
      else if (source == red)
         info.setForeground(Color.RED);
      else if (source == green)
         info.setForeground(new Color(34,239,34)); //forest green
      else if (source == fileHelp)
         info.setText("You can exit the program");
      else if (source == colorHelp)
         info.setText("You can change the color of this text");
}
   
   public void itemStateChanged(ItemEvent e) {
      if(visible.isSelected())
         info.setVisible(true);
      else
         info.setVisible(false);
}

   public void mouseExited(MouseEvent e) {
      con.setBackground(Color.WHITE);
}

   public void mouseEntered(MouseEvent e) {
      con.setBackground(Color.LIGHT_GRAY);
}

   public void mousePressed(MouseEvent e) {}
   public void mouseReleased(MouseEvent e) {}
   public void mouseClicked(MouseEvent e) {}
}