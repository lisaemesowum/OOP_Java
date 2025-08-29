package InterfaceOOP.Abstraction;

//Association: Driver has a Vehicle, not is a Vehicle.

public class AbstraDriver {     //AbstraDriver does not extend AbstraVehicle.
    //this will not work because driver is not vehicle
//    String name;
//    String age;
//    String yearOfApplying;

    //how to do it
    private String name;
    private String age;
    private String yearOfApplying;
    private AbstraVehicle vehicle;  // association

             // NO
//    public AbstraDriver(AbstraModel model, String Brand, AbstraColor Color, AbstrafuelType fuelType, String plateNumbers, String Speed) {
//        super(model, Brand, Color, fuelType, plateNumbers, Speed);
//        this.name = name;
//        this.age = age;
//        this.yearOfApplying = yearOfApplying;
//    }

//               THIS IS THE WAY
public AbstraDriver(String name, String age, String yearOfApplying, AbstraVehicle vehicle) {
    this.name = name;
    this.age = age;
    this.yearOfApplying = yearOfApplying;
    this.vehicle = vehicle;
}


//    @Override
//    public void Move() {
//        System.out.println("Driver is controlling the car on the road");
//    }


    public void drive() {
        System.out.println("Driver " + name + " is driving " + vehicle.getInfo());
        vehicle.Move(); // delegate to the vehicle’s move
    }
}
