package sample;

import java.util.ArrayList;

public class Folder {
    private int id;
    private String name;
    private String description;
    private int parentId;
    private ArrayList<AppList> appLists;
    private ArrayList<Folder> folders;
    private static int nextId = 1;

    public Folder(String name, String description, int parentId){
        this.name = name;
        this.description = description;
        this.parentId = parentId;
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

    public ArrayList<AppList> getAppLists() {
        return appLists;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public int getParent() {
        return parentId;
    }

    public void setParent( int parentId) {
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }
    
}
