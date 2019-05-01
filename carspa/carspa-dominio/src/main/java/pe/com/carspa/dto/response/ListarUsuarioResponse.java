package pe.com.carspa.dto.response;

import pe.com.carspa.dominio.Usuario;

public class ListarUsuarioResponse extends ResponseBase {

	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
