package vision;

import java.sql.Connection;

import data.Conexao;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Connection connection = Conexao.concectBD();
        Conexao.unconnectBD(connection);
    }
}
