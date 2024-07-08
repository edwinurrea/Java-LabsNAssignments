import java.util.*;
public class Employee {
   private String name;
   private double wage, hours, pay;
   
   public void Employee() {
}
   public void Employee(String N, double WG, double HR) {
      name = N;
      wage = WG;
      hours = HR;
}
   public void setN(String n) {
      name = n;
}
   public String getN() {
   return name;
}
   public void setWG(double n) {
      wage = n;
}
   public double getWG() {
   return wage;
}
   public void setHR(double n) {
      hours = n;
}
   public double getHR() {
   return hours;
}
   public void calculate() {
   pay = wage*hours;
}
   public double getpay() {
   return pay;
}
   public void display() {
   calculate();
   System.out.println(name + ", at $" + wage + " per hour for " + hours + " hours, your weekly pay is $" + pay);
 }
}
   

 