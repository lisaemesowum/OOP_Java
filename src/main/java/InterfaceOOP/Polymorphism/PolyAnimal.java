package InterfaceOOP.Polymorphism;

public class PolyAnimal {
//    @Override
    public  void sound(){
        System.out.println("Every animal makes sound");
    }





    public static void main(String[] args){

        //  overright polymorphism

        PolyAnimal animal = new PolyAnimal();
        PolyCat cat = new PolyCat();

        cat.sound();
        animal.sound();

    }
}
