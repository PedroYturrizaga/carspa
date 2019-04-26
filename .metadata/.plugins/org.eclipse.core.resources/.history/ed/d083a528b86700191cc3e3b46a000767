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
import pe.com.tintegro.dto.request.ListaUrlPaginaRequest;
import pe.com.tintegro.dto.request.ListarPaginaRequest;
import pe.com.tintegro.dto.response.ListaUrlPaginaResponse;
import pe.com.tintegro.dto.response.ListarPaginaResponse;
import pe.com.tintegro.services.PaginaService;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/pagina")
public class PaginaController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "paginaServices")
	protected PaginaService paginaServices;

	@RequestMapping(value = "/listarPaginas", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarPaginaResponse listarRoles(@RequestBody ListarPaginaRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
	{
		ListarPaginaResponse response = new ListarPaginaResponse();
		try
		{
			request.setCodUsuario(codUsuario);
			response = paginaServices.listarPaginaServices(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Ok");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar los roles");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/listarPaginasGPedido", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarPaginaResponse listarRolesGP(@RequestBody ListarPaginaRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
	{
		ListarPaginaResponse response = new ListarPaginaResponse();
		try
		{
			request.setCodUsuario(codUsuario);
			response = paginaServices.listarPaginaServicesGP(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Ok");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar los roles");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}
	
	@RequestMapping(value="/listaUrlPagina",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaUrlPaginaResponse listaUrlPagina(@RequestBody ListaUrlPaginaRequest request,@RequestHeader("codUsuario") String codUsuario,@RequestHeader("token") String token){
		ListaUrlPaginaResponse response = new ListaUrlPaginaResponse();
		try {
			request.setCodUsuario(codUsuario);
			response = paginaServices.listaUrlPaginaResponse(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("OK");
		} catch (Exception e) {
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar los datos de la url");
			System.out.println(e.getMessage());
			LOGGER.error(codError,e);
		}
		
		return response;
		
	}
}
