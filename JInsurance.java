import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JInsurance extends JFrame implements ItemListener {
   int HMO_PRICE = 200;
   int PPO_PRICE = 300;
   int DENTAL_PRICE = 75;
   int VISION_PRICE = 20;
   int cost = HMO_PRICE;
   
   JCheckBox hmo = new JCheckBox("HMO", true);   
   JCheckBox ppo = new JCheckBox("PPO");
   JCheckBox dental = new JCheckBox("Dental");
   JCheckBox vision = new JCheckBox("Vision");
   
   JLabel label1 = new JLabel("Choose your Health Insurance Options");
   JLabel label2 = new JLabel("Primary Care (choose one):");
   JLabel label3 = new JLabel("Optional Insurance Choices:");
   JLabel insCost = new JLabel("Cost of Insurance: $" + cost);
   
   Font font = new Font("Arial", Font.BOLD, 16);
   
   ButtonGroup insGrp = new ButtonGroup();
   
   public static void main(String [] args) {
         JInsurance frame = new JInsurance();
         frame.setSize(350,200);
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

   public JInsurance() {
      setLayout(new FlowLayout());
      insGrp.add(hmo);
      insGrp.add(ppo);
      label1.setFont(font);
      
      add(label1);
      add(label2);
      add(hmo);
      add(ppo);
      add(label3);
      add(dental);
      add(vision);
      add(insCost);
      
      hmo.addItemListener(this);
      ppo.addItemListener(this);
      dental.addItemListener(this);
      vision.addItemListener(this);
}
   public void itemStateChanged(ItemEvent e) {
   Object source = e.getSource();
   int select = e.getStateChange();
   
   if(source == hmo)
      if(select == ItemEvent.SELECTED)
         cost += HMO_PRICE;
      else
         cost -= HMO_PRICE;
   
      if(source == ppo)
         if(select == ItemEvent.SELECTED)
            cost += PPO_PRICE;
         else
            cost -= PPO_PRICE;
         
      if(source == dental)
         if(select == ItemEvent.SELECTED)
            cost += DENTAL_PRICE;
         else
            cost -= DENTAL_PRICE;
         
      if(source == vision)
         if(select == ItemEvent.SELECTED)
            cost += VISION_PRICE;
         else
            cost -= VISION_PRICE;
 
      insCost.setText("Cost of Insurance: $" + cost);  
 }   
}