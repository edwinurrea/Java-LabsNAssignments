import javax.swing.*;
public class CoinToss {
   public static void main(String [] args) {
   int coin, toss;
   int countHeads = 0, countTails = 0;
   String input;
   input = JOptionPane.showInputDialog(null, "How many coin tosses? ");
   toss = Integer.parseInt(input);
   
   for(int i = 0; i < toss; i++) {
      coin = (int)(Math.random() * 2) + 1;
      switch(coin) {
         case 1: countHeads++; break;
         case 2: countTails++; break;
         default: System.out.println("Invalid toss");
 } 
}
   JOptionPane.showMessageDialog(null, "For " + toss + " tosses of a coin, the results are:\n" +
                                       100*countHeads/toss + "% heads (" + countHeads + " out of " + toss + ")\n" + 
                                       100*countTails/toss + "% tails (" + countTails + " out of " + toss + ")"); 
 }
}x