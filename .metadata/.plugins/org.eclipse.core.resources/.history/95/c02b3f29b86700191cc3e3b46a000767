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
import pe.com.tintegro.dto.request.ListaMarcaTelefonoRequest;
import pe.com.tintegro.dto.response.ListaMarcaTelefonoResponse;
import pe.com.tintegro.services.MarcaTelefonoGeneralServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/marcaTelefonoGeneral")
public class MarcaTelefonoGeneralController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "marcaTelefonoGeneralServices")
	protected MarcaTelefonoGeneralServices marcaTelefonoGeneralServices;

	@RequestMapping(value = "/listarMarca", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaMarcaTelefonoResponse listar(@RequestBody ListaMarcaTelefonoRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
	{
		ListaMarcaTelefonoResponse response = new ListaMarcaTelefonoResponse();
		try
		{
			response = marcaTelefonoGeneralServices.listaMarcaTelefonoGeneral(codUsuario, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Listado de Marca Exitoso");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido mostrar las marcas del telefono");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);

		}
		return response;
	}
}
