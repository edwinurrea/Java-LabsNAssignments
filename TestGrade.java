import java.util.*;
public class TestGrade { 
   static final char[] Valid_Grades = {'A', 'B', 'C', 'D', 'F', 'I'};
   
   public static void main(String[] args) {
      int[] studentIds = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
      char[] studentGrades = new char[studentIds.length];
      
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i < studentIds.length; i++) {
         System.out.print("Enter grade for Student " + studentIds[i] + ": ");
         String gradeInput = sc.nextLine().toUpperCase();
         try{ 
            if (gradeInput.length() != 1 || !isValidGrade(gradeInput.charAt(0))) {
               throw new GradeException("Invalid grade entered!");
}
            studentGrades[i] = gradeInput.charAt(0);
}
         catch (GradeException e) {
            System.out.println(e.getMessage());
            studentGrades[i] = 'I';
 }
}
   System.out.println("Student ID:\tGrade:");
   System.out.println("----------\t-----");
   for(int i = 0; i < studentIds.length; i++) {
      System.out.println(studentIds[i] + "\t\t\t" + studentGrades[i]);
 }
}
   static boolean isValidGrade(char grade) {
      for(char validGrade : Valid_Grades) {
         if (grade == validGrade) {
            return true;
 }
}
   return false;
 }
}