public class First {
   public static void main (String [ ] args) {
int num1 = 2;
double num2;
 
num2 = calculate(num1);
System.out.println("The number tripled is " + num2);
   }
   public static double calculate(int number) {
double triple = number * 3.0;
     return triple;
   }
}