package pe.com.carspa.dominio;

import java.io.Serializable;

public class Confirmacion implements Serializable{
	@Override
	public String toString()
	{
		return "\nConfirmacion [id=" + id + ", mensaje=" + mensaje + "]";
	}

	private static final long serialVersionUID = 1L;

	private int id;
	private String mensaje;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getMensaje()
	{
		return mensaje;
	}

	public void setMensaje(String mensaje)
	{
		this.mensaje = mensaje;
	}
}
