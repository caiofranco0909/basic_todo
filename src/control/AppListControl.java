package control;

import java.sql.Date;
import java.util.ArrayList;

import sample.AppList;
import sample.Task;

public class AppListControl {
    private static ArrayList<AppList> appLists;
    //Vários modos de criar Listas
    public AppList createAppList(String name, String description, Date start, Date deadline){
        AppList appList = new AppList(name, description, start, deadline);
        appLists.add(appList);
        return appList;
    }
    //Adição e Remoção de Tasks
    public void addTask(AppList appList, Task task){
        appList.getTasks().add(task);
    }
    public void removeTask(AppList appList, Task task){
        appList.getTasks().remove(task);
    }
    //Getters and Setters
    public static ArrayList<AppList> getAppLists() {
        return appLists;
    }
    public static void setAppLists(ArrayList<AppList> appLists) {
        AppListControl.appLists = appLists;
    }
    
}
