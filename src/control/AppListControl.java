package control;

import java.util.Date;

import sample.AppList;
import sample.Task;

public class AppListControl {
    //Vários modos de criar Listas
    public AppList createAppList(String name, String description, Date start, Date deadline){
        return new AppList(name, description, start, deadline);
    }
    //Adição e Remoção de Tasks
    public void addTask(AppList appList, Task task){
        appList.getTasks().add(task);
    }
    public void removeTask(AppList appList, Task task){
        appList.getTasks().remove(task);
    }
}
