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
import pe.com.tintegro.dto.request.ActualizarPlanPrincipalRequest;
import pe.com.tintegro.dto.request.EliminarPlanPrincipalRequest;
import pe.com.tintegro.dto.request.InsertarPlanPrincipalRequest;
import pe.com.tintegro.dto.request.ListarContextoPorPlanRequest;
import pe.com.tintegro.dto.request.ListarPlanPrincipalRequest;
import pe.com.tintegro.dto.response.ActualizarPlanPrincipalResponse;
import pe.com.tintegro.dto.response.EliminarPlanPrincipalResponse;
import pe.com.tintegro.dto.response.InsertarPlanPrincipalResponse;
import pe.com.tintegro.dto.response.ListarContextoPorPlanResponse;
import pe.com.tintegro.dto.response.ListarPlanPrincipalResponse;
import pe.com.tintegro.services.PlanPrincipalServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/planPrincipal")
public class PlanPrincipalController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "planPrincipalServices")
	protected PlanPrincipalServices planPrincipalServices;

	@RequestMapping(value = "/insertar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarPlanPrincipalResponse insertarPlanPrincipal(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody InsertarPlanPrincipalRequest request)
	{

		InsertarPlanPrincipalResponse response = new InsertarPlanPrincipalResponse();
		try
		{
			response = planPrincipalServices.insertarPlanPrincipal(codUsuario, idInstancia, request);
			response.setInsertado(response.getInsertado());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido insertar Principal");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/actualizar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizarPlanPrincipalResponse actualizarPlanPrincipal(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia, @RequestBody ActualizarPlanPrincipalRequest request)
	{

		ActualizarPlanPrincipalResponse response = new ActualizarPlanPrincipalResponse();
		try
		{
			response = planPrincipalServices.actualizarPlanPrincipal(codUsuario, idInstancia, request);
			response.setActualizado(response.getActualizado());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido actualizar Principal");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/eliminar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminarPlanPrincipalResponse eliminarPlanPrincipal(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody EliminarPlanPrincipalRequest request)
	{

		EliminarPlanPrincipalResponse response = new EliminarPlanPrincipalResponse();
		try
		{
			response = planPrincipalServices.eliminarPlanPrincipal(codUsuario, idInstancia, request);
			response.setEliminado(response.getEliminado());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido eliminar Principal");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/listar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarPlanPrincipalResponse listarPlanPrincipal(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListarPlanPrincipalRequest request)
	{

		ListarPlanPrincipalResponse response = new ListarPlanPrincipalResponse();
		try
		{
			response = planPrincipalServices.listarPlanPrincipal(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulra de Plan Principal Realizada");
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

	@RequestMapping(value = "/listarContextoPorPlan", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarContextoPorPlanResponse listarContextoPorPlan(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListarContextoPorPlanRequest request)
	{

		ListarContextoPorPlanResponse response = new ListarContextoPorPlanResponse();
		try
		{
			response = planPrincipalServices.listarContextoPorPlan(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Lista de Contexto Realizada");
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
}
