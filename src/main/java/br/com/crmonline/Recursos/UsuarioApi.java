package br.com.crmonline.Recursos;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.crmonline.DAO.UsuarioDAO;
import br.com.crmonline.Entidades.Usuario;

@Path("/ws/logon")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class UsuarioApi {

	UsuarioDAO userDAO;

	public UsuarioApi() {
		userDAO = new UsuarioDAO();
	}

	@GET
	@Path("/busca/{id}")
	public Usuario buscaUsuario(@PathParam("id") String id) {
		Usuario u = null;
		try {
			u = new Usuario();
			u.setNif(id);
			return userDAO.buscaUsuario(u.getNif());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
