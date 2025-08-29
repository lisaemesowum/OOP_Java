 package InterfaceOOP.Inheritance;

public class Manager extends Employees {

    private String[] teamName;

    //create a Constructor

    public Manager  (  String id, String firstName, String lastName, int age,  String[] teamName) {
        super (id, firstName, lastName , age);
        this.teamName = teamName;
//        this.setTeamName(teamName);
//        this.setTeamName(teamName);
    }
    public StringBuilder addEmployee(String[] names){
        StringBuilder sb = new StringBuilder();

        for(String name : names){
            sb.append(name);
        }
        return sb;
    }
public  void setTeamName( String[] teamName){
        this.teamName = teamName;
}
public String[] getTeamName(){
        return teamName;
}


    // Use Arrays.toString so team names display correctly
    public String  managerDetails(){
//        return super.personInfo() + "\nTeamNames:"+ teamName;
        return super.personInfo() + "\nTeamNames:"+ String.join(", ", teamName);
    }

}
