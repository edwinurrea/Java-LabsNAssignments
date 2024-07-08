public abstract class Motorcycle {
   private String manufacturer;
   private int wheelSize;
   
   public Motorcycle(String manufacturer, int wheelSize) {
      this.manufacturer = manufacturer;
      this.wheelSize = wheelSize;
}
   
   public String getManufacturer() {
      return manufacturer;
}

   public int getWheelSize() {
      return wheelSize;
}

   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
}

   public void setWheelSize(int wheelSize) {
      this.wheelSize = wheelSize;
}

   @Override
   public String toString() {
      return String.format("Manufacturer: %s, Wheel Size: %d", manufacturer, wheelSize);
}

   public abstract void describeMoto();
}