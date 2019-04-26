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
import pe.com.tintegro.services.ConfiguracionInicialAsteriskServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/configuracion-inicial-asterisk")
public class ConfiguracionInicialAsteriskController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "configuracionInicialAsteriskServices")
	protected ConfiguracionInicialAsteriskServices inicialAsteriskServices;

	@RequestMapping(value = "/import-scripts", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse importScriptsConfigInitial(@RequestBody EjecutarBashRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EjecutarBashResponse response = new EjecutarBashResponse();

		String salida = null;

		try
		{
			salida = inicialAsteriskServices.importBashesToAsteriskServer(codUsuario, idInstancia, request);
			response.setSalida(salida);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Scripts de configuración Inicial importados correctamente.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codigoError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codigoError);
			response.setMensaje(e.getMessage());
			LOGGER.error(codigoError, e);
			System.out.println(e.getMessage());
		}

		return response;
	}

	@RequestMapping(value = "/base-de-datos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse configuracionBaseDeDatos(@RequestBody EjecutarBashRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EjecutarBashResponse response = new EjecutarBashResponse();

		String salida = null;

		try
		{
			salida = inicialAsteriskServices.crearDbBash(codUsuario, idInstancia, request);
			response.setSalida(salida);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Base de Datos instalada y configurada correctamente.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codigoError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codigoError);
			response.setMensaje(e.getMessage());
			LOGGER.error(codigoError, e);
			System.out.println(e.getMessage());
		}

		return response;
	}

	@RequestMapping("/open-vpn")
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse configuracionOpenVPN(@RequestBody EjecutarBashRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EjecutarBashResponse response = new EjecutarBashResponse();

		String salida;

		try
		{
			salida = inicialAsteriskServices.serverVpn(codUsuario, idInstancia, request);
			response.setSalida(salida);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Servicio OpenVPN instalado y configurado correctamente.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codigoError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codigoError);
			response.setMensaje(e.getMessage());
			LOGGER.error(codigoError, e);
			System.out.println(e.getMessage());
		}

		return response;
	}

	@RequestMapping("/fax")
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse configuracionFax(@RequestBody EjecutarBashRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EjecutarBashResponse response = new EjecutarBashResponse();

		String salida;

		try
		{
			salida = inicialAsteriskServices.faxServer(codUsuario, idInstancia, request);
			response.setSalida(salida);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Servidor fax virtual instalado y configurado correctamente.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codigoError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codigoError);
			response.setMensaje(e.getMessage());
			LOGGER.error(codigoError, e);
			System.out.println(e.getMessage());
		}

		return response;
	}

	@RequestMapping(value = "/crear-espacio-aprovisionamiento", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse crearEspacioAprovisionamiento(@RequestBody EjecutarBashRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EjecutarBashResponse response = new EjecutarBashResponse();

		String salida;

		try
		{
			salida = inicialAsteriskServices.createProvisioningSpace(codUsuario, idInstancia, request);
			response.setSalida(salida);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Espacio de Aprovisionamiento creado con éxito.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codigoError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codigoError);
			response.setMensaje(e.getMessage());
			response.setSalida(Constantes.MSG_OPERATION_DENIED);
			LOGGER.error(codigoError, e);
			System.out.println(e.getMessage());
		}
		return response;
	}

	@RequestMapping(value = "/crear", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse ejecutarBash(@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token, @RequestHeader("idInstancia") String idInstancia)
	{
		EjecutarBashResponse response = new EjecutarBashResponse();

		try
		{
			response = inicialAsteriskServices.iniciarBashesAsterisk(codUsuario, idInstancia);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Se ejecuto sentencia Bash correctamente");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No se ha ejecutado correctamente sentencia Bash");
			LOGGER.error(codError, e);
			System.out.println(e.getMessage());
		}

		return response;
	}
	
	@RequestMapping(value = "/import-security", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse bashSecurity(@RequestBody EjecutarBashRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EjecutarBashResponse response = new EjecutarBashResponse();

		String salida = null;

		try
		{
			salida = inicialAsteriskServices.bashSecurity(codUsuario, idInstancia, request);
			response.setSalida(salida);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Script de Seguridad ejecutado correctamente.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codigoError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codigoError);
			response.setMensaje(e.getMessage());
			LOGGER.error(codigoError, e);
			System.out.println(e.getMessage());
		}

		return response;
	}	
	
	@RequestMapping(value = "/import-openldap", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse bashOpenLdap(@RequestBody EjecutarBashRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EjecutarBashResponse response = new EjecutarBashResponse();

		String salida = null;

		try
		{
			salida = inicialAsteriskServices.bashOpenLdap(codUsuario, idInstancia, request);
			response.setSalida(salida);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Script de OpenLdap ejecutado correctamente.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codigoError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codigoError);
			response.setMensaje(e.getMessage());
			LOGGER.error(codigoError, e);
			System.out.println(e.getMessage());
		}

		return response;
	}		
	
	@RequestMapping(value = "/tls-security", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EjecutarBashResponse tlsSecurity(@RequestBody EjecutarBashRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
			@RequestHeader("idInstancia") String idInstancia)
	{
		EjecutarBashResponse response = new EjecutarBashResponse();

		String salida = null;

		try
		{
			salida = inicialAsteriskServices.tlsSecurity(codUsuario, idInstancia, request);
			response.setSalida(salida);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Script de TLS Seguridad ejecutado correctamente.");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codigoError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codigoError);
			response.setMensaje(e.getMessage());
			LOGGER.error(codigoError, e);
			System.out.println(e.getMessage());
		}

		return response;
	}		
}
