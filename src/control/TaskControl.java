package control;

import java.util.ArrayList;

import sample.Task;

public class TaskControl {
    private static ArrayList<Task> tasks;

    public Task createTask(String name){
        increaseCount();
        return new Task(name);
    }
    public void increaseCount(){
        Task.setCount(Task.getCount()+1);
    }
    public void decreaseCount(){
        Task.setCount(Task.getCount()-1);
    }
    public void checkTask(Task task){
        task.setCheckded(true);
        decreaseCount();
    }
    public void uncheckTask(Task task){
        task.setCheckded(false);
        increaseCount();
    }
    //Getters and Setters
    public static ArrayList<Task> getTasks() {
        return tasks;
    }
    public static void setTasks(ArrayList<Task> tasks) {
        TaskControl.tasks = tasks;
    }
    
}
