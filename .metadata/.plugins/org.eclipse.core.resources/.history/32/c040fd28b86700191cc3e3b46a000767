package pe.com.tintegro.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.com.tintegro.dao.util.Constantes;
import pe.com.tintegro.dto.request.EliminarFaxRequest;
import pe.com.tintegro.dto.request.InsertarFaxRequest;
import pe.com.tintegro.dto.request.ListarFaxRequest;
import pe.com.tintegro.dto.response.EliminarFaxResponse;
import pe.com.tintegro.dto.response.InsertarFaxResponse;
import pe.com.tintegro.dto.response.ListarFaxResponse;
import pe.com.tintegro.services.FaxServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/fax")
public class FaxController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "faxServices")
	protected FaxServices faxServices;

	@RequestMapping(value = "/insertar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarFaxResponse insertarFax(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody InsertarFaxRequest request)
	{

		InsertarFaxResponse response = new InsertarFaxResponse();
		try
		{
			response = faxServices.insertarFax(codUsuario, idInstancia, request);
			response.setInsertado(response.getInsertado());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido insertar Fax");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/listar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarFaxResponse listarFax(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListarFaxRequest request)
	{

		ListarFaxResponse response = new ListarFaxResponse();
		try
		{
			response = faxServices.listarFax(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Fax Exitosa");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido listar");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/eliminar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminarFaxResponse eliminarFax(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody EliminarFaxRequest request)
	{

		EliminarFaxResponse response = new EliminarFaxResponse();
		try
		{
			response = faxServices.eliminarFax(codUsuario, idInstancia, request);
			response.setEliminado(response.getEliminado());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido eliminar Fax");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}
}
