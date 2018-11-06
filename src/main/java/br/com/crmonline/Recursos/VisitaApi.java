package br.com.crmonline.Recursos;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.crmonline.DAO.VisitaDAO;
import br.com.crmonline.Entidades.Agenda;

@Path("/ws/visita")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VisitaApi {

	VisitaDAO visitaDAO;

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

}
