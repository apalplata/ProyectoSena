package co.com.amarie.models.service;

import co.com.amarie.models.entity.Usuario;

public interface UsuarioService {

	public Usuario save (Usuario u);
	public String login (String user, String ctr);
	
}
