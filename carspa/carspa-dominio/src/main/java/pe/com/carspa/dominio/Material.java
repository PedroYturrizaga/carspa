package pe.com.carspa.dominio;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Material implements Serializable{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idMaterial ;
	  private Double stockMaximo ;
	  private Double precioVenta ;
	  private Double stockMinimo ;
	  private Double puntoPedido ;
	  private String fechaRegistro; 
	  private String fechaActualizacion;
	  private Integer estado;
	  private String codigo;
	  private Double stock;
	  private String nombre ;
	  private String marca ;
	  private Double precioCompra;
	  private String descripcion;
	  private Integer idProveedor ;
	  private String nombreProveedor;
	  
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
	public Double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
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
	public Integer getIdMaterial() {
		return idMaterial;
	}
	public void setIdMaterial(Integer idMaterial) {
		this.idMaterial = idMaterial;
	}
	public Double getStockMaximo() {
		return stockMaximo;
	}
	public void setStockMaximo(Double stockMaximo) {
		this.stockMaximo = stockMaximo;
	}
	public Double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Double getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(Double stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public Double getPuntoPedido() {
		return puntoPedido;
	}
	public void setPuntoPedido(Double puntoPedido) {
		this.puntoPedido = puntoPedido;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getStock() {
		return stock;
	}
	public void setStock(Double stock) {
		this.stock = stock;
	}

}
