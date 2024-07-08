public class SingleFamilyDwelling extends RealEstateProperty {
   private int squareFeet;
   
   @Override
   public String toString() {
      return String.format("Square Feet: %d", squareFeet);
}

   public SingleFamilyDwelling(String address, double price, int squareFeet) {
      super(address, price);
      this.squareFeet = squareFeet;
}

   public int getSquareFeet() {
      return squareFeet;
}

   public void setSquareFeet() {
      this.squareFeet = squareFeet;
 }
}