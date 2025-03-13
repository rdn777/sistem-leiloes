import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    public Connection connectDB() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/uc11?useSSL=false"; // Adicionando ?useSSL=false
            String user = "rd"; // Altere para seu usuário MySQL
            String password = "120624rn"; // Se sua senha não for vazia, coloque aqui
            
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
        }
        return conn;
    }
}
