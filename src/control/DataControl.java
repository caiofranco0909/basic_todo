package control;

import java.sql.Connection;
import java.sql.Date;

import data.ConnectionDB;
import data.DataWriter;
import sample.Folder;


public class DataControl {
    private static Connection connection;
    private DataWriter dataWriter = new DataWriter();
    public DataControl(){
        connection = ConnectionDB.concectBD();
    }
    public void createTables(){
        try {
            dataWriter.creatTable(connection, 0);
            dataWriter.creatTable(connection, 1);
            dataWriter.creatTable(connection, 2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void insertFolder(int id, String name, String description, int parentId){
        try {
            dataWriter.insertFolder(connection,id,name,description,parentId);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void insertAppList(int id, String name, String description, Date start, Date deadline, int folderId){
        try {
            dataWriter.insertAppList(connection, id, name, description, start, deadline, folderId);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
}
