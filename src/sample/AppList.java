package sample;

import java.util.ArrayList;
import java.util.Date;

public class AppList {
    private String name;
    private String description;
    private Date start;
    private Date deadline;
    private ArrayList<Task> tasks;

    public AppList(String name, String description, Date start, Date deadline){
        this.name = name;
        this.description = description;
        this.start = start;
        this.deadline = deadline;
    }
    public AppList(String name, String description, Date date, boolean isDeadline){
        this.name = name;
        this.description = description;
        if (isDeadline){
            this.deadline = date;
        }
        else{
            this.start = date;
        }
    }
    public AppList(String name, String description){
        this.name = name;
        this.description = description;
    }
    public AppList(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getDeadline() {
        return deadline;
    }
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
