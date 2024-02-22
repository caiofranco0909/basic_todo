package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB{
    private static final String URL = "jdbc:postgresql://localhost:5432/todo_data";
    private static final String USUARIO = "to_do";
    private static final String SENHA = "to_do";
    public static Connection concectBD(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão estabelecida.");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e){
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }
    public static void unconnectBD(Connection connection){
        if (connection != null){
            try {
                connection.close();
                System.out.println("Connection closed successfully");
            } catch (SQLException e) {
                System.out.println("Connection close fail");
                e.printStackTrace();
            }
        }
    }
    
}
