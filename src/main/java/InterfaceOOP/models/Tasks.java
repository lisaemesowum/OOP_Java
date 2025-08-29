package InterfaceOOP.models;

import InterfaceOOP.enums.Status;

//Tasks (the POJO) is only about storing task data.
public class Tasks {
    int taskId;
    private String name;
    private String description;
    private Status status;

    //has nobody // default constructor
    public Tasks(){}


    // This is a POJO meaning plain java Object

    public Tasks(int taskId, String name, String description, Status status){
        this.taskId = taskId;
        this.name = name;
        this.description = description;
        this.status = status;
    }
    //getter method   A getter is used to read the value of a private variable.
    public int getTaskId(){
        return  taskId;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public Status getStatus(Status pending){
        return status;
    }


    //setter method

    public void setTaskId(int taskId){
    this.taskId = taskId;
    }



    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setStatus(Status status){
        this.status = status;
    }

    // toString method
    @Override
    public String toString() {
        return "Tasks{" +
                "taskId=" + taskId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
