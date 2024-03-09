package control;
import sample.Folder;

import java.util.ArrayList;

import sample.AppList;

public class FolderControl {
    private static ArrayList<Folder> folders;
    private static DataControl dataControl = new DataControl();
    public FolderControl(){

    }
    //Funcções Relacionadas a Listas
    public void addAppList(Folder folder, AppList appList){
        folder.getAppLists().add(appList);
    }
    public void removeAppList(Folder folder, AppList appList){
        folder.getAppLists().remove(searchAppList(folder, appList));
    }
    public AppList searchAppList(Folder folder, AppList appList){
        for (int i = 0; i < folder.getAppLists().size(); i++) {
            if(folder.getAppLists().get(i).getName().equals(appList.getName())){
                return folder.getAppLists().get(i);
            }
        }
        return null;
    }
    //Funções Relacionas a Pastas
    public Folder createFolder(String name, String description, int parentId){
            Folder folder = new Folder(name, description, parentId);
            folders.add(folder);
            dataControl.insertFolder(folder.getId(), name, description, parentId);
            return folder;
    }
    public void addFolder(Folder mainFolder, Folder newFolder){
        mainFolder.getFolders().add(newFolder);
    }
    public void removeFolder(Folder mainFolder, Folder targetFolder){
        mainFolder.getFolders().remove(searchFolder(mainFolder, targetFolder));
    }
    public Folder searchFolder(Folder mainFolder, Folder targetFolder){
        for (int i = 0; i < mainFolder.getFolders().size(); i++) {
            if(mainFolder.getFolders().get(i).getName().equals(targetFolder.getName())){
                return mainFolder.getFolders().get(i);
            }
        }
        return null;
    }
    //Getters and Setters
    public static ArrayList<Folder> getFolders() {
        return folders;
    }
    public static void setFolders(ArrayList<Folder> folders) {
        FolderControl.folders = folders;
    }
    
}
