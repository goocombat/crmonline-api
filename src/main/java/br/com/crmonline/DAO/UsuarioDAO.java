
package br.com.crmonline.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.crmonline.Entidades.Usuario;

public class UsuarioDAO {

	private Connection con;

	public UsuarioDAO() {
		con = ConDB.getConnection();
	}

	public Usuario buscaUsuario(String nif) throws SQLException {
		String sql = "SELECT * FROM USUARIO AS U WHERE U.NIF LIKE ? ";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, nif);
		ResultSet rs = ps.executeQuery();
		Usuario user = null;
		if (rs.next()) {
			user = new Usuario(rs.getInt("ID"), rs.getString("NIF"), rs.getString("NOME"), rs.getString("EMAIL"),
					rs.getString("SEXO"), rs.getString("SENHA"), rs.getInt("STATU"), rs.getInt("TIPO_USUARIO"));

		}
		return user;
	}

}
