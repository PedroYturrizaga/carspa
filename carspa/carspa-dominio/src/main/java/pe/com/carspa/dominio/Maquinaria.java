package pe.com.carspa.dominio;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Maquinaria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idMaquinaria;
	private String nombre ;
	private String marca ;
	private Integer cantidad ;
	private String  fechaRegistro;
	private String fechaMantenimiento;
	private String detalle ;
	private Integer estado;
	  public Integer getIdMaquinaria() {
		return idMaquinaria;
	}
	public void setIdMaquinaria(Integer idMaquinaria) {
		this.idMaquinaria = idMaquinaria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getFechaMantenimiento() {
		return fechaMantenimiento;
	}
	public void setFechaMantenimiento(String fechaMantenimiento) {
		this.fechaMantenimiento = fechaMantenimiento;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
