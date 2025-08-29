package InterfaceOOP.Abstraction;

public class AbstractionNurse extends AbstractionHealthCare {

    public AbstractionNurse(String name, String staffId) {
        super(name, staffId);
    }
    @Override
    public void performDuties(){
        System.out.println("nurse assisting");
    }
}
