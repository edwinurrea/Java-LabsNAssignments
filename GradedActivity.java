import java.util.*;
public class GradedActivity {
   private double score;
   char letterGrade;
   
   public void setScore(double s) {
      score = s;
}
   public double getScore() {
     return score;
}
   public char getGrade() {
      if(score >= 90)
         letterGrade = 'A';
      else if (score >= 80)
         letterGrade = 'B';
      else if (score >= 70)
         letterGrade = 'C';
      else if (score >= 60)
         letterGrade = 'D';
      else 
         letterGrade = 'F';
         
      return letterGrade;
 }
}
   interface Relatable {
      boolean equals(GradedActivity g);
      boolean isGreater(GradedActivity g);
      boolean isLess(GradedActivity g);
}
   class Exam extends GradedActivity implements Relatable {
      private int numQuestions;
      private double pointsEach;
      private int numMissed;
      double score;
      
   public Exam(int q, int m) {
      numQuestions = q;
      numMissed = m;
      
      pointsEach = 100.0 / numQuestions;
      score = 100.0 - (numMissed * pointsEach);
      setScore(score);
}
   public double getNumQuestions() {
      return numQuestions;
}
   public double getNumMissed() {
      return numMissed;
}
   public boolean equals(GradedActivity g) {
      boolean status = false;
      if(getScore() == g.getScore())
         status = true;
      return status;
}
   public boolean isGreater(GradedActivity g) {
      boolean status = false;
      if(getScore() > g.getScore())
         status = true;
      return status;
}
   public boolean isLess(GradedActivity g) {
      boolean status = false;
      if(this.getScore() < g.getScore())
         status = true;
      return status;
 }
}
class RelateExams {
   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      int q, m;
      
      System.out.print("Enter number of questions for exam 1: ");
      q = input.nextInt();
      System.out.print("Enter number of questions missed for exam 1: ");
      m = input.nextInt();
      
      Exam exam1 = new Exam(q, m);
      
      System.out.print("Enter number of questions for exam 2: ");
      q = input.nextInt();
      System.out.print("Enter number of questions missed for exam 2: ");
      m = input.nextInt();
      
      Exam exam2 = new Exam(q, m);
      
      System.out.println("Exam 1: " + exam1.getScore() + " (" + exam1.getGrade() + ")");
      System.out.println("Exam 2: " + exam2.getScore() + " (" + exam2.getGrade() + ")");
      
      if(exam1.equals(exam2))
         System.out.println("The exam scores are equal.");
      if(exam1.isGreater(exam2))
         System.out.println("Exam 1 score is the highest.");
      if(exam1.isLess(exam2))
         System.out.println("Exam 2 score is the highest.");
      else
         System.out.println("Something is wrong.");
 }
}