public abstract class CreativeWork {
   private String title;
   private double sumRatings;
   private int numberRatings;
   
   public CreativeWork(String title, double sumRatings, int numberRatings) {
      this.title = title;
      this.sumRatings = sumRatings;
      this.numberRatings = numberRatings;
}

   public String getTitle() {
      return title;
}

   public void setTitle(String title) {
      this.title = title;
}

   public double getSumRatings() {
      return sumRatings;
}

   public void getSumRatings(double sumRatings) {
      this.sumRatings = sumRatings;
}

   public int getNumberRatings() {
      return numberRatings;
}

   public void getNumberRatings(int numberRatings) {
      this.numberRatings = numberRatings;
}

   @Override
   public String toString() {
      return String.format("Title: %s, Sum of Ratings: %.2f, Number of Ratings: %d,", title, sumRatings, numberRatings);
}

   public abstract String description();
}