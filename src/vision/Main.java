package vision;


import control.AppListControl;
import control.DataControl;
import control.FolderControl;
import control.TaskControl;
import sample.AppList;
import sample.Folder;
import sample.Task;

public class Main {
    public static void main(String[] args) throws Exception {
        DataControl dc = new DataControl();
        FolderControl fc = new FolderControl();
        AppListControl apc = new AppListControl();
        TaskControl tc = new TaskControl();

        FolderControl.setFolders(DataControl.readFolder());
        System.out.println(FolderControl.getFolders().get(0).getName());
        System.out.println(FolderControl.getFolders().get(1).getName());
    }
}
