package pe.com.carspa.dominio;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class AlmacenOrdenCompra implements Serializable {
	private static final long serialVersionUID = -3422261300798365024L;
	private Integer idAlmacenOrdenCompra;
	private Integer idAlmacen;
	private Integer idOrdenCompra;
	private String fecha;
	private String estado;
	private String descripcionAlmacen;
	private Integer nuTotalReg;
	private Integer idProveedor;
	private String nombreProveedor;
	
	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getDescripcionAlmacen() {
		return descripcionAlmacen;
	}

	public void setDescripcionAlmacen(String descripcionAlmacen) {
		this.descripcionAlmacen = descripcionAlmacen;
	}

	public Integer getNuTotalReg() {
		return nuTotalReg;
	}

	public void setNuTotalReg(Integer nuTotalReg) {
		this.nuTotalReg = nuTotalReg;
	}

	public Integer getIdAlmacenOrdenCompra() {
		return idAlmacenOrdenCompra;
	}

	public void setIdAlmacenOrdenCompra(Integer idAlmacenOrdenCompra) {
		this.idAlmacenOrdenCompra = idAlmacenOrdenCompra;
	}

	public Integer getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(Integer idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public Integer getIdOrdenCompra() {
		return idOrdenCompra;
	}

	public void setIdOrdenCompra(Integer idOrdenCompra) {
		this.idOrdenCompra = idOrdenCompra;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
