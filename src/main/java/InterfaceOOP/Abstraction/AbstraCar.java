package InterfaceOOP.Abstraction;

public class AbstraCar extends AbstraVehicle {


    public AbstraCar(AbstraModel model, String Brand, AbstraColor Color, AbstrafuelType fuelType, String plateNumbers, String Speed) {
        super(model, Brand, Color, fuelType, plateNumbers, Speed);
    }

    @Override
    public void Move() {
        System.out.println("Car is driving on the road");
    }
}
