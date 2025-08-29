package InterfaceOOP.serviceInterface.Impl;

import InterfaceOOP.enums.Status;
import InterfaceOOP.models.Tasks;

import java.util.List;

public class TaskImpl implements TaskService {

    @Override             //this is  hardcoding
    public String addNewTask(Tasks task) {

        task.setName("Eat");                      //overwrites the task’s name to "Eat"
        task.setTaskId(101);                     // overwrites the id to 101 (same id every time)
        task.setStatus(Status.PENDING);         // sets status to PENDING
        task.setDescription("This is nice");   // tries to set description (see NOTE below)
//        System.out.println(task.getName());     //for the getter method  A getter is used to read the value of a private variable
        return "++";                          // returns a placeholder string

    }
//=============Explain this code=
//    1:values were inside task are thrown away and replaced with your hardcoded ones.
//    2:Nothing is saved anywhere. You modify the task object but don’t store it in a list
//    3:Weak return value. "++" doesn’t tell the caller what happened
//


//    =======================================================================================================================================================================================
//this is to  change the details of an existing task (like changing the description or status) if the task exists.

    @Override
    public String updateTask(int taskId, Tasks task) {
        //this is because we are hardcoding as we dont have database/list to search we do
        if(taskId  == 101){
            task.setName("sleep");
            task.setDescription("after lunch nap");
            task.getStatus(Status.COMPLETED);
            return "Task updated successfully!";
        }
        return "Task not found!";   //You try to update a task, but the taskId you passed doesn’t match any existing task.
    }



    //    ==================================================================================================================================
//  when someone calls getSingleTask(101), it should return that task. because we have one task in the addNewTask
    @Override
    public Tasks getSingleTask(int taskId) {
        // check if the ID matches the one we hardcoded
        if(taskId == 101){
            return new Tasks( 101, "Eat", "This is nice", Status.PENDING);
        }
        return null;
    }

//===============================================================================================================================================================================
//The method name says: “give me all the tasks I have.”
    @Override
    public List<Tasks> list_task() {
        return List.of(
                new Tasks(101, "Eat", "This is nice", Status.PENDING)
        );   //Since you are not using a database, you can just hardcode one or more tasks inside the list:
    }
//=====================================================================================================================================================================================
  //This method is for removing a task from your list of tasks.
    @Override
    public void deleteTask(int taskId) {
        if (taskId == 101) {
            System.out.println("Task with ID " + taskId + " deleted!");
        } else {
            System.out.println("Task not found!");
        }
    }
}
