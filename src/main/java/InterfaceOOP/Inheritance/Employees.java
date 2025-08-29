package InterfaceOOP.Inheritance;

public class Employees {
    //inheritance
    private  final String id;
    private final String firstName ;
    private  final String lastName;
    private  final int age;

    //create a Constructor
    public Employees (String id, String firstName, String lastName, int age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

public  String personInfo(){
    return "Employees { " +
            "id = " + id +
            ", firstName = " + firstName +
            ", lastName = " + lastName +
            ", age = " + age +
            '}' ;
}

}
