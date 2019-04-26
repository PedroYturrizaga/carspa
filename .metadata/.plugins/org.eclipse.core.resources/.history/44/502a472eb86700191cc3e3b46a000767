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
import pe.com.tintegro.dto.request.ListarVariableGeneralInstanciaRequest;
import pe.com.tintegro.dto.response.ListarVariableGeneralInstanciaResponse;
import pe.com.tintegro.services.VariableGeneralInstanciaService;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/variable")
public class VariableGeneralInstanciaController {
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "variableGeneralInstanciaService")
	protected VariableGeneralInstanciaService variableService;
	@RequestMapping(value = "/listar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarVariableGeneralInstanciaResponse listarvariable(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListarVariableGeneralInstanciaRequest request)
	{
		ListarVariableGeneralInstanciaResponse response = new ListarVariableGeneralInstanciaResponse();
		try
		{
			response = variableService.listarVariables(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de tipos  Exitosa");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido Consultar grabacion");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}
}
