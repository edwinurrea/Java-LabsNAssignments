import java.util.*;
public class UseCourse {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the department: ");
      String department = sc.nextLine();
      System.out.print("Enter the course number: ");
      int courseNumber = sc.nextInt();
      System.out.print("Enter the credit hours: ");
      int creditHours = sc.nextInt();
         
   CollegeCourse course;
      if (department.equals("BIOL") || department.equals("CHEM") ||
          department.equals("CMPS") || department.equals("PHYS")) {
          course = new LabCourse(department, courseNumber, creditHours);
}
      else {
         course = new CollegeCourse(department, courseNumber, creditHours);
}
         course.display();
 }
}