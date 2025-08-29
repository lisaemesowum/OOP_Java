package InterfaceOOP.Encapsulation;

//ENCAPSULATION    // encapsulation
//it is a attributes of a class will be hidden or private to keep data safe it can be accessed only
// getters or setters.
//public
//private
//protected
//package
public class Car {
    //constructor method a tool we use to fellow those rules when building objects

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
//      this.make = make;    //since we are setting the make within a setter method we no longer need this line to change this
        this.setMake(make);   //so we can do it like this for the sitter method to change
//      this.model = model;
        this.setModel(model);
//      this.year = year;
        this.setyear(year);
    }


//    Getter method
// getter method in Java is a method that is used to access (or get)
// the value of a private field (variable) in a class.

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

//Setter Method
// A setter method is used to update/change the value of a private field in a class.
//    can’t assign values directly.

    //so lets change the year

    public void setMake(String make){  //we are using void because we are not returning any thing
        this.make = make;
    }
    public void setModel(String Model){  //we are using void because we are not returning any thing
        this.model = model;
    }
    public void setyear(int year){  //we are using void because we are not returning any thing
        this.year = year;
    }




    public static void main(String[] args){
        Car car = new Car ( "chevorolet", "camero", 2021);
        // This works because we are still inside Car class
        //getter method
//      System.out.println(car.getMake());
//      System.out.println(car.getModel());
//      System.out.println(car.getYear());


        //now in set we cannot do it like this because it is private
        car.year = 2022;  //this will not work
        //now lets change this values

        car.setyear(2022);
        //then use the getter methode to show the year
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }


}
