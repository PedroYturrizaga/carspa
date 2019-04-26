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
import pe.com.tintegro.dto.request.ActualizarRolRequest;
import pe.com.tintegro.dto.request.EliminaRolRequest;
import pe.com.tintegro.dto.request.ListarRolPorTipoRolRequest;
import pe.com.tintegro.dto.request.RolRequest;
import pe.com.tintegro.dto.request.ListaRolPorInstanciaRequest;
import pe.com.tintegro.dto.response.EliminaRolResponse;
import pe.com.tintegro.dto.response.ListaRolPorInstanciaResponse;
import pe.com.tintegro.dto.response.ListarRolPorTipoRolResponse;
import pe.com.tintegro.dto.response.RolResponse;
import pe.com.tintegro.services.RolServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/rol")
public class RolController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "rolServices")
	protected RolServices rolServices;

	@RequestMapping(value = "/listaRolesxTipoRol", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarRolPorTipoRolResponse listarRoles(@RequestBody ListarRolPorTipoRolRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
	{
		ListarRolPorTipoRolResponse response = new ListarRolPorTipoRolResponse();
		try
		{
			response = rolServices.listarRolesServices(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Roles obtenidos correctamente");
		}
		catch (Exception e)
		{

			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("Ocurrio un error al obtener roles");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/listaRolesSinPagina", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaRolPorInstanciaResponse listaRolSinPagina(@RequestBody ListaRolPorInstanciaRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
	{
		ListaRolPorInstanciaResponse response = new ListaRolPorInstanciaResponse();

		try
		{
			request.setCodUsuario(codUsuario);
			response = rolServices.listarRolPorPaginaServices(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Roles obtenidos correctamente.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("Ocurrió un error al obtener roles.");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}

	@RequestMapping(value = "/crearRol", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public RolResponse crearRol(@RequestBody RolRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia)
	{
		RolResponse response = new RolResponse();

		try
		{
			response = rolServices.asignarPaginaPorRolTotal(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible insertar el rol.");

			LOGGER.error(codError, e);
		}

		return response;
	}

	@RequestMapping(value = "/listaRolesxPagina", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaRolPorInstanciaResponse listaRolPorPagina(@RequestBody ListaRolPorInstanciaRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		ListaRolPorInstanciaResponse response = new ListaRolPorInstanciaResponse();

		try
		{
			request.setIdInstancia(idInstancia);
			request.setCodUsuario(codUsuario);
			response = rolServices.listarRolPorPaginaServices(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Roles obtenidos correctamente");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("Ocurrió un error al obtener roles");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}

	@RequestMapping(value = "/actualizarRol", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public RolResponse actualizarRol(@RequestBody ActualizarRolRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		RolResponse response = new RolResponse();
		try
		{
			response = rolServices.actualizarRolTotal(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("Ocurrió un error al actualizar el rol.");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}

	@RequestMapping(value = "/eliminarRol", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminaRolResponse eliminarRol(@RequestBody EliminaRolRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EliminaRolResponse response = new EliminaRolResponse();

		try
		{
			response = rolServices.eliminarRol(idInstancia, request);

		}
		catch (Exception e)
		{
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			response.setMensaje("Ocurrió un error al eliminar el rol.");
			response.setCodError(codError);
			LOGGER.error(codError, e);
		}

		return response;
	}
}
