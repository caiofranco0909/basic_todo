package sample;

import java.util.ArrayList;

public class Folder {
    private String name;
    private String description;
    private ArrayList<AppList> appLists;
    private ArrayList<Folder> folders;

    public Folder(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Folder(String name){
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

    public ArrayList<AppList> getAppLists() {
        return appLists;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }
    
}
