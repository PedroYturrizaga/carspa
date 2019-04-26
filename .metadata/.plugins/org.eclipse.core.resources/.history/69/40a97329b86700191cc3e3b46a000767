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
import pe.com.tintegro.dto.request.ListarPlanCantidadARequest;
import pe.com.tintegro.dto.response.ListarPlanCantidadAResponse;
import pe.com.tintegro.services.PlanCantidadAServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/plan")
public class PlanController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "planCantidadAServices")
	protected PlanCantidadAServices planCantidadAServices;

	@RequestMapping(value = "/listar-cantidad-anexos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarPlanCantidadAResponse listarcantidadAnexos(@RequestBody ListarPlanCantidadARequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
			throws Exception
	{
		ListarPlanCantidadAResponse response = new ListarPlanCantidadAResponse();
		try
		{
			response = planCantidadAServices.listarplancantida(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("cantidad de anexos por plan obtenidos correctamente");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido listar cantidades");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}
}
