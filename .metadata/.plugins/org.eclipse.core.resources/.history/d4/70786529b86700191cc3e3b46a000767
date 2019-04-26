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
import pe.com.tintegro.dto.request.BuscaPinRequest;
import pe.com.tintegro.dto.request.FlagTbPinRequest;
import pe.com.tintegro.dto.response.BuscaPinResponse;
import pe.com.tintegro.dto.response.FlagTbPinResponse;
import pe.com.tintegro.services.TbPinServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/tbPin")
public class TbPinController
{

	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "tbPinServices")
	protected TbPinServices tbPinServices;

	@RequestMapping(value = "/flagPin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public FlagTbPinResponse FlagTbPin(@RequestBody FlagTbPinRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)

	{
		FlagTbPinResponse response = new FlagTbPinResponse();

		try
		{
			response = tbPinServices.modificarFlagTbPin(codUsuario, idInstancia, request);
		}
		catch (Exception exception)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible Otorgar Permisos");
			System.out.println(exception.getMessage());
			LOGGER.error(codError, exception);
		}

		return response;
	}

	@RequestMapping(value = "/buscaPin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public BuscaPinResponse buscaPin(@RequestBody BuscaPinRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		BuscaPinResponse response = new BuscaPinResponse();
		try
		{
			response = tbPinServices.buscaPin(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Permisos Otorgados Realizado");
		
		}
		catch (Exception exception)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible Otorgar Permisos");
			System.out.println(exception.getMessage());
			LOGGER.error(codError, exception);
		}
		return response;
	}
}
