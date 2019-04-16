package pe.com.carspa.dominio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Usuario {

	private Integer idUsuario;
	private String nomUsuario;
	private String apMatUsuario;
	private String apPatUsuario;
	private String tipoDocumento;
	private String nroDocumento;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getApMatUsuario() {
		return apMatUsuario;
	}

	public void setApMatUsuario(String apMatUsuario) {
		this.apMatUsuario = apMatUsuario;
	}

	public String getApPatUsuario() {
		return apPatUsuario;
	}

	public void setApPatUsuario(String apPatUsuario) {
		this.apPatUsuario = apPatUsuario;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

}