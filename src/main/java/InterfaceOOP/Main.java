package InterfaceOOP;

import InterfaceOOP.models.Tasks;
import InterfaceOOP.serviceInterface.Impl.CreditCardImpl;
import InterfaceOOP.serviceInterface.Impl.TaskImpl;
import InterfaceOOP.serviceInterface.Impl.TaskService;
import InterfaceOOP.serviceInterface.PaystackImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        this main is for the Task / TaskService / TaskImpl

//        Here we are creating an object of TaskImpl but storing it in a variable of type TaskService (the interface).
        TaskService taskService = new TaskImpl();
//==========================================================================================================================
//        Right now it has nothing inside (because you didn’t pass values).
        Tasks task = new Tasks();
//==========================================================================================================================
//        addNewTask(task) calls your hardcoded code:
        String result = taskService.addNewTask(task);
        System.out.println("Add Task Result: " + result);
        System.out.println(task);   //Printing task shows the values:
// ======================================================================================================================
//        Update task
        String updateResult = taskService.updateTask(101, task);
        System.out.println("Update Result: " + updateResult);
        System.out.println(task);

//
//=====================================================================================================================================
//        Get a single task   This means: “Find task by ID”.
        Tasks singleTask = taskService.getSingleTask(101);
        System.out.println("Get Single Task: " + singleTask);

//===========================================================================================================================================
//        List all tasks
        System.out.println("All Tasks: " + taskService.list_task());  //returns an empty list (List.of()), so it prints [].

//===========================================================================================================================================
//        Delete task

//        taskService.deleteTask(101);  //For now, this does nothing (empty body).





//=================================================================================================================================================================
//        for the payment
        System.out.println("\n==================================================");
        CreditCardImpl credit = new CreditCardImpl();
        credit.pay(5000);
        credit.refund(2000);

        System.out.println("\n================================");

        PaystackImpl pay = new PaystackImpl();
        pay.pay(10000);
        pay.refund(3000);





    }
}