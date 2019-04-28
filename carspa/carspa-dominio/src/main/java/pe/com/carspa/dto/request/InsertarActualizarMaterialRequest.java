package pe.com.carspa.dto.request;

import pe.com.carspa.dominio.Material;

public class InsertarActualizarMaterialRequest {
	private Material material;

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

}
