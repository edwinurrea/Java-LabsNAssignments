public class TestMotorcycle {
   public static void main(String[] args) {
      RoadBike roadBike1 = new RoadBike("Honda", 18, 300);
      RoadBike roadBike2 = new RoadBike("Ducati", 16, 450);   
      DirtBike dirtBike1 = new DirtBike("Suzuki", 20, "Motorcross");
      DirtBike dirtBike2 = new DirtBike("Kawasaki", 19, "Off-Road");
   
      Motorcycle[] motorcycles = {roadBike1, roadBike2, dirtBike1, dirtBike2};
      
      for(Motorcycle motor : motorcycles) {
         motor.describeMoto();
  }
 }
}