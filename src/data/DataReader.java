package data;

import java.sql.Statement;
import java.util.ArrayList;

import sample.Folder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataReader {
    private ResultSet createResultSet(Connection connection, String tableName) throws SQLException{
        Statement statement;
        ResultSet resultSet = null;
        String query = String.format("select * from %s", tableName);
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        return resultSet;
    }
    public ArrayList<Folder> readFolder(Connection connection){
        ArrayList<Folder> folders = new ArrayList<>();
        try{
            ResultSet resultSet = createResultSet(connection, "folder");
            while (resultSet.next()){
                String nome = resultSet.getString("name_folder");
                String description = resultSet.getString("description_folder");
                int parentId = resultSet.getInt("parent_id");
                folders.add(new Folder(nome, description, parentId));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return folders;
    }
}

