package pe.com.carspa.dto.response;

import pe.com.carspa.dominio.Confirmacion;

public class ResponseBase {
	
	private Confirmacion confirmacion;
	private Integer estado;
	private String mensaje;
	private String codError;

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCodError() {
		return codError;
	}

	public void setCodError(String codError) {
		this.codError = codError;
	}

	public Confirmacion getConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(Confirmacion confirmacion) {
		this.confirmacion = confirmacion;
	}

}
