package InterfaceOOP.Abstraction;

public class AbstraBus extends AbstraVehicle{

    public AbstraBus(AbstraModel model, String Brand, AbstraColor Color, AbstrafuelType fuelType, String plateNumbers, String Speed) {
        super(model, Brand, Color, fuelType, plateNumbers, Speed);
    }

    @Override
    public void Move() {
        System.out.println("Bus is carrying people along the route");
    }
}
