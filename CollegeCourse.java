public class CollegeCourse {
   protected String department;
   protected int courseNumber;
   protected int creditHours;
   protected int fee;
   
   public CollegeCourse(String department, int courseNumber, int creditHours) {
      this.department = department;
      this.courseNumber = courseNumber;
      this.creditHours = creditHours;
      this.fee = creditHours * 120;
}

   public void display() {
      System.out.println("Department: " + department);
      System.out.println("Course Number: " + courseNumber);
      System.out.println("Credit Hours: " + creditHours);
      System.out.println("Fee: " + fee);
 }
}