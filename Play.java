public class Play extends CreativeWork implements Rateable {
   private int premierYear;
   
   public Play(String title, double sumRatings, int numberRatings, int premierYear) {
      super(title, sumRatings, numberRatings);
      this.premierYear = premierYear;
}

   public int getPremierYear() {
      return premierYear;
}
   
   public void setPremierYear(int premierYear) {
      this.premierYear = premierYear;
}

   @Override
   public double getAverageRating() {
      return getSumRatings() / getNumberRatings();
}

   @Override
   public String description() {
      return "This is a play.";
}

   @Override
   public String toString() {
      return String.format("%s Premier Year: %d", super.toString(), premierYear);
 }
}