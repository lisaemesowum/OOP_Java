package InterfaceOOP.Polymorphism;

public class PolyVehicle {
    private static PolyVehicle bike;
    private static PolyVehicle boat;

    public void go(){
     System.out.println("The vehicle is moving to it di");
 }






 // create the objects from the methods
    public  static void main(String[] args){
      PolyCar car = new PolyCar();
      PolyBike Bike = new PolyBike();
      PolyBoat Boat = new PolyBoat();

      car.go();
      Bike.go();
      Boat.go();

      // we will place this objects in an array
        //justfor learning purposes
//        PolyCar[]  cars = {cars , bike, boat};   //so this will not work because bike and boat cannot be converted to Car they are not identify as Car, Cars identity is cars .
//        PolyBike[] Bikes = {cars, bike , boat};  //same

//So what we can do is Car Bike and Boat are vehicles so  we will do this
//      
        PolyVehicle[]  vehicles = {car,bike , boat};
//   because they are all extending to the super class vehicle


    }

}
