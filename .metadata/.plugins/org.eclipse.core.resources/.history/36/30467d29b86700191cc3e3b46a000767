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
import pe.com.tintegro.dto.request.ActualizarUsuarioRequest;
import pe.com.tintegro.dto.request.BuscarTbUsuarioRequest;
import pe.com.tintegro.dto.request.EliminarUsuarioRequest;
import pe.com.tintegro.dto.request.FlagTbUsuarioRequest;
import pe.com.tintegro.dto.request.InsertarUsuarioRequest;
import pe.com.tintegro.dto.request.ListaTbUsuarioPaginadoRequest;
import pe.com.tintegro.dto.request.ListaTbUsuarioRequest;
import pe.com.tintegro.dto.request.ListaTbUsuarioxNombreRequest;
import pe.com.tintegro.dto.request.ListarUsuarioxIdRequest;
import pe.com.tintegro.dto.response.ActualizarUsuarioResponse;
import pe.com.tintegro.dto.response.BuscarTbUsuarioResponse;
import pe.com.tintegro.dto.response.EliminarUsuarioResponse;
import pe.com.tintegro.dto.response.FlagUsuarioResponse;
import pe.com.tintegro.dto.response.InsertarUsuarioResponse;
import pe.com.tintegro.dto.response.ListaTbUsuarioPaginadoResponse;
import pe.com.tintegro.dto.response.ListaTbUsuarioResponse;
import pe.com.tintegro.dto.response.ListarTbUsuarioxNombreResponse;
import pe.com.tintegro.dto.response.ListarUsuarioxIdResponse;
import pe.com.tintegro.services.TbUsuarioServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/tbUsuario")
// PARA WEB SERVICE POSTMAN
public class TbUsuarioController
{

	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "tbUsuarioServices")
	protected TbUsuarioServices tbUsuarioServices;

	@RequestMapping(value = "/listar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaTbUsuarioResponse listar(@RequestBody ListaTbUsuarioRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		ListaTbUsuarioResponse response = new ListaTbUsuarioResponse();
		try
		{
			response = tbUsuarioServices.ListarTbUsuario(codUsuario, idInstancia);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Usuarios Realizada");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar la Lista de Usuarios");
			System.out.println(ex.getMessage());
			 LOGGER.error(codError, ex);
		}
		return response;
	}

	// __________________________

	@RequestMapping(value = "/listarPorNombre", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarTbUsuarioxNombreResponse listarxNombre(@RequestBody ListaTbUsuarioxNombreRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		ListarTbUsuarioxNombreResponse response = new ListarTbUsuarioxNombreResponse();
		try
		{
			response = tbUsuarioServices.ListarTbUsuarioxNombre(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Usuario Realizada");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar el usuario buscado");
			System.out.println(ex.getMessage());
			 LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/listarPorId", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarUsuarioxIdResponse listarxID(@RequestBody ListarUsuarioxIdRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		ListarUsuarioxIdResponse response = new ListarUsuarioxIdResponse();
		try
		{
			response = tbUsuarioServices.ListarUsuarioxId(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Datos del Usuario Realizada");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar los datos del usuario");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	// _________________________

	@RequestMapping(value = "/modificarFlagUsuarioPin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public FlagUsuarioResponse modificarFlagUsuario(@RequestBody FlagTbUsuarioRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		FlagUsuarioResponse response = new FlagUsuarioResponse();
		try
		{
			response = tbUsuarioServices.modificarFlagTbUsuario(codUsuario, idInstancia, request);
		}
		catch (Exception exception)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible cambiar el estado el usuario");
			System.out.println(exception.getMessage());
			LOGGER.error(codError, exception);
		}

		return response;
	}

	@RequestMapping(value = "/insertarUsuario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarUsuarioResponse InsertarUsuario(@RequestBody InsertarUsuarioRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		InsertarUsuarioResponse response = new InsertarUsuarioResponse();
		try
		{

			if (request.getIdEmpare() != null && request.getIdEmpare() == 0)
			{
				request.setIdEmpare(null);
			}

			if (request.getIdSip() != null && request.getIdSip() == 0)
			{
				request.setIdSip(null);
			}

			if (request.getIdEmpare().toString().length() == 0)
			{
				request.setIdEmpare(null);
			}

//			if (request.getIdSip().toString().length() == 0)
//			{
//				request.setIdSip(null);
//			}

			response = tbUsuarioServices.insertarUsuario(codUsuario, idInstancia, request);
		
		}
		catch (Exception exception)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible guardar el usuario");
			System.out.println(exception.getMessage());
			LOGGER.error(codError, exception);
		}

		return response;
	}

	@RequestMapping(value = "/eliminarUsuario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminarUsuarioResponse EliminarUsuario(@RequestBody EliminarUsuarioRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		EliminarUsuarioResponse response = new EliminarUsuarioResponse();
		try
		{
			response = tbUsuarioServices.EliminarUsuario(codUsuario, idInstancia, request);
		}
		catch (Exception exception)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible eliminar el usuario");
			System.out.println(exception.getMessage());
			LOGGER.error(codError, exception);
		}

		return response;
	}

	@RequestMapping(value = "/actualizarUsuario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizarUsuarioResponse ActualizarUsuario(@RequestBody ActualizarUsuarioRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		ActualizarUsuarioResponse response = new ActualizarUsuarioResponse();
		try
		{
			response = tbUsuarioServices.ActualizarUsuario(codUsuario, idInstancia, request);
		}
		catch (Exception exception)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible actualizar el usuario");
			System.out.println(exception.getMessage());
			LOGGER.error(codError, exception);
		}

		return response;
	}

	@RequestMapping(value = "/listaTbUsuarioPaginado", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaTbUsuarioPaginadoResponse listaTbUsuarioPaginado(@RequestBody ListaTbUsuarioPaginadoRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia)
	{

		ListaTbUsuarioPaginadoResponse response = new ListaTbUsuarioPaginadoResponse();
		try
		{
			response = tbUsuarioServices.listaTbUsuarioPaginado(codUsuario, idInstancia, request);
			response.setMensaje(response.getMensaje());
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
		}
		catch (Exception exception)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar el usuario");
			System.out.println(exception.getMessage());
			LOGGER.error(codError, exception);
		}
		return response;
	}

	@RequestMapping(value = "/buscarUsuario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public BuscarTbUsuarioResponse buscarUsuario(@RequestBody BuscarTbUsuarioRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		BuscarTbUsuarioResponse response = new BuscarTbUsuarioResponse();
		try
		{
			response = tbUsuarioServices.buscarTbUsuario(codUsuario, idInstancia, request);
			response.setLsUsuario(response.getLsUsuario());
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Usuario Realizada");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible encontrar el elemento en la lista");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

}
