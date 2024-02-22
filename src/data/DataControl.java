package data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class DataControl {
    private static Connection connection;

    public DataControl(){
        connection = ConnectionDB.concectBD();
    }
    public static void statementUpdate(String query) throws SQLException{
        Statement statement;
            statement = connection.createStatement();
            statement.executeUpdate(query);

    }
    public void creatTable(int indicator){
        try {    
            switch (indicator) {
                case 0:
                    statementUpdate("CREATE TABLE folder (" +
                    "id_folder INTEGER NOT NULL," +
                    "name_folder dm_name," +
                    "description_folder dm_description," +
                    "parent_id INTEGER REFERENCES folder(id_folder)," +
                    "PRIMARY KEY(id_folder)" +
                    ");");
                    System.out.println("Folder table created");
                    break;
                case 1:
                    statementUpdate("CREATE TABLE appList(" +
                    "id_appList INTEGER NOT NULL," +
                    "name_appList dm_name," +
                    "description_appList dm_description," +
                    "start_list DATE," +
                    "deadline_list DATE," +
                    "folder_id INTEGER REFERENCES folder(id_folder)," +
                    "PRIMARY KEY(id_appList)" +
                    ");");
                    System.out.println("AppList table created");
                    break;
                case 2:
                    statementUpdate("CREATE TABLE task (" +
                    "id_task INTEGER NOT NULL," +
                    "name_task dm_name," +
                    "list_id INTEGER REFERENCES appList(id_appList)," +
                    "checked_task BOOLEAN DEFAULT FALSE," +
                    "count_task INTEGER DEFAULT 0," +
                    "PRIMARY KEY(id_task)" +
                    ");");
                    System.out.println("Task table created");
                    break;
                default:
                    System.out.println("WrongIndicator");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void insertData(int indicator){
        switch (indicator) {
            case 0:
                
                break;
            case 1:
                
                break;
            case 2:
                
                break;
            default:
                System.out.println("WrongIndicator");
                break;
        }

    }

}
