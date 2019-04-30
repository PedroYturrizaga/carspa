package pe.com.carspa.services;

import pe.com.carspa.dto.request.ListarAlmacenOrdenCompraRequest;
import pe.com.carspa.dto.request.ListarMaterialporIDAlmacenOrdenCompraRequest;
import pe.com.carspa.dto.response.ListarAlmacenOrdenCompraResponse;
import pe.com.carspa.dto.response.ListarMaterialporIDAlmacenOrdenCompraResponse;

public interface AlmacenOrdenCompraService {

	ListarAlmacenOrdenCompraResponse listarAlmacenOrdenCompra(
			ListarAlmacenOrdenCompraRequest request) throws Exception;

	ListarMaterialporIDAlmacenOrdenCompraResponse listarMaterialporIDAlmacenOrdenCompra(
			ListarMaterialporIDAlmacenOrdenCompraRequest request)
			throws Exception;

}
