public class DirtBike extends Motorcycle {
   private String tireType;
      
   public DirtBike(String manufacturer, int wheelSize, String tireType) {
      super(manufacturer, wheelSize);
      this.tireType = tireType;
}

   @Override
   public void describeMoto() {
      System.out.println("DirtBike - " + super.toString() + ", Tire Type: " + tireType);
 }
}
