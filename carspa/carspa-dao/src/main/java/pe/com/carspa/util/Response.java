package pe.com.carspa.util;

import java.util.List;

public class Response<T> {
	private int codigo;
	private String mensaje;
	private List<T> data;
	private Exception exception;

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public Response() {
	}

	public Response(int codigo, String mensaje, List<T> data) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
