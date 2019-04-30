package pe.com.carspa.dto.response;

import java.util.List;

import pe.com.carspa.dominio.AlmacenOrdenCompra;

public class ListarAlmacenOrdenCompraResponse {

	private List<AlmacenOrdenCompra> almacenOrdenCompraList;

	public List<AlmacenOrdenCompra> getAlmacenOrdenCompraList() {
		return almacenOrdenCompraList;
	}

	public void setAlmacenOrdenCompraList(
			List<AlmacenOrdenCompra> almacenOrdenCompraList) {
		this.almacenOrdenCompraList = almacenOrdenCompraList;
	}
}