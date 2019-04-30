package pe.com.carspa.dto.response;

import java.util.List;

import pe.com.carspa.dominio.Proveedor;

public class ListarProveedorResponse {

	private List<Proveedor> proveedor;

	public List<Proveedor> getProveedor() {
		return proveedor;
	}

	public void setProveedor(List<Proveedor> proveedor) {
		this.proveedor = proveedor;
	}

}
