import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener {
   double SMALL_PRICE = 7.00;
   double MEDIUM_PRICE = 9.00;
   double LARGE_PRICE = 11.00;
   double EXTRA_LARGE_PRICE = 14.00;
   double cost = SMALL_PRICE;
   double toppingPrice = 0.0;
   
   JRadioButton small = new JRadioButton("Small ($" + SMALL_PRICE +")", true);
   JRadioButton medium = new JRadioButton("Medium ($" + MEDIUM_PRICE +")");
   JRadioButton large = new JRadioButton("Large ($" + LARGE_PRICE +")");
   JRadioButton extraLarge = new JRadioButton("Extra Large ($" + EXTRA_LARGE_PRICE +")");
   
   JCheckBox cheese = new JCheckBox("Cheese");
   JCheckBox pepperoni = new JCheckBox("Pepperoni");
   JCheckBox sausage = new JCheckBox("Sausage");
   JCheckBox mushrooms = new JCheckBox("Mushrooms");
   JCheckBox onions = new JCheckBox("Onions");
   
   JLabel label1 = new JLabel("Choose your Pizza Size:");
   JLabel label2 = new JLabel("Choose your Toppings:");
   JLabel pizzaCost = new JLabel("Cost of Pizza: $" + cost);
   
   Font font = new Font("Arial", Font.BOLD, 16);
   
   ButtonGroup sizeGrp = new ButtonGroup();
   
   public static void main(String [] args) {
      JPizza frame = new JPizza();
      frame.setSize(700,125);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
   public JPizza() {
      setLayout(new FlowLayout());
      sizeGrp.add(small);
      sizeGrp.add(medium);
      sizeGrp.add(large);         
      sizeGrp.add(extraLarge); 
      label1.setFont(font);
      label2.setFont(font);
      
      add(label1);
      add(small);  
      add(medium);
      add(large);
      add(extraLarge);
      add(label2);
      add(cheese);
      add(pepperoni);
      add(sausage);
      add(mushrooms);
      add(onions);
      add(pizzaCost);
      
      small.addItemListener(this);
      medium.addItemListener(this);
      large.addItemListener(this);
      extraLarge.addItemListener(this);
      cheese.addItemListener(this);
      pepperoni.addItemListener(this);
      sausage.addItemListener(this);
      mushrooms.addItemListener(this);
      onions.addItemListener(this);
}
   
   public void itemStateChanged(ItemEvent e) {
      Object source = e.getSource();
      int select = e.getStateChange();
      
      if(source == small) {
         if(select == ItemEvent.SELECTED) {
            cost = SMALL_PRICE;
 }
}       
      else if(source == medium) {
            if(select == ItemEvent.SELECTED) {
               cost = MEDIUM_PRICE;
 }      
}
      else if(source == large) {
            if(select == ItemEvent.SELECTED) {
               cost = LARGE_PRICE;
 }      
}
      else if(source == extraLarge) {
            if(select == ItemEvent.SELECTED) {
               cost = EXTRA_LARGE_PRICE;
 }
}
      else if(source == pepperoni || source == sausage || source == mushrooms || source == onions) {
            if(source != cheese) {
            if(select == ItemEvent.SELECTED) {
               toppingPrice += 0.50;
}
            else {
               toppingPrice -= 0.50;
  }
 }
}            
      pizzaCost.setText("Cost of Pizza: $" + (cost + toppingPrice));
 }
}