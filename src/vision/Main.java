package vision;


import control.AppListControl;
import control.DataControl;
import control.FolderControl;
import control.TaskControl;
import sample.Folder;


public class Main {
    public static void main(String[] args) throws Exception {
        DataControl dc = new DataControl();
        FolderControl fc = new FolderControl();
        AppListControl apc = new AppListControl();
        TaskControl tc = new TaskControl();
        FolderControl.setFolders(DataControl.readFolder());
        Folder folder = fc.createFolder("avla", "casdasd", 0);
        Folder folder2 = fc.createFolder("folderasd", null, 1);
        System.out.println(FolderControl.getFolders().get(0).getName());
        System.out.println(FolderControl.getFolders().get(1).getName());
    }
}
