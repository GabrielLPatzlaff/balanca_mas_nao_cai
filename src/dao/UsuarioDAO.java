package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
  public boolean autenticar(String email, String senha) throws SQLException {
    String sql = "SELECT idUsuario FROM usuarios WHERE Email = ? AND BINARY Senha = ?";
    try (Connection con = Conexao.conectar();
         PreparedStatement stmt = con.prepareStatement(sql)) {
      stmt.setString(1, email);
      stmt.setString(2, senha);
      try (ResultSet rs = stmt.executeQuery()) {
        return rs.next();
      }
    }
  }
}
