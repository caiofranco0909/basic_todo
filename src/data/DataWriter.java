package data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import sample.Folder;
import java.sql.Date;
import java.sql.PreparedStatement;
public class DataWriter {
    public static void statementExtUpdate(Connection connection, String query) throws SQLException{
        Statement statement;
            statement = connection.createStatement();
            statement.executeUpdate(query);

    }
    public void creatTable(Connection connection, int indicator) throws SQLException{
        String query;
            switch (indicator) {
                case 0:
                    query = "CREATE TABLE folder (" +
                    "id_folder INTEGER NOT NULL," +
                    "name_folder dm_name," +
                    "description_folder dm_description," +
                    "parent_id INTEGER REFERENCES folder(id_folder)," +
                    "PRIMARY KEY(id_folder)" +
                    ");";
                    statementExtUpdate(connection, query);
                    System.out.println("Folder table created");
                    break;
                case 1:
                query = "CREATE TABLE appList(" +
                "id_appList INTEGER NOT NULL," +
                "name_appList dm_name," +
                "description_appList dm_description," +
                "start_appList DATE," +
                "deadline_appList DATE," +
                "folder_id INTEGER REFERENCES folder(id_folder)," +
                "PRIMARY KEY(id_appList)" +
                ");";
                    statementExtUpdate(connection, query);
                    System.out.println("appList table created");
                    break;
                case 2:
                    query = "CREATE TABLE task (" +
                    "id_task INTEGER NOT NULL," +
                    "name_task dm_name," +
                    "list_id INTEGER REFERENCES appList(id_appList)," +
                    "checked_task BOOLEAN DEFAULT FALSE," +
                    "count_task INTEGER DEFAULT 0," +
                    "PRIMARY KEY(id_task)" +
                    ");";
                    statementExtUpdate(connection, query);
                    System.out.println("Task table created");
                    break;
                default:
                    System.out.println("WrongIndicator");
                    break;
            }
    }
    public void insertFolder(Connection connection, int id, String name, String description, int parentId) throws SQLException{
        if(parentId != 0){
            String query = String.format("INSERT INTO folder(id_folder, name_folder,description_folder,parent_id) VALUES (%d, '%s', '%s', %d) ",id,name,description,parentId);
            statementExtUpdate(connection, query);
            System.out.println("Folder insertion completed");
        }else{
            String query = String.format("INSERT INTO folder(id_folder, name_folder,description_folder) VALUES (%d, '%s', '%s') ",id,name,description);
            statementExtUpdate(connection, query);
            System.out.println("Folder insertion completed");
        }
    }
    public void insertAppList(Connection connection,int id, String name, String description, Date start, Date deadline, int folderId) throws SQLException{
        String query = String.format("INSERT INTO appList(id_appList, name_appList,description_appList, start_appList, deadline_appList, folder_id) VALUES (?, ?, ?, ?, ?, ?) ");
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        statement.setString(2, name);
        statement.setString(3, description);
        statement.setDate(4, start);
        statement.setDate(5, deadline);
        statement.setInt(6, folderId);
        statement.executeUpdate();
        System.out.println("AppList insertion completed");
    }
    public void insertTask(Connection connection, String name){
        

    }
    
}