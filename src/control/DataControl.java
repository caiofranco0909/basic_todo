package control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import data.ConnectionDB;
import data.DataReader;
import data.DataWriter;
import sample.Folder;
public class DataControl {
    private static Connection connection;
    private final DataWriter dataWriter = new DataWriter();
    private final static DataReader dataReader = new DataReader();
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
    public static ArrayList<Folder> readFolder(){
        ArrayList<Folder> arrayList = dataReader.readFolder(connection);
        return arrayList;
    }
    public void insertAppList(int id, String name, String description, Date start, Date deadline, int folderId){
        try {
            dataWriter.insertAppList(connection, id, name, description, start, deadline, folderId);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public  void insertTask(int id,String name, int appListId){
        try {
            dataWriter.insertTask(connection,id,name,appListId);
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    
}
