package pe.com.carspa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.carspa.dao.AlmacenOrdenCompraDAO;
import pe.com.carspa.dto.request.ListarAlmacenOrdenCompraRequest;
import pe.com.carspa.dto.request.ListarMaterialporIDAlmacenOrdenCompraRequest;
import pe.com.carspa.dto.response.ListarAlmacenOrdenCompraResponse;
import pe.com.carspa.dto.response.ListarMaterialporIDAlmacenOrdenCompraResponse;
import pe.com.carspa.services.AlmacenOrdenCompraService;

@Service("almacenOrdenCompraService")
public class AlmacenOrdenCompraServiceImpl implements AlmacenOrdenCompraService {

	@Autowired
	private AlmacenOrdenCompraDAO almacenOrdenCompraDAO;

	@Override
	public ListarAlmacenOrdenCompraResponse listarAlmacenOrdenCompra(
			ListarAlmacenOrdenCompraRequest request) throws Exception {
		return almacenOrdenCompraDAO.listarAlmacenOrdenCompra(request);
	}

	@Override
	public ListarMaterialporIDAlmacenOrdenCompraResponse listarMaterialporIDAlmacenOrdenCompra(
			ListarMaterialporIDAlmacenOrdenCompraRequest request)
			throws Exception {
		return almacenOrdenCompraDAO
				.listarMaterialporIDAlmacenOrdenCompra(request);
	}
}
