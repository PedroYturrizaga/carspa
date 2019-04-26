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
import pe.com.tintegro.dto.request.EditaSipTrunkRequest;
import pe.com.tintegro.dto.request.EliminaSipTrunkRequest;
import pe.com.tintegro.dto.request.InsertaSipTrunkRequest;
import pe.com.tintegro.dto.request.ListaSipTrunkRequest;
import pe.com.tintegro.dto.response.EditaSipTrunkResponse;
import pe.com.tintegro.dto.response.EliminaSipTrunkResponse;
import pe.com.tintegro.dto.response.InsertaSipTrunkResponse;
import pe.com.tintegro.dto.response.ListaSipTrunkResponse;
import pe.com.tintegro.services.SipTrunkServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/sipTrunk")
public class SipTrunkController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "sipTrunkServices")
	protected SipTrunkServices sipTrunkServices;

	@RequestMapping(value = "/insertaSipTrunk", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertaSipTrunkResponse insertaSipTrunk(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody InsertaSipTrunkRequest request)
	{
		InsertaSipTrunkResponse response = new InsertaSipTrunkResponse();
		try
		{
			response = sipTrunkServices.insertaSipTrunk(codUsuario, idInstancia, request);
			if (response.getResultado() == 1)
			{
				response.setMensaje("Sip Trunk Agregrado");
			}
			else if (response.getResultado() == 0)
			{
				response.setMensaje("Sip Trunk, no Agregrado revise sus datos");
			}
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible Insertar SipTrunk");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/editaSipTrunk", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EditaSipTrunkResponse editaSipTrunk(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody EditaSipTrunkRequest request)
	{
		EditaSipTrunkResponse response = new EditaSipTrunkResponse();
		try
		{
			response = sipTrunkServices.editaSipTrunk(codUsuario, idInstancia, request);
			if (response.getResultado() == 1)
			{
				response.setMensaje("Sip Trunk Actualizado");
			}
			else if (response.getResultado() == 0)
			{
				response.setMensaje("Sip Trunk,no actualizado revise sus datos");
			}
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible actualizar SipTrunk");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/eliminaSipTrunk", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminaSipTrunkResponse eliminaSipTrunk(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody EliminaSipTrunkRequest request)
	{
		EliminaSipTrunkResponse response = new EliminaSipTrunkResponse();
		try
		{
			response = sipTrunkServices.eliminaSipTrunk(codUsuario, idInstancia, request);
			if (response.getResultado() == 1)
			{
				response.setMensaje("Sip Trunk Eliminado");
			}
			else if (response.getResultado() == 0)
			{
				response.setMensaje("Sip Trunk,no Eliminado revise sus datos");
			}
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible eliminar Sip Trunk");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/lista", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaSipTrunkResponse listaSipTrunk(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListaSipTrunkRequest request)
	{
		ListaSipTrunkResponse response = new ListaSipTrunkResponse();
		try
		{
			response = sipTrunkServices.listaSipTrunk(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Listado Sip trunk correcto");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar SipTrunk");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

}
