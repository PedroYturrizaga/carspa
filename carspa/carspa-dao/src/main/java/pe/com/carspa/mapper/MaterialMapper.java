package pe.com.carspa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pe.com.carspa.dominio.Confirmacion;
import pe.com.carspa.dominio.Material;


public interface MaterialMapper {
	public Confirmacion activarMaterial(
			@Param("idMaterial")Integer idMaterial) throws Exception;
	public Confirmacion desactivarMaterial(
			@Param("idMaterial")Integer idMaterial) throws Exception;
	public List<Material> listarMateriales(
			@Param("nombre")String nombre,
			@Param("estado")Integer estado,
			@Param("nuPagina")Integer nuPagina,
			@Param("nuRegisMostrar")Integer nuRegisMostrar) throws Exception;
	public Confirmacion insertMaterial(
			@Param("codigo")String codigo,
			@Param("stockMaximo")Double stockMaximo,
			@Param("stockMinimo")Double stockMinimo,
			@Param("puntoPedido")Double puntoPedido,
			@Param("precioVenta")Double precioVenta,
			@Param("nombre")String nombre,
			@Param("marca")String marca,
			@Param("stock")Double stock,
			@Param("precioCompra")Double precioCompra,
			@Param("descripcion")String descripcion,
			@Param("idProveedor")Integer idProveedor) throws Exception;
	
	public Confirmacion updateMaterial(
			@Param("idMaterial")Integer idMaterial,
			@Param("stockMaximo")Double stockMaximo,
			@Param("stockMinimo")Double stockMinimo,
			@Param("puntoPedido")Double puntoPedido,
			@Param("precioVenta")Double precioVenta,
			@Param("nombre")String nombre,
			@Param("marca")String marca,
			@Param("stock")Double stock,
			@Param("precioCompra")Double precioCompra,
			@Param("descripcion")String descripcion,
			@Param("idProveedor")Integer idProveedor) throws Exception;

}
