package br.com.crmonline.Config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import br.com.crmonline.Recursos.UsuarioApi;

public class Config extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> batata = new HashSet<>();
		batata.add(UsuarioApi.class);
		return batata;
	}

}
