package pe.com.carspa.dto.request;

import pe.com.carspa.dominio.Maquinaria;

public class InsertarActualizarMaquinariaRequest {
	private Maquinaria maquinaria;

	public Maquinaria getMaquinaria() {
		return maquinaria;
	}

	public void setMaquinaria(Maquinaria maquinaria) {
		this.maquinaria = maquinaria;
	}

}
