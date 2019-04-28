package pe.com.carspa.dao;

import pe.com.carspa.dto.request.ActualizarProveedorRequest;
import pe.com.carspa.dto.request.EliminarProveedorRequest;
import pe.com.carspa.dto.request.InsertarProveedorRequest;
import pe.com.carspa.dto.request.ListarProveedorRequest;
import pe.com.carspa.dto.response.ActualizarProveedorResponse;
import pe.com.carspa.dto.response.EliminarProveedorResponse;
import pe.com.carspa.dto.response.InsertarProveedorResponse;
import pe.com.carspa.dto.response.ListarProveedorResponse;

public interface ProveedorDAO {

	public InsertarProveedorResponse insertProveedor(InsertarProveedorRequest request) throws Exception;

	public EliminarProveedorResponse deleteProveedor(EliminarProveedorRequest request) throws Exception;

	public ActualizarProveedorResponse updateProveedor(ActualizarProveedorRequest request) throws Exception;

	public ListarProveedorResponse listarMateriales(ListarProveedorRequest request) throws Exception;
}
