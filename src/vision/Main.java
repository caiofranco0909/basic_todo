package vision;


import control.AppListControl;
import control.DataControl;
import control.FolderControl;
import sample.AppList;
import sample.Folder;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        DataControl dc = new DataControl();
        FolderControl fc = new FolderControl();
        AppListControl apc = new AppListControl();
        Folder folder = fc.createFolder("Pasta1", null, null);
        dc.createTables();
        dc.insertFolder(folder.getId(), folder.getName(), folder.getDescription(), 0);
        Folder folder2 = fc.createFolder("Pasta2", "pasta que ta dentro da pasta", folder);
        dc.insertFolder(folder2.getId(), folder2.getName(), folder2.getDescription(), folder.getId());
        AppList ap = apc.createAppList("Grocerires", "Groceries from December", null, null);
        dc.insertAppList(ap.getId(), ap.getName(), ap.getDescription(), ap.getStart(), ap.getDeadline(),folder.getId());
    }
}
