package pe.com.carspa.dto.response;

import java.util.List;

import pe.com.carspa.dominio.Material;

public class ListarMaterialResponse extends ResponseBase{
	private List<Material> materiales;

	public List<Material> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}

}
