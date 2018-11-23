package br.com.crmonline.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.crmonline.Entidades.Agenda;
import br.com.crmonline.Entidades.Usuario;

public class VisitaDAO {

	private Connection con;

	public VisitaDAO() {
		con = ConDB.getConnection();
	}

	public List<Agenda> buscaVisita() throws SQLException, ParseException {
		String sql = "SELECT * FROM AGENDA" + "	WHERE ESTADOS = 0 ";

		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Agenda> agenda = new ArrayList<>();

		while (rs.next()) {
			Agenda a = new Agenda();
			a.setCodigo(rs.getInt("ID"));
			a.setNome(rs.getString("NOME"));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			a.setData(format.parse(rs.getString("DATAV")));
			a.setHora(rs.getString("HORARIO"));
			agenda.add(a);

		}
		return agenda;

	}
	
	
	
}
