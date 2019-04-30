package pe.com.carspa.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.com.carspa.dao.MaterialDAO;
import pe.com.carspa.dominio.Confirmacion;
import pe.com.carspa.dominio.Proveedor;
import pe.com.carspa.dto.request.EliminarMaterialRequest;
import pe.com.carspa.dto.request.InsertarActualizarMaterialRequest;
import pe.com.carspa.dto.request.ListarMaterialRequest;
import pe.com.carspa.dto.request.ListarProveedorRequest;
import pe.com.carspa.dto.response.ListarMaterialResponse;
import pe.com.carspa.dto.response.ListarProveedorResponse;
import pe.com.carspa.dto.response.ResponseBase;
import pe.com.carspa.mapper.MaterialMapper;
import pe.com.carspa.dominio.Material;


@Repository( "materialDAO" )
@Transactional
public class MaterialDAOImpl implements MaterialDAO{

	@Autowired
	MaterialMapper materialMapper;
	
	@Override
	public ResponseBase activarMaterial(EliminarMaterialRequest request)
			throws Exception {
		ResponseBase response = new ResponseBase();
		Confirmacion confirmacion = materialMapper.activarMaterial(request.getIdMaterial());
		response.setConfirmacion(confirmacion);
		return response;
	}

	@Override
	public ResponseBase desactivarMaterial(EliminarMaterialRequest request)
			throws Exception {
		ResponseBase response = new ResponseBase();
		Confirmacion confirmacion = materialMapper.desactivarMaterial(request.getIdMaterial());
		response.setConfirmacion(confirmacion);
		return response;
	}

	@Override
	public ResponseBase insertMaterial(InsertarActualizarMaterialRequest request)
			throws Exception {
		ResponseBase response = new ResponseBase();
		Confirmacion confirmacion = materialMapper.insertMaterial(request.getMaterial().getCodigo(), request.getMaterial().getStockMaximo(), request.getMaterial().getStockMinimo(), request.getMaterial().getPuntoPedido(), 
				request.getMaterial().getPrecioVenta(), request.getMaterial().getNombre(), request.getMaterial().getMarca(), request.getMaterial().getStock(), request.getMaterial().getPrecioCompra(), request.getMaterial().getDescripcion(), request.getMaterial().getIdProveedor());
		response.setConfirmacion(confirmacion);
		return response;
	}

	@Override
	public ResponseBase updateMaterial(InsertarActualizarMaterialRequest request)
			throws Exception {
		ResponseBase response = new ResponseBase();
		Confirmacion confirmacion = materialMapper.updateMaterial(request.getMaterial().getIdMaterial(), request.getMaterial().getStockMaximo(), request.getMaterial().getStockMinimo(), request.getMaterial().getPuntoPedido(), 
				request.getMaterial().getPrecioVenta(), request.getMaterial().getNombre(), request.getMaterial().getMarca(), request.getMaterial().getStock(), request.getMaterial().getPrecioCompra(), request.getMaterial().getDescripcion(), request.getMaterial().getIdProveedor());
		response.setConfirmacion(confirmacion);
		return response;
	}

	@Override
	public ListarMaterialResponse listarMateriales(ListarMaterialRequest request)
			throws Exception {
		ListarMaterialResponse response = new ListarMaterialResponse();
		List<Material>listaMateriales=materialMapper.listarMateriales(request.getNombre(), request.getEstado(), request.getNuPagina(), request.getNuRegisMostrar());
		response.setMateriales(listaMateriales);
		return response;
	}

	@Override
	public ListarProveedorResponse comboProveedor(ListarProveedorRequest request)
			throws Exception {
		ListarProveedorResponse response = new ListarProveedorResponse();
		List<Proveedor> proveedores=materialMapper.comboProveedor();
		response.setProveedor(proveedores);
		return response;
	}

}
