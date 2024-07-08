public class SingleFamilyDwelling extends RealEstateProperty {
   private int squareFeet;
   
   @Override
   public String toString() {
      return String.format("%s Square Feet: %d",
      super.toString(), squareFeet);
}

   public SingleFamilyDwelling(String address, double price, int squareFeet) {
      super(address, price);
      this.squareFeet = squareFeet;
}

   public int getSquareFeet() {
      return squareFeet;
}

   public void setSquareFeet(int squareFeet) {
      this.squareFeet = squareFeet;
 }
}