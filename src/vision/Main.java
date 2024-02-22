package vision;


import data.*;
import sample.Folder;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        DataControl dc = new DataControl();
        dc.creatTable(0);
        dc.creatTable(1);
        dc.creatTable(2);
    }
}
