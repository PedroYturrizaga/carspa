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
import pe.com.tintegro.dto.request.ClienteActualizarRequest;
import pe.com.tintegro.dto.request.ClienteEliminarRequest;
import pe.com.tintegro.dto.request.InsertarClienteRequest;
import pe.com.tintegro.dto.request.ListaClienteAutoCompletarRequest;
import pe.com.tintegro.dto.request.ListarClienteRequest;
import pe.com.tintegro.dto.response.ClienteActualizarReponse;
import pe.com.tintegro.dto.response.ClienteEliminarResponse;
import pe.com.tintegro.dto.response.InsertarClienteResponse;
import pe.com.tintegro.dto.response.ListaClienteAutoCompletarResponse;
import pe.com.tintegro.dto.response.ListaClienteResponse;
import pe.com.tintegro.services.ClienteServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/cliente")
public class ClienteController
{

	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "clienteServices")
	protected ClienteServices clienteServices;

	@RequestMapping(value = "/listaCliente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaClienteResponse listarCliente(@RequestBody ListarClienteRequest obj, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia) throws Exception
	{
		ListaClienteResponse respuesta = new ListaClienteResponse();
		try
		{

			respuesta = clienteServices.listarcliente(codUsuario);
			respuesta.setEstado(Constantes.ESTADO_TRAMA_OK);
			respuesta.setMensaje("Listado de Clientes Realizada");
		
		}
		catch (Exception e)
		{
			respuesta.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			respuesta.setCodError(codError);
			respuesta.setMensaje("No se ha podido listar clientes");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return respuesta;

	}

	@RequestMapping(value = "/insertarCliente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarClienteResponse insertarCliente(@RequestBody InsertarClienteRequest obj, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia) throws Exception
	{
		InsertarClienteResponse response = new InsertarClienteResponse();

		try
		{

			response = clienteServices.insertarCliente(codUsuario, obj);
		
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible ingresar al cliente");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}

		return response;

	}

	@RequestMapping(value = "/actualizarCliente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ClienteActualizarReponse actualizarCliente(@RequestBody ClienteActualizarRequest obj, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia) throws Exception
	{
		ClienteActualizarReponse response = new ClienteActualizarReponse();
		try
		{
			response = clienteServices.actualizarCliente(codUsuario, obj);
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible actualizar al cliente");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;

	}

	@RequestMapping(value = "/eliminarCliente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ClienteEliminarResponse eliminarCliente(@RequestBody ClienteEliminarRequest obj, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia) throws Exception
	{
		ClienteEliminarResponse response = new ClienteEliminarResponse();

		try
		{
			response = clienteServices.eliminarCliente(codUsuario, obj);
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible eliminar el cliente");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}

		return response;
	}

	@RequestMapping(value = "/listarClienteAutoCompletar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaClienteAutoCompletarResponse listaClienteAutoCompletar(@RequestBody ListaClienteAutoCompletarRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token)
	{
		ListaClienteAutoCompletarResponse response = new ListaClienteAutoCompletarResponse();
		try
		{
			response = clienteServices.listaClienteAutoCompletar(codUsuario, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Ok");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar la lista de clientes");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

}
