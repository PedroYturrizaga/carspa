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

import pe.com.carspa.dto.request.EliminarMaquinariaRequest;
import pe.com.carspa.dto.request.InsertarActualizarMaquinariaRequest;
import pe.com.carspa.dto.request.ListarMaquinariaRequest;
import pe.com.carspa.dto.response.ListarMaquinariaResponse;
import pe.com.carspa.dto.response.ResponseBase;
import pe.com.carspa.services.MaquinariaService;
import pe.com.carspa.util.Constantes;

@RestController
@RequestMapping("/maquinaria")
public class MaquinariaController {

	 private final Logger LOG = Logger.getLogger(AlmacenOrdenCompraController.class);

	@Autowired
	private HttpServletRequest servletRequest;

	@Resource(name = "maquinariaService")
	private MaquinariaService maquinariaService;

	@RequestMapping(value = "/listarMaquinarias", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarMaquinariaResponse listarMaquinaria(
			String nombre,
			Integer estado,
			Integer nuPagina,
			Integer nuRegisMostrar) {
		ListarMaquinariaResponse response = new ListarMaquinariaResponse();
		ListarMaquinariaRequest request = new ListarMaquinariaRequest();
		
		request.setNombre(nombre);
		request.setEstado(estado);
		request.setNuPagina(nuPagina);
		request.setNuRegisMostrar(nuRegisMostrar);
		
		try {
			response = maquinariaService.listarMaquinaria(request);
			response.setEstado(1);
		} catch (Exception e) {
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP;
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar las maquinarias");
			System.out.println(e.getMessage());
			LOG.error(codError, e);
		}
		return response;
	}
	@RequestMapping(value = "/eliminarMaquinaria", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseBase desactivarMaquinaria(
			 Integer idMaquinaria) {
		ResponseBase response = new ResponseBase();
		EliminarMaquinariaRequest request = new EliminarMaquinariaRequest();
		request.setIdMaquinaria(idMaquinaria);
		
		try {
			response = maquinariaService.desactivarMaquinaria(request);
			response.setEstado(1);
		} catch (Exception e) {
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP;
			response.setCodError(codError);
			response.setMensaje("Error");
			System.out.println(e.getMessage());
			LOG.error(codError, e);
		}
		return response;
	}
	@RequestMapping(value = "/activarMaquinaria", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseBase activarMaquinaria(
			 Integer idMaquinaria) {
		ResponseBase response = new ResponseBase();
		EliminarMaquinariaRequest request = new EliminarMaquinariaRequest();
		request.setIdMaquinaria(idMaquinaria);
		
		try {
			response = maquinariaService.activarMaquinaria(request);
			response.setEstado(1);
		} catch (Exception e) {
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP;
			response.setCodError(codError);
			response.setMensaje("Error");
			System.out.println(e.getMessage());
			LOG.error(codError, e);
		}
		return response;
	}
	@RequestMapping(value = "/actualizarMaquinaria", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseBase updateMaquinaria(
			InsertarActualizarMaquinariaRequest request) {
		ResponseBase response = new ResponseBase();
	
		try {
			response = maquinariaService.updateMaquinaria(request);
			response.setEstado(1);
		} catch (Exception e) {
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP;
			response.setCodError(codError);
			response.setMensaje("Error");
			System.out.println(e.getMessage());
			LOG.error(codError, e);
		}
		return response;
	}
	@RequestMapping(value = "/insertarMaquinaria", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseBase insertMaterial(
			InsertarActualizarMaquinariaRequest request) {
		ResponseBase response = new ResponseBase();
	
		try {
			response = maquinariaService.insertMaquinaria(request);
			response.setEstado(1);
		} catch (Exception e) {
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP;
			response.setCodError(codError);
			response.setMensaje("Error");
			System.out.println(e.getMessage());
			LOG.error(codError, e);
		}
		return response;
	}
}
