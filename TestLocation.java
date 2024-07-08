public class TestLocation {
   public static void main(String[] args) {
      Location location1 = new Location("Location 1");
      Location location2 = new Location("Location 2");
      
      Location[] locations = {location1, location2};

      for(Location location : locations) {
         System.out.println(location);
  }
 }
}