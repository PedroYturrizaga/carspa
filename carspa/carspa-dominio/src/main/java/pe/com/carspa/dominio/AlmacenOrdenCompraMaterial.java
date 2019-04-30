package pe.com.carspa.dominio;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class AlmacenOrdenCompraMaterial implements Serializable {

	private Integer idAlmacenOrdenCompraMaterial;
	private Integer idAlmacenOrdenCompra;
	private Integer idMaterial;
	private Double cantidad;
	private Double cantidadFisica;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdAlmacenOrdenCompraMaterial() {
		return idAlmacenOrdenCompraMaterial;
	}
	public void setIdAlmacenOrdenCompraMaterial(Integer idAlmacenOrdenCompraMaterial) {
		this.idAlmacenOrdenCompraMaterial = idAlmacenOrdenCompraMaterial;
	}
	public Integer getIdAlmacenOrdenCompra() {
		return idAlmacenOrdenCompra;
	}
	public void setIdAlmacenOrdenCompra(Integer idAlmacenOrdenCompra) {
		this.idAlmacenOrdenCompra = idAlmacenOrdenCompra;
	}
	public Integer getIdMaterial() {
		return idMaterial;
	}
	public void setIdMaterial(Integer idMaterial) {
		this.idMaterial = idMaterial;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public Double getCantidadFisica() {
		return cantidadFisica;
	}
	public void setCantidadFisica(Double cantidadFisica) {
		this.cantidadFisica = cantidadFisica;
	}
}
