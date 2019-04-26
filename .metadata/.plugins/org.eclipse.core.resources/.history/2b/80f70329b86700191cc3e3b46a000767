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
import pe.com.tintegro.dto.request.ActualizarRingGroupRequest;
import pe.com.tintegro.dto.request.EliminarRingGroupRequest;
import pe.com.tintegro.dto.request.InsertarRingGroupRequest;
import pe.com.tintegro.dto.request.ListaRingGroupRequest;
import pe.com.tintegro.dto.request.ListarRingGroupxAnexoRequest;
import pe.com.tintegro.dto.request.ListarVerificacionRingGroupRequest;
import pe.com.tintegro.dto.response.ActualizarRingGroupResponse;
import pe.com.tintegro.dto.response.EliminarRingGroupResponse;
import pe.com.tintegro.dto.response.InsertarRingGroupResponse;
import pe.com.tintegro.dto.response.ListaRingGroupResponse;
import pe.com.tintegro.dto.response.ListarRingGroupxAnexoResponse;
import pe.com.tintegro.dto.response.ListarVerificacionRingGroupResponse;
import pe.com.tintegro.services.RingGroupServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/ringGroup")
public class RingGroupController
{

	@Resource(name = "ringGroupServices")
	protected RingGroupServices ringGroupServices;

	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/listaRingGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaRingGroupResponse listaRingGroup(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListaRingGroupRequest request)
	{
		ListaRingGroupResponse response = new ListaRingGroupResponse();
		try
		{
			response = ringGroupServices.listaGroupServices(codUsuario, idInstancia, request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar la Lista");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/insertaRingGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarRingGroupResponse insertaRingGroup(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody InsertarRingGroupRequest request)
	{
		InsertarRingGroupResponse response = new InsertarRingGroupResponse();
		try
		{
			response = ringGroupServices.insertarRingGroupServices(codUsuario, idInstancia, request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible la inserción de ring group");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;

	}

	@RequestMapping(value = "/actualizaRingGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizarRingGroupResponse actualizaRingGroup(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ActualizarRingGroupRequest request)
	{
		ActualizarRingGroupResponse response = new ActualizarRingGroupResponse();
		try
		{
			response = ringGroupServices.actualizarRingGroupServices(codUsuario, idInstancia, request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible la actualización de ring group");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/eliminaRingGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminarRingGroupResponse eliminarRingGroupResponse(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody EliminarRingGroupRequest request)
	{
		EliminarRingGroupResponse response = new EliminarRingGroupResponse();
		try
		{
			response = ringGroupServices.eliminarRingGroupServices(codUsuario, idInstancia, request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible la eliminación de ring group");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/validacionRingGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarVerificacionRingGroupResponse VerificacionRingGroup(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia, @RequestBody ListarVerificacionRingGroupRequest request)
	{
		ListarVerificacionRingGroupResponse response = new ListarVerificacionRingGroupResponse();
		try
		{
			response = ringGroupServices.verificacionRingGroup(codUsuario, idInstancia, request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido encontrar el ring group");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/filtroRingGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarRingGroupxAnexoResponse filtroRingGroup(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListarRingGroupxAnexoRequest request)
	{
		ListarRingGroupxAnexoResponse response = new ListarRingGroupxAnexoResponse();
		try
		{
			response = ringGroupServices.filtroRingGroupServices(codUsuario, idInstancia, request);

		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar la Lista");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

}
