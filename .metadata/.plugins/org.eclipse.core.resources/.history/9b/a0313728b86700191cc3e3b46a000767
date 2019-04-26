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
import pe.com.tintegro.dto.request.ActualizarMusicaOnHoldRequest;
import pe.com.tintegro.dto.request.EliminarMusicaOnHoldRequest;
import pe.com.tintegro.dto.request.InsertarMusicaOnHoldRequest;
import pe.com.tintegro.dto.request.ListarMusicaOnHoldRequest;
import pe.com.tintegro.dto.response.ActualizarMusicaOnHoldResponse;
import pe.com.tintegro.dto.response.EliminarMusicaOnHoldResponse;
import pe.com.tintegro.dto.response.InsertarMusicaOnHoldResponse;
import pe.com.tintegro.dto.response.ListarMusicaOnHoldResponse;
import pe.com.tintegro.services.MusicaOnHoldServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/musicaOnHold")
public class MusicaOnHoldController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "musicaOnHoldServices")
	protected MusicaOnHoldServices musicaOnHoldServices;

	// Listar Musica
	@RequestMapping(value = "/listaMusicaOnHold", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarMusicaOnHoldResponse listarMusicaOnHold(@RequestBody ListarMusicaOnHoldRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		ListarMusicaOnHoldResponse response = new ListarMusicaOnHoldResponse();

		try
		{
			response = musicaOnHoldServices.listarMusicaOnHold(codUsuario, idInstancia, request);
			String codError = Constantes.ESTADO_TRAMA_OK + Util.getCodigoErrorByDate();
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setCodError(codError);
			response.setMensaje("Se cargo la lista correctamente");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar las carpetas de Musica");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}

		return response;
	}

	// Insertar Musica
	@RequestMapping(value = "/insertarMusicaOnHold", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarMusicaOnHoldResponse insertarCentralExterna(@RequestBody InsertarMusicaOnHoldRequest request, @RequestHeader("codUsuario") String codUsuario,

	@RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia)
	{

		InsertarMusicaOnHoldResponse response = new InsertarMusicaOnHoldResponse();
		try
		{
			response = musicaOnHoldServices.insertarMusicaOnHold(codUsuario, idInstancia, request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se pudo guardar la carpeta de Musica");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);

		}

		return response;

	}

	// Actualizar Musica
	@RequestMapping(value = "/actualizarMusicaOnHold", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ActualizarMusicaOnHoldResponse actualizarMusicaOnHold(@RequestBody ActualizarMusicaOnHoldRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia)
	{

		ActualizarMusicaOnHoldResponse response = new ActualizarMusicaOnHoldResponse();
		try
		{
			response = musicaOnHoldServices.actualizarMusicaOnHold(codUsuario, idInstancia, request);
		}
		catch (Exception exception)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible actualizar la carpeta de Musica");
			System.out.println(exception.getMessage());
			LOGGER.error(codError, exception);
		}

		return response;

	}

	// Eliminar Musica
	@RequestMapping(value = "/eliminarMusicaOnHold", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminarMusicaOnHoldResponse eliminarMusicaOnHold(@RequestBody EliminarMusicaOnHoldRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EliminarMusicaOnHoldResponse response = new EliminarMusicaOnHoldResponse();
		try
		{
			response = musicaOnHoldServices.eliminarMusicaOnHold(codUsuario, idInstancia, request);
		}
		catch (Exception exception)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible eliminar la carpeta de Musica");
			System.out.println(exception.getMessage());
			LOGGER.error(codError, exception);
		}

		return response;

	}

}
