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
import pe.com.tintegro.dto.request.MenuSicRequest;
import pe.com.tintegro.dto.response.MenuSicResponse;
import pe.com.tintegro.services.MenuSicServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/menuSic")
public class MenuSicController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "menuSicServices")
	protected MenuSicServices menuSicServices;

	@RequestMapping(value = "/listar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public MenuSicResponse listar(@RequestBody MenuSicRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		MenuSicResponse response = new MenuSicResponse();
		try
		{
			response = menuSicServices.listaMenu(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Se obtuvo el menu exitosamente.");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("Ocurrió un error al obtener menú");
			LOGGER.error(codError, ex);
		}

		return response;
	}
}
