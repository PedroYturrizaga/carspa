package pe.com.carspa.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.com.carspa.dao.AlmacenOrdenCompraDAO;
import pe.com.carspa.mapper.AlmacenOrdenCompraMapper;
import pe.com.carspa.dominio.AlmacenOrdenCompra;
import pe.com.carspa.dominio.AlmacenOrdenCompraMaterial;
import pe.com.carspa.dto.request.ListarAlmacenOrdenCompraRequest;
import pe.com.carspa.dto.request.ListarMaterialporIDAlmacenOrdenCompraRequest;
import pe.com.carspa.dto.response.ListarAlmacenOrdenCompraResponse;
import pe.com.carspa.dto.response.ListarMaterialporIDAlmacenOrdenCompraResponse;

@Repository("almacenOrdenCompraDAO")
@Transactional
public class AlmacenOrdenCompraDAOImpl implements AlmacenOrdenCompraDAO {

	@Autowired
	private AlmacenOrdenCompraMapper almacenOrdenCompraMapper;

	@Override
	public ListarAlmacenOrdenCompraResponse listarAlmacenOrdenCompra(
			ListarAlmacenOrdenCompraRequest request) throws Exception {
		ListarAlmacenOrdenCompraResponse response = new ListarAlmacenOrdenCompraResponse();
		List<AlmacenOrdenCompra> almacenOrdenCompraList = almacenOrdenCompraMapper
				.listarAlmacenOrdenCompra(request.getIdAlmacenOrdenCompra(),
						request.getEstado(), request.getNuPagina(),
						request.getNuRegisMostrar());
		response.setAlmacenOrdenCompraList(almacenOrdenCompraList);
		return response;
	}

	@Override
	public ListarMaterialporIDAlmacenOrdenCompraResponse listarMaterialporIDAlmacenOrdenCompra(
			ListarMaterialporIDAlmacenOrdenCompraRequest request)
			throws Exception {
		ListarMaterialporIDAlmacenOrdenCompraResponse response = new ListarMaterialporIDAlmacenOrdenCompraResponse();

		List<AlmacenOrdenCompraMaterial> almacenOrdenCompraMaterialList = almacenOrdenCompraMapper
				.listarMaterialporIDAlmacenOrdenCompra(request
						.getIdAlmacenOrdenCompra());
		response.setAlmacenOrdenCompraMaterialList(almacenOrdenCompraMaterialList);
		return response;
	}
}
