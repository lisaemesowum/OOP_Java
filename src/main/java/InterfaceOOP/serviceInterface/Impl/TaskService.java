package InterfaceOOP.serviceInterface.Impl;

import InterfaceOOP.models.Tasks;

import java.util.List;

//service interface (TaskService) that defines how
// tasks should be managed.


//TaskService (the interface) is about how tasks should be managed.
public interface TaskService {
//    Tasks addNewTask(Tasks task);   //interface defines a contract (addNewTask) without saying how it will be done.
    String addNewTask(Tasks task);      //  //the Tasks is where the input the parameter the id , name etc because we have already done in it , im our Task.java because we structure it

    //allow user to update the task
    String updateTask(int taskId, Tasks task);  //update task by id

    //to get a single task      //display all the task
    Tasks getSingleTask(int taskId);  //we can use id to get entire task that match


    // list all tasks
    List<Tasks> list_task();   // we cannot use .length

    //to delete a task
    void deleteTask(int taskId); // // delete task by id
}
