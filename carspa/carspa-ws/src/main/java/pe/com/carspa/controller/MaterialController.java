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

import pe.com.carspa.dto.request.EliminarMaterialRequest;
import pe.com.carspa.dto.request.InsertarActualizarMaterialRequest;
import pe.com.carspa.dto.request.ListarMaterialRequest;
import pe.com.carspa.dto.request.ListarProveedorRequest;
import pe.com.carspa.dto.response.ListarMaterialResponse;
import pe.com.carspa.dto.response.ListarProveedorResponse;
import pe.com.carspa.dto.response.ResponseBase;

import pe.com.carspa.services.MaterialService;
import pe.com.carspa.util.Constantes;

@RestController
@RequestMapping("/material")
public class MaterialController {

	 private final Logger LOG = Logger.getLogger(AlmacenOrdenCompraController.class);

	@Autowired
	private HttpServletRequest servletRequest;

	@Resource(name = "materialService")
	private MaterialService materialService;

	@RequestMapping(value = "/listarMateriales", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarMaterialResponse listarMateriales(
			String nombre,
			Integer estado,
			Integer nuPagina,
			Integer nuRegisMostrar) {
		ListarMaterialResponse response = new ListarMaterialResponse();
		ListarMaterialRequest request = new ListarMaterialRequest();
		
		request.setNombre(nombre);
		request.setEstado(estado);
		request.setNuPagina(nuPagina);
		request.setNuRegisMostrar(nuRegisMostrar);
		
		try {
			response = materialService.listarMateriales(request);
			response.setEstado(1);
		} catch (Exception e) {
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP;
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar los materiales");
			System.out.println(e.getMessage());
			LOG.error(codError, e);
		}
		return response;
	}
	@RequestMapping(value = "/listarProveedores", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarProveedorResponse comboProveedor() {
		ListarProveedorResponse response = new ListarProveedorResponse();
		ListarProveedorRequest request = new ListarProveedorRequest();
		
		try {
			response = materialService.comboProveedor(request);
			response.setEstado(1);
		} catch (Exception e) {
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP;
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar los proveedores");
			System.out.println(e.getMessage());
			LOG.error(codError, e);
		}
		return response;
	}
	@RequestMapping(value = "/eliminarMaterial", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseBase desactivarMaterial(
			 Integer idMaterial) {
		ResponseBase response = new ResponseBase();
		EliminarMaterialRequest request = new EliminarMaterialRequest();
		request.setIdMaterial(idMaterial);
		
		try {
			response = materialService.desactivarMaterial(request);
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
	@RequestMapping(value = "/activarMaterial", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseBase activarMaterial(
			 Integer idMaterial) {
		ResponseBase response = new ResponseBase();
		EliminarMaterialRequest request = new EliminarMaterialRequest();
		request.setIdMaterial(idMaterial);
		
		try {
			response = materialService.activarMaterial(request);
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
	@RequestMapping(value = "/actualizarMaterial", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseBase updateMaterial(
			InsertarActualizarMaterialRequest request) {
		ResponseBase response = new ResponseBase();
	
		try {
			response = materialService.updateMaterial(request);
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
	@RequestMapping(value = "/insertarMaterial", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseBase insertMaterial(
			InsertarActualizarMaterialRequest request) {
		ResponseBase response = new ResponseBase();
	
		try {
			response = materialService.insertMaterial(request);
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
