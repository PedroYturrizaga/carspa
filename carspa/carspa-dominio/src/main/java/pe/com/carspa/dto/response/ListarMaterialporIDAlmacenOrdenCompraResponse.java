package pe.com.carspa.dto.response;

import java.util.List;

import pe.com.carspa.dominio.AlmacenOrdenCompraMaterial;

public class ListarMaterialporIDAlmacenOrdenCompraResponse extends ResponseBase {
	private List<AlmacenOrdenCompraMaterial> almacenOrdenCompraMaterialList;

	public List<AlmacenOrdenCompraMaterial> getAlmacenOrdenCompraMaterialList() {
		return almacenOrdenCompraMaterialList;
	}

	public void setAlmacenOrdenCompraMaterialList(
			List<AlmacenOrdenCompraMaterial> almacenOrdenCompraMaterialList) {
		this.almacenOrdenCompraMaterialList = almacenOrdenCompraMaterialList;
	}
}
