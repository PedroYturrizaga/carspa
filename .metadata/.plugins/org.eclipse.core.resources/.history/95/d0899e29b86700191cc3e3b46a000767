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
import pe.com.tintegro.dto.request.ActualizarQueuesRequest;
import pe.com.tintegro.dto.request.BuscarQueuesRequest;
import pe.com.tintegro.dto.request.EliminarQueuesRequest;
import pe.com.tintegro.dto.request.InsertarQueuesRequest;
import pe.com.tintegro.dto.request.ListarAgenteDisponiblesRequest;
import pe.com.tintegro.dto.request.ListarQueuesRequest;
import pe.com.tintegro.dto.response.ActualizarQueuesResponse;
import pe.com.tintegro.dto.response.BuscarQueuesResponse;
import pe.com.tintegro.dto.response.EliminarQueuesResponse;
import pe.com.tintegro.dto.response.InsertarQueuesResponse;
import pe.com.tintegro.dto.response.ListarAgenteDisponiblesResponse;
import pe.com.tintegro.dto.response.ListarQueuesResponse;
import pe.com.tintegro.services.QueuesServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/queues")
public class QueuesController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "queuesServices")
	protected QueuesServices queuesServices;

	@RequestMapping(value = "/listar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarQueuesResponse listarCola(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListarQueuesRequest request)
	{

		ListarQueuesResponse response = new ListarQueuesResponse();
		try
		{
			response = queuesServices.listarQueues(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consultar Queues Realizada");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido Consultar Queues");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/insertar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarQueuesResponse insertarCola(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody InsertarQueuesRequest request)
	{

		InsertarQueuesResponse response = new InsertarQueuesResponse();
		try
		{
			response = queuesServices.insertarQueues(codUsuario, idInstancia, request);
			response.setInsertado(response.getInsertado());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido agregar Cola");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/actualizar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizarQueuesResponse actualizarCola(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ActualizarQueuesRequest request)
	{

		ActualizarQueuesResponse response = new ActualizarQueuesResponse();
		try
		{
			response = queuesServices.actualizarQueues(codUsuario, idInstancia, request);
			response.setActualizado(response.getActualizado());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido actualizar Cola");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/eliminar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminarQueuesResponse eliminarCola(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody EliminarQueuesRequest request)
	{

		EliminarQueuesResponse response = new EliminarQueuesResponse();
		try
		{
			response = queuesServices.eliminarQueues(codUsuario, idInstancia, request);
			response.setEliminado(response.getEliminado());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido eliminar Cola");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/buscar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public BuscarQueuesResponse buscarCola(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody BuscarQueuesRequest request)
	{

		BuscarQueuesResponse response = new BuscarQueuesResponse();
		try
		{
			response = queuesServices.buscarQueues(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta Cola Realizada");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido Consultar Cola");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/listarAgentes", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarAgenteDisponiblesResponse listarAgenteDisponibles(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia, @RequestBody ListarAgenteDisponiblesRequest request)
	{

		ListarAgenteDisponiblesResponse response = new ListarAgenteDisponiblesResponse();
		try
		{
			response = queuesServices.listarAgenteDisponible(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Lista agentes realizada");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido listar agentes");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}
}
