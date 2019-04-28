package pe.com.carspa.dto.response;

import pe.com.carspa.dominio.Confirmacion;

public class InsertarActualizarMaterialResponse  extends ResponseBase{

	private Confirmacion confirmacion;

	public Confirmacion getConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(Confirmacion confirmacion) {
		this.confirmacion = confirmacion;
	}
}
