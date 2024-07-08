public class TestCreativeWork {
   public static void main(String[] args) {
   
   CreativeWork[] works = {
      new Movie("Movie 1", 9.5, 100, "Director 1"),
      new Movie("Movie 2", 9.0, 150, "Director 2"),
      new Play("Play 1", 7.0, 50, 2023),
      new Play("Play 2", 7.5, 30, 2020)
};

   for(CreativeWork work : works) {
      System.out.println(work);
      System.out.println("Description: " + work.description());
      System.out.println("Average Rating: " + ((Rateable)work).getAverageRating());
  }
 }
}
