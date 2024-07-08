public class StudentScores {
   public static void main(String [] args) {
      String [] name = {"Anna", "Bill", "Mario", "Zelda"};
      int [][] scores = { {91, 95, 89, 80}, //88.75
                          {82, 99, 90, 91}, //90.5
                          {93, 75, 80, 85}, //83.25
                          {94, 87, 76, 90} }; //86.75
      
      double sum = 0, sum1 = 0, sum2 = 0, sum3 = 0,
             avg = 0, avg1 = 0, avg2 = 0, avg3 = 0;
      int columns, rows;
      columns = scores[0].length;
      rows = scores.length;

      for(int i = 0; i <= 3; i++) {
          System.out.print("\nStudent: " + name[i] + "\tTests: ");
          for(int c = 0; c < columns; c++)
            System.out.print(scores[i][c] + " "); }
      System.out.println(); 
      
      System.out.print("\nAverage Test Scores: \n");
      for(int i = 0; i < rows; i++) {
         for(int c = 0; c < rows; c++) { 
         sum += scores[0][c]; 
         avg = sum/rows/4;
         sum1 += scores[1][c]; 
         avg1 = sum1/rows/4; 
         sum2 += scores[2][c]; 
         avg2 = sum2/rows/4; 
         sum3 += scores[3][c]; 
         avg3 = sum3/rows/4; }}
         
         System.out.print(name[0] + " " + avg + " \n");
         System.out.print(name[1] + " " + avg1 + " \n");
         System.out.print(name[2] + " " + avg2 + " \n");
         System.out.print(name[3] + " " + avg3 + " \n"); 
 }         
}

