import java.util.*;
public class ArrayMethodDemo {
   public static void main(String [] args) {
   int [] demo = new int[10];
   int limit = 0;
   Scanner input = new Scanner(System.in);
   System.out.println("Suggestion: Must be between the integers. \nEnter the limit: " );
   limit = input.nextInt();
       
   for(int i = 0; i < demo.length; i++) {
       System.out.println("Integer " + (i + 1) + ": ");
       demo[i] = input.nextInt();
}
   
       displayAll(demo);
       displayReverse(demo);
       displaySum(demo);
       displayLimit(demo, limit);
       displaySmLgAvg(demo);

}
   
   public static void displayAll(int demo[]) {
       for(int i = 0; i < demo.length; i++) {
           if(i < demo.length - 9)
               System.out.print("\nAll: " + demo[i] + " ");
           else
               System.out.print(demo[i] + " ");
}
       System.out.println();
}
   
   public static void displayReverse(int demo[]) {
       for(int i = demo.length - 1; i >= 0; i--) {
           if(i > demo.length - 2)
               System.out.print("Reverse: " + demo[i] + " ");
           else
               System.out.print(demo[i] + " ");
}
       System.out.println();
}
   
   public static void displaySum(int demo[]) {
       int sum = 0;
       for(int i = 0; i < demo.length; i++) {
           sum += demo[i];
}
       System.out.println("Sum: " + sum);
}
   
   public static void displayLimit(int demo[], int limit){
       System.out.print("Limit: " + limit + "\n");
       for(int i = 0; i < demo.length; i++) {
           if(demo[i] < limit) {
              System.out.print(demo[i] + " ");
 }
}
       System.out.println();
}
   
   public static void displaySmLgAvg(int demo[]) {
       int sum = 0, large = 0, small = 1000000000;
       for(int i = 0; i < demo.length; i++) {
           sum += demo[i];
         if(small > demo[i]) {
            small = demo[i];
 }       
}
       double avg = sum / demo.length;
       
       for(int i = 1; i < demo.length; i++) {
         if(demo[i] > large) {
            large = demo[i];
 }
}
       System.out.print("Smallest: " + small + " Largest: " + large + " Average: " + avg);
 }
} 