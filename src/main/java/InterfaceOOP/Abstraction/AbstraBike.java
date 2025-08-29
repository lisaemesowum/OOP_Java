package InterfaceOOP.Abstraction;

public class AbstraBike extends AbstraVehicle {

    public AbstraBike(AbstraModel model, String Brand, AbstraColor Color, AbstrafuelType fuelType, String plateNumbers, String Speed) {
        super(model, Brand, Color, fuelType, plateNumbers, Speed);
    }

    @Override
    public void Move() {
        System.out.println("Bike is balancing and riding fast");
    }
}
