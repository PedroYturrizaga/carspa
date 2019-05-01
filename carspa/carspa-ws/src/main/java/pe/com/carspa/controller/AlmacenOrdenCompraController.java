package pe.com.carspa.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.com.carspa.dto.request.ListarAlmacenOrdenCompraRequest;
import pe.com.carspa.dto.response.ListarAlmacenOrdenCompraResponse;
//import pe.com.carspa.dto.response.ListarAlmacenOrdenCompraResponse;
//import pe.com.carspa.dto.request.ListarAlmacenOrdenCompraRequest;
import pe.com.carspa.services.AlmacenOrdenCompraService;
import pe.com.carspa.util.Constantes;

@RestController
@RequestMapping("/almacenOrdenCompra")
public class AlmacenOrdenCompraController {

	 private final Logger LOG = Logger.getLogger(AlmacenOrdenCompraController.class);

	@Autowired
	private HttpServletRequest servletRequest;

	@Resource(name = "almacenOrdenCompraService")
	private AlmacenOrdenCompraService almacenOrdenCompraService;

	@RequestMapping(value = "/listarAlmacenOrdenCompra", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarAlmacenOrdenCompraResponse listarAlmacenOrdenCompra(
			Integer idAlmacenOrdenCompra,
			String estado,
			Integer nuPagina,
			Integer nuRegisMostrar) {
		ListarAlmacenOrdenCompraResponse response = new ListarAlmacenOrdenCompraResponse();
		ListarAlmacenOrdenCompraRequest request = new ListarAlmacenOrdenCompraRequest();
		
		request.setIdAlmacenOrdenCompra(idAlmacenOrdenCompra);
		request.setEstado(estado);
		request.setNuPagina(nuPagina);
		request.setNuRegisMostrar(nuRegisMostrar);
		
		try {
			response = almacenOrdenCompraService.listarAlmacenOrdenCompra(request);
		} catch (Exception e) {
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP;
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar almacen orden compra");
			System.out.println(e.getMessage());
			LOG.error(codError, e);
		}
		return response;
	}
}
