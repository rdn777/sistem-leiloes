
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB() {
        Connection conn = null;
        
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uc11", "rd", "120624rn");
            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException erro) {
            System.out.println("Erro ao conectar: " + erro.getMessage());
        }
        
        return conn;
    }
}
