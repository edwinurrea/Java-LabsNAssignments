public class Movie extends CreativeWork implements Rateable {
   private String director;
   
   public Movie(String title, double sumRatings, int numberRatings, String director) {
      super(title, sumRatings, numberRatings);
      this.director = director;
}

   public String getDirector() {
      return director;
}

   public void setDirector(String director) {
      this.director = director;
}
 
   @Override
   public double getAverageRating() {
      return getSumRatings() / getNumberRatings();
}

   @Override
   public String description() {
      return "This is a movie.";
}

   @Override
   public String toString() {
      return String.format("%s Director: %s", super.toString(), director);
 }
}