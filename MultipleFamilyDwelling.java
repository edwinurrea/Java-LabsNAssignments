public class MultipleFamilyDwelling extends RealEstateProperty {
   private int numberUnits;
   
   @Override
   public String toString() {
      return String.format("%s Number of Units: %d",
      super.toString(), numberUnits);
}

   public MultipleFamilyDwelling(String address, double price, int numberUnits) {
      super(address, price);
      this.numberUnits = numberUnits;
}

   public int getNumberUnits() {
      return numberUnits;
}

   public void setNumberUnits(int numberUnits) {
      this.numberUnits = numberUnits;
 }
}