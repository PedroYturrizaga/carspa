package pe.com.carspa.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import pe.com.carspa.dominio.Confirmacion;
import pe.com.carspa.dominio.Maquinaria;

public interface MaquinariaMapper {
	public Confirmacion desactivarMaquinaria(
			@Param("idMaquinaria")Integer idMaquinaria) throws Exception;

	public Confirmacion activarMaquinaria(
			@Param("idMaquinaria")Integer idMaquinaria) throws Exception;
	
	public Confirmacion insertMaquinaria(
			@Param("nombre")String nombre,
			@Param("marca")String marca,
			@Param("cantidad")Integer cantidad,
			@Param("fechaMantenimiento")String fechaMantenimiento,
			@Param("detalle")String detalle) throws Exception;
	
	public Confirmacion updateMaquinaria(
			@Param("idMaquinaria")Integer idMaquinaria,
			@Param("cantidad")Integer cantidad,
			@Param("fechaMantenimiento")String fechaMantenimiento,
			@Param("detalle")String detalle) throws Exception;
	
	public List<Maquinaria> listarMaquinaria(
			@Param("nombre")String nombre,
			@Param("estado")Integer estado,
			@Param("nuPagina")Integer nuPagina,
			@Param("nuRegisMostrar")Integer nuRegisMostrar) throws Exception;

	
}