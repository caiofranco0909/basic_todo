package sample;

import java.util.ArrayList;

public class Folder {
    private int id;
    private String name;
    private String description;
    private Folder parent;
    private ArrayList<AppList> appLists;
    private ArrayList<Folder> folders;
    private static int nextId = 1;

    public Folder(String name, String description, Folder parent){
        this.name = name;
        this.description = description;
        this.parent = parent;
        id = nextId;
        nextId++;
    }

    public Folder(String name, Folder parent){
        this.name = name;
        this.parent = parent;
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

    public Folder getParent() {
        return parent;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }

    public int getId() {
        return id;
    }
    
}
