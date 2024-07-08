public class RoadBike extends Motorcycle {
   private int engineDisplacement;
   
   public RoadBike(String manufacturer, int wheelSize, int engineDisplacement) {
      super(manufacturer, wheelSize);
      this.engineDisplacement = engineDisplacement;
}

   @Override
   public void describeMoto() {
      System.out.println("RoadBike - " + super.toString() + ", Engine Displacement: " + engineDisplacement);
 }
}
