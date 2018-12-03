package br.com.crmonline.Recursos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.crmonline.DAO.VisitaDAO;
import br.com.crmonline.Entidades.Agenda;
import br.com.crmonline.Entidades.RespostaGenerica;
import br.com.crmonline.Entidades.VisitaRealizada;

@Path("/ws/visita")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VisitaApi {

	VisitaDAO visitaDAO;
	private Connection con;

	public VisitaApi() {

		visitaDAO = new VisitaDAO();
	}

	@GET
	@Path("/agendadas")
	public List<Agenda> buscaVisita() {
		try {
			return visitaDAO.buscaVisita();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@POST
	@Path("/realizar")
	public RespostaGenerica realizaVisita(VisitaRealizada v) throws SQLException {
		RespostaGenerica r = new RespostaGenerica();
		if (visitaDAO.realizarVisita(v)) {
			r.setResposta(true);
			r.setRespostaTexto("Visita realizada com sucesso");
			return r;
		} else {
			r.setResposta(false);
			r.setRespostaTexto("Visita não realizada");
			return r;

		}
	}

}