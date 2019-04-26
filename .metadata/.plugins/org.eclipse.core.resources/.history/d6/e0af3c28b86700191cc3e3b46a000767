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
import pe.com.tintegro.dto.request.EjecutarBashRequest;
import pe.com.tintegro.dto.response.EjecutarBashResponse;
import pe.com.tintegro.services.BashServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/bash")
public class BashController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "bashServices")
	protected BashServices bashServices;
	
	@RequestMapping(value="/ejecutar",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse ejecutarBash(@RequestBody EjecutarBashRequest request,
			@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia){
		EjecutarBashResponse response=new EjecutarBashResponse();
		try
		{
			response = bashServices.ejecutarBash(codUsuario,idInstancia);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Se ejecuto sentencia Bash correctamente");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha ejecutado correctamente sentencia Bash");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		
		return response;
	}

}
