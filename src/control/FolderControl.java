package control;
import sample.Folder;
import sample.AppList;
public class FolderControl {
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
    public Folder createFolder(String name, String description, Folder parent){
        if (description == null){
            return new Folder(name, parent);
        }
        return new Folder(name, description, parent);
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
}
