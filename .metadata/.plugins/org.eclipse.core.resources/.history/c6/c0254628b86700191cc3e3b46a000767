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
import pe.com.tintegro.dto.request.BuscarListaNegraRequest;
import pe.com.tintegro.dto.request.CambiaEstadoListaNegraRequest;
import pe.com.tintegro.dto.request.EliminarListaNegraRequest;
import pe.com.tintegro.dto.request.ActualizarListaNegraRequest;
import pe.com.tintegro.dto.request.InsertarListaNegraRequest;
import pe.com.tintegro.dto.request.ListarListaNegraRequest;
import pe.com.tintegro.dto.response.BuscarListaNegraResponse;
import pe.com.tintegro.dto.response.CambiaEstadoListaNegraResponse;
import pe.com.tintegro.dto.response.EliminarListaNegraResponse;
import pe.com.tintegro.dto.response.ActualizarListaNegraResponse;
import pe.com.tintegro.dto.response.InsertarListaNegraResponse;
import pe.com.tintegro.dto.response.ListarListaNegraResponse;
import pe.com.tintegro.services.ListaNegraServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/listaNegra")
public class ListaNegraController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "listaNegraServices")
	protected ListaNegraServices listaNegraServices;

	@RequestMapping(value = "/insertarListaNegra", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarListaNegraResponse insertarListaNegra(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody InsertarListaNegraRequest request)
	{
		InsertarListaNegraResponse response = new InsertarListaNegraResponse();
		try
		{
			response = listaNegraServices.insertarListaServices(codUsuario, idInstancia, request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible ingresar a la lista Negra");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/actualizarListaNegra", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizarListaNegraResponse actualizarListaNegra(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ActualizarListaNegraRequest request)
	{
		ActualizarListaNegraResponse response = new ActualizarListaNegraResponse();
		try
		{
			response = listaNegraServices.actualizarListaServices(codUsuario, idInstancia, request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible actualizar datos de la lista Negra");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}

	@RequestMapping(value = "/eliminarListaNegra", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminarListaNegraResponse actualizarEstadoListaNegra(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody EliminarListaNegraRequest request)
	{
		EliminarListaNegraResponse response = new EliminarListaNegraResponse();

		try
		{
			response = listaNegraServices.eliminarListaNegraServices(codUsuario, idInstancia, request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible actualizar estado de la lista Negra");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/listarListaNegra", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarListaNegraResponse listarListaNegra(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListarListaNegraRequest request)
	{
		ListarListaNegraResponse response = new ListarListaNegraResponse();
		try
		{
			response = listaNegraServices.listarListaNegraServices(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Lista Negra Realizada");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible actualizar estado de la lista Negra");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}

	@RequestMapping(value = "/cambiaEstadoListaNegra", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public CambiaEstadoListaNegraResponse cambiaEstadoListaNegra(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody CambiaEstadoListaNegraRequest request)
	{
		CambiaEstadoListaNegraResponse response = new CambiaEstadoListaNegraResponse();
		try
		{
			response = listaNegraServices.cambiaEstadoListaNegra(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje(response.getMensaje());
			response.setResultado(response.getResultado());
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible actualizar estado de la lista Negra");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}

	@RequestMapping(value = "/buscarListaNegra", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public BuscarListaNegraResponse buscarListaNegra(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody BuscarListaNegraRequest request)
	{
		BuscarListaNegraResponse response = new BuscarListaNegraResponse();
		try
		{
			response = listaNegraServices.buscarListaNegraServices(codUsuario, idInstancia, request);
			response.setMensaje(response.getMensaje());
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setLsListaNegra(response.getLsListaNegra());
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible encontrar el elemento en la lista Negra");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}
}
