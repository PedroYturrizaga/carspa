package pe.com.carspa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pe.com.carspa.dominio.AlmacenOrdenCompra;
import pe.com.carspa.dominio.AlmacenOrdenCompraMaterial;

public interface AlmacenOrdenCompraMapper {

	public List<AlmacenOrdenCompra> listarAlmacenOrdenCompra(
			@Param("idAlmacenOrdenCompra") Integer idAlmacenOrdenCompra,
			@Param("estado") String estado,
			@Param("nuPagina") Integer nuPagina,
			@Param("nuRegisMostrar") Integer nuRegisMostrar) throws Exception;

	public List<AlmacenOrdenCompraMaterial> listarMaterialporIDAlmacenOrdenCompra(
			@Param("idAlmacenOrdenCompra") Integer idAlmacenOrdenCompra)
			throws Exception;
}
