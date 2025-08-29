package InterfaceOOP.Inheritance;

//inheritance
public class Students  extends  Employees {

    private final Department dept;

    private String studentNo;


    public Students(String id, String firstName, String lastName, int age, String studentNo, Department dept) {
        super(id, firstName, lastName, age);
        this.studentNo = studentNo;
        this.dept = dept;
    }

    public String studentDetail() {
        return super.personInfo() +
                "\nstudentNo: " + studentNo +
                "\nDepartment: " + dept;
    }

    public static void main(String[] args) {

//        Students stud1 = new Students("1", "Adebayo", "Micheal", 12, "10101234", Department.BackEnd);
//
//        System.out.println(stud1.studentDetail());
//
////        Manager manager1 = new Manager();
//        String[] team = {"Amarachi", "lisa"};
//
//        Manager manager1 = new Manager("M01", "John", "Smith", 40, team);
//        System.out.println(manager1.managerDetails());
//
//        // Later, use setter to update team
//        String[] newTeam = {"Alice", "Bob", "Charlie", "Diana"};
//        manager1.setTeamName(newTeam);
//
//        System.out.println("\nAfter update:");
//       System.out.println(manager1.managerDetails());
    }
}
