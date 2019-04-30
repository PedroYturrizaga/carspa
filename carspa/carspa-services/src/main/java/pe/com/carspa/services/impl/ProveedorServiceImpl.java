package pe.com.carspa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.carspa.dao.ProveedorDAO;
import pe.com.carspa.dto.request.ActualizarProveedorRequest;
import pe.com.carspa.dto.request.EliminarProveedorRequest;
import pe.com.carspa.dto.request.InsertarProveedorRequest;
import pe.com.carspa.dto.request.ListarProveedorRequest;
import pe.com.carspa.dto.response.ActualizarProveedorResponse;
import pe.com.carspa.dto.response.EliminarProveedorResponse;
import pe.com.carspa.dto.response.InsertarProveedorResponse;
import pe.com.carspa.dto.response.ListarProveedorResponse;
import pe.com.carspa.services.ProveedorService;

@Service( "proveedorService" )
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	ProveedorDAO proveedoDAO;
	
	@Override
	public InsertarProveedorResponse insertProveedor(InsertarProveedorRequest request) throws Exception {
		return proveedoDAO.insertProveedor(request);
	}

	@Override
	public EliminarProveedorResponse deleteProveedor(EliminarProveedorRequest request) throws Exception {
		return proveedoDAO.deleteProveedor(request);
	}

	@Override
	public ActualizarProveedorResponse updateProveedor(ActualizarProveedorRequest request) throws Exception {
		return proveedoDAO.updateProveedor(request);
	}

	@Override
	public ListarProveedorResponse listarProveedor(ListarProveedorRequest request) throws Exception {
		return proveedoDAO.listarMateriales(request);
	}

}
