package InterfaceOOP.Abstraction;

public class AbstractionDoctor  extends AbstractionHealthCare {

    public AbstractionDoctor(String name, String staffId){
        super(name, staffId);
    }
    @Override
    public void performDuties() {
        System.out.println("Doctor treating paterients and writing perscription");
    }

}
