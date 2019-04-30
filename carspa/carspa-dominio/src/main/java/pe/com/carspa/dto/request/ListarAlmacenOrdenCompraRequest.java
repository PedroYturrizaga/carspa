package pe.com.carspa.dto.request;

public class ListarAlmacenOrdenCompraRequest {

	private Integer idAlmacenOrdenCompra;
	private String estado;
	private Integer nuPagina;
	private Integer nuRegisMostrar;
	public Integer getIdAlmacenOrdenCompra() {
		return idAlmacenOrdenCompra;
	}
	public void setIdAlmacenOrdenCompra(Integer idAlmacenOrdenCompra) {
		this.idAlmacenOrdenCompra = idAlmacenOrdenCompra;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
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
}
