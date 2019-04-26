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
import pe.com.tintegro.dto.request.ActualizarPasswordRequest;
import pe.com.tintegro.dto.request.ActualizarUsuarioEstandarRequest;
import pe.com.tintegro.dto.request.EliminaUsuarioEstandarRequest;
import pe.com.tintegro.dto.request.InsertarUsuarioEstandarRequest;
import pe.com.tintegro.dto.request.ListaUsuarioEstandarRequest;
import pe.com.tintegro.dto.request.ValidarLoginUsuarioRequest;
import pe.com.tintegro.dto.response.ActualizarPasswordResponse;
import pe.com.tintegro.dto.response.ActualizarUsuarioEstandarResponse;
import pe.com.tintegro.dto.response.EliminaUsuarioEstandarResponse;
import pe.com.tintegro.dto.response.InsertarUsuarioEstandarResponse;
import pe.com.tintegro.dto.response.ListaUsuarioEstandarResponse;
import pe.com.tintegro.dto.response.ValidarLoginUsuarioResponse;
import pe.com.tintegro.services.UsuarioServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/usuario")
public class UsuarioController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "usuarioServices")
	protected UsuarioServices usuarioServices;

	@RequestMapping(value = "/validarUsuarioLogin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ValidarLoginUsuarioResponse validarUsuario(@RequestBody ValidarLoginUsuarioRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		ValidarLoginUsuarioResponse response = new ValidarLoginUsuarioResponse();
		try
		{
			response = usuarioServices.validaLoginUsuarioServices(request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar la validacion del usuario");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/insertarUsuarioEstandar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarUsuarioEstandarResponse insertarUsuarioEstandar(@RequestBody InsertarUsuarioEstandarRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia)
	{
		InsertarUsuarioEstandarResponse response = new InsertarUsuarioEstandarResponse();
		request.setCodUsuario(codUsuario);
		request.setToken(token);		
		try
		{
			response = usuarioServices.insertarUsuarioEstandarServices(request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible la inserción de usuario");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/listaUsuarioEstandar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaUsuarioEstandarResponse listaUsuarioEstandar(@RequestBody ListaUsuarioEstandarRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		ListaUsuarioEstandarResponse response = new ListaUsuarioEstandarResponse();
		try
		{
			response = usuarioServices.listaUsuarioServices(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de usuario Realizada");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar la lista de usuario");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/eliminarUsuarioEstandar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminaUsuarioEstandarResponse eliminarUsuarioEstandar(@RequestBody EliminaUsuarioEstandarRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia)
	{
		EliminaUsuarioEstandarResponse response = new EliminaUsuarioEstandarResponse();

		try
		{
			response = usuarioServices.eliminaUsuarioEstandarServices(request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("Ocurrió un error al eliminar usuario");
			LOGGER.error(codError, e);
		}
		return response;
	}
	@RequestMapping(value = "/actualizarUsuarioEstandar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizarUsuarioEstandarResponse actualizarUsuarioEstandar(@RequestBody ActualizarUsuarioEstandarRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia)
	{
		ActualizarUsuarioEstandarResponse response = new ActualizarUsuarioEstandarResponse();
		request.setCodUsuario(codUsuario);
		request.setToken(token);			
		try
		{
			response = usuarioServices.actualizarUsuarioEstandarServices(request);
		
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible la actualizacion del usuario");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}
	
	@RequestMapping(value = "/actualizarPassword", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizarPasswordResponse actualizarPassword(@RequestBody ActualizarPasswordRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token)
	{
		ActualizarPasswordResponse response = new ActualizarPasswordResponse();
		request.setCodUsuario(codUsuario);
		request.setToken(token);		
		try
		{
			response = usuarioServices.actualizarPassword(request); 
		
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible la actualizacion de password");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}
}
