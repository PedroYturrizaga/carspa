package pe.com.carspa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pe.com.carspa.dominio.Confirmacion;
import pe.com.carspa.dominio.Proveedor;

public interface ProveedorMapper {

	public Confirmacion insertProveedor(
			@Param("nombreProveedor")String nombreProveedor,
			@Param("direccion")String direccion,
			@Param("email")String email,
			@Param("telefono")String telefono,
			@Param("contacto")String contacto,
			@Param("idTipoPago")Integer idTipoPago) throws Exception;
	
	public Confirmacion updateProveedor(
			@Param("idProveedor")Integer idProveedor,
			@Param("nombreProveedor")String nombreProveedor,
			@Param("direccion")String direccion,
			@Param("email")String email,
			@Param("telefono")String telefono,
			@Param("contacto")String contacto,
			@Param("idTipoPago")Integer idTipoPago) throws Exception;
	
	public Confirmacion deleteProveedor(
			@Param("idProveedor")Integer idProveedor) throws Exception;
	
	public List<Proveedor> listarProveedor(
			@Param("nombreProveedor")String nombreProveedor,
			@Param("nuPagina")Integer nuPagina,
			@Param("nuRegisMostrar")Integer nuRegisMostrar) throws Exception;
}
