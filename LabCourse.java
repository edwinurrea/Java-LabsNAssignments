public class LabCourse extends CollegeCourse {
   public LabCourse(String department, int courseNumber, int creditHours) {
      super(department, courseNumber, creditHours);
      this.fee += 50;
}
   public void display() {
      super.display();
      System.out.println("This is a lab course.");
      System.out.println("Fee with lab materials: $" + this.fee);
 }
}
