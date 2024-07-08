public class RealEstateDemo {
   public static void main(String[] args) {
      RealEstateProperty[] property = new RealEstateProperty[4];
      
      property[0] = new SingleFamilyDwelling("123 Avenue Drive", 30000, 2000);
      property[1] = new SingleFamilyDwelling("456 Distant Rd", 35000, 2200); 
      property[2] = new MultipleFamilyDwelling("789 Live Here Pkwy", 50000, 4);
      property[3] = new MultipleFamilyDwelling("001 Evening Rd", 60000, 5);    
      
      for(RealEstateProperty properties : property) {
         System.out.println(properties);
  }
 }
}