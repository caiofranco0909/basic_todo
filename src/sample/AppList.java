package sample;

import java.util.ArrayList;
import java.sql.Date;

public class AppList {
    private int id;
    private String name;
    private String description;
    private Date start;
    private Date deadline;
    private ArrayList<Task> tasks;
    private static int nextId = 1;

    public AppList(String name, String description, Date start, Date deadline){
        this.name = name;
        this.description = description;
        this.start = start;
        this.deadline = deadline;
        id = nextId;
        nextId++;
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
    public int getId() {
        return id;
    }
    
}
