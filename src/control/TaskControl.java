package control;

import sample.Task;

public class TaskControl {
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
}
