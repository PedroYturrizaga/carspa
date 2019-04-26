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
import pe.com.tintegro.dto.request.EditaHorarioRequest;
import pe.com.tintegro.dto.request.EliminaHorarioRequest;
import pe.com.tintegro.dto.request.InsertaHorarioRequest;
import pe.com.tintegro.dto.request.ListaHorarioRequest;
import pe.com.tintegro.dto.request.ListaHorariosLibresRequest;
import pe.com.tintegro.dto.request.ListaPorIdHorarioRequest;
import pe.com.tintegro.dto.request.ObtieneAudioRequest;
import pe.com.tintegro.dto.response.EditaHorarioResponse;
import pe.com.tintegro.dto.response.EliminaHorarioResponse;
import pe.com.tintegro.dto.response.InsertaHorarioResponse;
import pe.com.tintegro.dto.response.ListaAudiosPredeterminadosResponse;
import pe.com.tintegro.dto.response.ListaHorarioResponse;
import pe.com.tintegro.dto.response.ListaItemResponse;
import pe.com.tintegro.dto.response.ListaPorIdHorarioResponse;
import pe.com.tintegro.dto.response.ObtieneAudioResponse;
import pe.com.tintegro.services.HorarioServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/horario")
public class HorarioController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());
	@Resource(name = "horarioServices")
	protected HorarioServices horarioServices;

	@RequestMapping(value = "/insertaHorario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertaHorarioResponse insertaHorario(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody InsertaHorarioRequest request)
	{
		InsertaHorarioResponse response = new InsertaHorarioResponse();
		try
		{
			response = horarioServices.insertaHorario(codUsuario, idInstancia, request);
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido agregar  horario ");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/editaHorario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EditaHorarioResponse editaHorario(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody EditaHorarioRequest request)
	{
		EditaHorarioResponse response = new EditaHorarioResponse();
		try
		{
			response = horarioServices.editaHorario(codUsuario, idInstancia, request);
			response.setResultado(response.getResultado());
			// System.out.println("base 64 del audio " +
			// request.getBase64Audio());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido actualizar   horario ");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/eliminaHorario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminaHorarioResponse eliminaHorario(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody EliminaHorarioRequest request)
	{
		EliminaHorarioResponse response = new EliminaHorarioResponse();
		try
		{
			response = horarioServices.eliminaHorario(codUsuario, idInstancia, request);
			response.setResultado(response.getResultado());
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido Eliminar  horario ");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/listaHorario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaHorarioResponse listaHorario(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListaHorarioRequest request)
	{
		ListaHorarioResponse response = new ListaHorarioResponse();
		try
		{
			response = horarioServices.listaHorario(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Horarios exitosa");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido  mostrar grupo horario ");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/listaPorIdHorario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaPorIdHorarioResponse listaPorIdGrupoHorario(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListaPorIdHorarioRequest request)
	{
		ListaPorIdHorarioResponse response = new ListaPorIdHorarioResponse();
		try
		{
			response = horarioServices.listaPorIdHorario(codUsuario, idInstancia, request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Lista de grupo horario obtenida con éxito");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha podido  mostrar grupo horario ");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}
		return response;
	}

	@RequestMapping(value = "/listar-audios-predeterminados", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaAudiosPredeterminadosResponse listarAudiosPredeterminados(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		ListaAudiosPredeterminadosResponse response = new ListaAudiosPredeterminadosResponse();

		try
		{
			response = horarioServices.listarHorariosPredeterminados(codUsuario, idInstancia);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Lista de archivos obtenida con éxito.");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("Falló carga de audios del servidor.");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}

		return response;
	}

	@RequestMapping(value = "/listar-horarios-libres", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaItemResponse listarHorariosLibres(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia,
			@RequestBody ListaHorariosLibresRequest request)
	{
		ListaItemResponse response = new ListaItemResponse();

		try
		{
			response = horarioServices.listarHorariosLibres(codUsuario, request, idInstancia);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Listado de Horarios Libres exitoso.");
		}
		catch (Exception ex)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("Falla en el listado de Horarios Libres.");
			System.out.println(ex.getMessage());
			LOGGER.error(codError, ex);
		}

		return response;
	}

	@RequestMapping(value = "/obtener-audio", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ObtieneAudioResponse obtenerAudioDeServidor(@RequestBody ObtieneAudioRequest requestBody, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("idInstancia") String idInstancia,
			@RequestHeader("token") String token)
	{
		ObtieneAudioResponse response = new ObtieneAudioResponse();

		try
		{
			String fileBase64 = horarioServices.obtieneAudioDeServidor(codUsuario, idInstancia, requestBody.getNameFile());
			response.setAudioBase64(fileBase64);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Audio obtenido correctamente");
		}
		catch (Exception exception)
		{
			String codError = Constantes.ID_ERROR_APP +Util.getCodigoErrorByDate();
			response.setCodError(codError);
			if (!exception.getMessage().equals("") && exception.getMessage() != null)
				response.setMensaje(exception.getMessage());
			else
				response.setMensaje("Hubo un error al carga el archivo en cuestión.");
			LOGGER.error(codError, exception);
		}

		return response;
	}
}
