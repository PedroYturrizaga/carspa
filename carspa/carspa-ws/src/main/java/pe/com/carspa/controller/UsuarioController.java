package pe.com.carspa.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
//	protected transient final Logger LOGGER = Logger.getLogger(UsuarioController.class);

//	@Resource(name = "usuarioServices")
//	protected UsuarioServices usuarioServices;
//
//	@RequestMapping(value = "/validarUsuarioLogin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	@ResponseStatus(value = HttpStatus.OK)
//	public ValidarLoginUsuarioResponse validarUsuario(@RequestBody ValidarLoginUsuarioRequest request,
//			@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
//			@RequestHeader("idInstancia") String idInstancia) {
//		ValidarLoginUsuarioResponse response = new ValidarLoginUsuarioResponse();
//		try {
//			response = usuarioServices.validaLoginUsuarioServices(request);
//		} catch (Exception e) {
//			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
//			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
//			response.setCodError(codError);
//			response.setMensaje("No ha sido posible mostrar la validacion del usuario");
//			System.out.println(e.getMessage());
//			LOGGER.error(codError, e);
//		}
//		return response;
//	}
//
//	@RequestMapping(value = "/insertarUsuarioEstandar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	@ResponseStatus(value = HttpStatus.OK)
//	public InsertarUsuarioEstandarResponse insertarUsuarioEstandar(@RequestBody InsertarUsuarioEstandarRequest request,
//			@RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token,
//			@RequestHeader("idInstancia") String idInstancia) {
//		InsertarUsuarioEstandarResponse response = new InsertarUsuarioEstandarResponse();
//		request.setCodUsuario(codUsuario);
//		request.setToken(token);
//		try {
//			response = usuarioServices.insertarUsuarioEstandarServices(request);
//		} catch (Exception e) {
//			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
//			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
//			response.setCodError(codError);
//			response.setMensaje("No ha sido posible la inserción de usuario");
//			System.out.println(e.getMessage());
//			LOGGER.error(codError, e);
//		}
//		return response;
//	}

	
}
