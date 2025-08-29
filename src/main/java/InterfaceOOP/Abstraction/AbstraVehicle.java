package InterfaceOOP.Abstraction;

public  abstract class AbstraVehicle {
    AbstraModel model;
    String Brand;
    AbstraColor Color;
     AbstrafuelType fuelType;
    String plateNumbers;
    String Speed;

    public AbstraVehicle(AbstraModel model, String Brand, AbstraColor Color, AbstrafuelType fuelType,String plateNumbers, String Speed){
        this.model = model;
        this.Brand = Brand;
        this.Color = Color;
        this.fuelType = fuelType;
        this.plateNumbers = plateNumbers;
        this.Speed = Speed;
    }
    public abstract void Move();   //abstract has nobody

    public  void StartEngine(){
        System.out.println(model + "StartEngine");
    }


    //main
    public static void main(String[] args){
        AbstraCar car = new AbstraCar( AbstraModel.Toyota, "Honda", AbstraColor.Red, AbstrafuelType.petrol,"A1111001","3kg");
        AbstraBike Bike = new AbstraBike(AbstraModel.BMW , "Yamaha", AbstraColor.Blue,AbstrafuelType.Electric, "23333333333333", "50kg");
        AbstraBus Bus = new AbstraBus(AbstraModel.HondaCivic, "Volvo", AbstraColor.Green,AbstrafuelType.Electric, "30PR33", "1KG");

        AbstraDriver Diver = new AbstraDriver("John", "35", "2010", car);
        AbstraDriver Diver2 = new AbstraDriver("Micheal", "29", "2015", Bike);
        AbstraDriver Diver3 = new AbstraDriver("Sarah", "42", "2008", Bus);

//        Diver.drive();
        Diver2.drive();
        Diver3.drive();
    }




    public String getInfo() {
        return model + " " + Brand + " (" + Color + ", " + fuelType + ", Plate: " + plateNumbers + ")"
                + " Speed: " + Speed;
    }
}
