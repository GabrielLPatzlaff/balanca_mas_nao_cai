package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL =
        "jdbc:mysql://192.168.20.5:3306/balanca_mas_nao_cai"
        + "?serverTimezone=America/Sao_Paulo&connectTimeout=10000";

    private static final String USUARIO = "root";
    private static final String SENHA =
        System.getProperty("db.password", System.getenv("DB_PASSWORD"));

    public static Connection conectar() throws SQLException {
        if (SENHA == null) {
            throw new SQLException(
                "Configure a senha em -Ddb.password ou na variavel DB_PASSWORD.");
        }
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public static void main(String[] args) {
        try (Connection conexao = conectar()) {
            if (conexao.isValid(5)) {
                System.out.println("Conexao realizada com sucesso!");
            } else {
                System.err.println("A conexao nao esta valida.");
            }
        } catch (SQLException erro) {
            System.err.println("Erro ao conectar ao banco: " + erro.getMessage());
        }
    }
}
