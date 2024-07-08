public class RealEstateProperty {
   private String address;
   private double price;
   
   public RealEstateProperty(String address, double price) {
      this.address = address;
      this.price = price;
}

   public String getAddress() {
      return address;
}
   
   public double getPrice() {
      return price;
}   
   
   public void setAddress(String address) {
      this.address = address;
}   
   
   public void setPrices(double price) {
      this.price = price;
}

   @Override
   public String toString() {
      return String.format("Address: %s, Price: $%.1f,", address, price);
 }
}