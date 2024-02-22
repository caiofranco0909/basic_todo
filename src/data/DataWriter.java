package data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import sample.Folder;

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
    public void insertFolder(Connection connection, int id, String name, String description, Folder parent) throws SQLException{
        if(parent != null){
            String query = String.format("INSERT INTO folder(id_folder, name_folder,description_folder,parent_id) VALUES (%d, '%s', '%s', %d) ",id,name,description,parent.getId());
            statementExtUpdate(connection, query);
        }else{
            String query = String.format("INSERT INTO folder(id_folder, name_folder,description_folder) VALUES (%d, '%s', '%s') ",id,name,description);
            statementExtUpdate(connection, query);
        }
    }
    public void insertAppList(Connection connection, String name, String description, Date start, Date deadline){
    
    }
    public void insertTask(Connection connection, String name){
        

    }
    
}