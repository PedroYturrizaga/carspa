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
import pe.com.tintegro.dto.request.ListaControlRolEstadoRequest;
import pe.com.tintegro.dto.response.ListaControlRolEstadoResponse;
import pe.com.tintegro.services.ControlRolEstadoServices;
//import pe.com.tintegro.services.InstanciaServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/controlRolEstado")
public class ControlRolEstadoController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "controlRolEstadoServices")
	protected ControlRolEstadoServices controlRolEstadoServices;
	
	@RequestMapping(value = "/listar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaControlRolEstadoResponse listaControlRolEstado(
			@RequestBody ListaControlRolEstadoRequest request,
			@RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		ListaControlRolEstadoResponse response = new ListaControlRolEstadoResponse();
		try
		{
			response = controlRolEstadoServices.listarControlRolEstadoServices(codUsuario, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Se cargo correctamente la lista");
		}catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}
}
