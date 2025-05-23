import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String Banco = "jdbc:postgresql://localhost:1227/postgres";
    private static final String User = "postgres";
    private static final String Senha = "27022006Gs";

    public static void main(String[] args) {
        try (Connection conexao = DriverManager.getConnection(Banco, User, Senha)) {
            System.out.println("sucesso ao conectar");
        } catch (SQLException e) {
            System.out.println("erro ao conectar no banco de dados: " + e.getMessage());
        }
        ;
    }
}