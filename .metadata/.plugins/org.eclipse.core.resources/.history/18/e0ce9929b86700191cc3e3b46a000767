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
import pe.com.tintegro.dto.request.ListaPermitRequest;
import pe.com.tintegro.dto.response.ListaPermitResponse;
import pe.com.tintegro.services.PermitServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/permit")
public class PermitController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "permitServices")
	protected PermitServices permitServices;

	@RequestMapping(value = "/lista", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaPermitResponse listaPermit(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia, @RequestBody  ListaPermitRequest request)
	{
		ListaPermitResponse response = new ListaPermitResponse();
		try
		{
			response = permitServices.listaPermit(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Listado ok");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar Permit");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}
}
