package pe.com.carspa.dto.request;

public class ListarProveedorRequest {

	private String nombreProveedor;
	private Integer nuPagina;
	private Integer nuRegisMostrar;

	public Integer getNuPagina() {
		return nuPagina;
	}

	public void setNuPagina(Integer nuPagina) {
		this.nuPagina = nuPagina;
	}

	public Integer getNuRegisMostrar() {
		return nuRegisMostrar;
	}

	public void setNuRegisMostrar(Integer nuRegisMostrar) {
		this.nuRegisMostrar = nuRegisMostrar;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

}
