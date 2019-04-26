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
import pe.com.tintegro.dto.request.ListaExtensionRequest;
import pe.com.tintegro.dto.response.ListaExtensionResponse;
import pe.com.tintegro.services.ExtensionServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/extension")
public class ExtensionController
{

	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "extensionServices")
	protected ExtensionServices extensionServices;

	@RequestMapping(value = "/listarExtension", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaExtensionResponse listar(@RequestBody ListaExtensionRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{

		ListaExtensionResponse response = new ListaExtensionResponse();
		try
		{
			response = extensionServices.listaextension(codUsuario, idInstancia);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Extensiones Realizada");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible consultar la Lista de extensiones ");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

}
