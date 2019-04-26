package pe.com.tintegro.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.com.tintegro.dao.util.Constantes;
import pe.com.tintegro.dto.request.InsertarPedidoPorClienteRequest;
import pe.com.tintegro.dto.request.ListaPedidoPorClienteRequest;
import pe.com.tintegro.dto.response.InsertarPedidoPorClienteResponse;
import pe.com.tintegro.dto.response.ListaPedidoPorClienteResponse;
import pe.com.tintegro.services.PedidoPorClienteService;
import pe.com.tintegro.services.PedidoPorClienteServices;
import pe.com.tintegro.services.util.Util;

@RestController
@RequestMapping("/pedidos")
public class PedidoPorClienteController
{
	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "pedidoxClienteService")
	protected PedidoPorClienteService pedidoxClienteService;

	@Resource(name = "pedidoPorClienteServices")
	protected PedidoPorClienteServices pedidoPorClienteServices;

	@RequestMapping(value = "/listaPedidoXCliente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListaPedidoPorClienteResponse listarInstanciaxCaso(@RequestBody ListaPedidoPorClienteRequest obj, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
	{
		ListaPedidoPorClienteResponse respuesta = new ListaPedidoPorClienteResponse();
		try
		{
			respuesta = pedidoxClienteService.listaPedidoxCliente(codUsuario, obj);
		}
		catch (Exception e)
		{
			respuesta.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			respuesta.setCodError(codError);
			respuesta.setMensaje("No ha sido posible mostrar los pedidos de los clientes");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return respuesta;
	}

	@RequestMapping(value = "/insertarPedido", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarPedidoPorClienteResponse insertaPedidos(@RequestParam InsertarPedidoPorClienteRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
	{
		InsertarPedidoPorClienteResponse response = new InsertarPedidoPorClienteResponse();
		try
		{
			response = pedidoPorClienteServices.insertarPedidoxCliente(codUsuario, request);
			response.setPedidos(response.getPedidos());
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar los Telefono Claves");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}
}
