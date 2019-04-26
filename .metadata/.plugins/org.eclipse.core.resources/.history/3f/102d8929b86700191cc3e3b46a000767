package pe.com.tintegro.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.com.tintegro.dao.util.Constantes;
import pe.com.tintegro.dto.request.CargaAnexosInicialesRequest;
import pe.com.tintegro.dto.response.InsertaSipBuddieResponse;
import pe.com.tintegro.services.ConfiguracionPlanServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/configuracion-plan")
public class ConfiguracionPlanController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Autowired
	private ConfiguracionPlanServices configuracionPlanServices;

	@RequestMapping(value = "/cargar-anexos-iniciales", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertaSipBuddieResponse cargarAnexosIniciales(@RequestBody CargaAnexosInicialesRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		InsertaSipBuddieResponse response = new InsertaSipBuddieResponse();

		try
		{
			response = configuracionPlanServices.cargarAnexosIniciales(codUsuario, idInstancia);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setCodError(null);
			response.setMensaje("Anexos insertados con éxito.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("Error en la inserción de Anexos SIP");
			System.out.print(e.getMessage());
			LOGGER.error(codError, e);
		}

		return response;
	}
}
