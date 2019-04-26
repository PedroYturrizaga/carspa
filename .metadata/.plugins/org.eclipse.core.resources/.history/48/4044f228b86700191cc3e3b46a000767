/**
 * 
 */
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
import pe.com.tintegro.dto.request.EliminarPedidoPorClienteRequest;
import pe.com.tintegro.dto.request.InsertarPedidoPorClienteRequest;
import pe.com.tintegro.dto.request.ListarPedidoPorClienteRequest;
import pe.com.tintegro.dto.request.ListarPlanRequest;
import pe.com.tintegro.dto.request.ListarTipoDetallePedidoRequest;
import pe.com.tintegro.dto.request.ListarTipoPedidoRequest;
import pe.com.tintegro.dto.response.EliminarPedidoPorClienteResponse;
import pe.com.tintegro.dto.response.InsertarPedidoPorClienteResponse;
import pe.com.tintegro.dto.response.ListarPedidoPorClienteResponse;
import pe.com.tintegro.dto.response.ListarPlanResponse;
import pe.com.tintegro.dto.response.ListarTipoDetallePedidoResponse;
import pe.com.tintegro.dto.response.ListarTipoPedidoResponse;
import pe.com.tintegro.services.PedidosPorClienteService;
import pe.com.tintegro.services.util.Util;

/**
 * @author FReyes
 *
 */
@RestController
@RequestMapping("/pedidosPorCliente")
public class PedidosPorClienteController
{

	protected transient final Logger LOGGER = Logger.getLogger(this.getClass());

	@Resource(name = "pedidosPorClienteService")
	protected PedidosPorClienteService pedidosPorClienteService;

	@RequestMapping(value = "/listar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarPedidoPorClienteResponse listarPedidoPorCliente(@RequestBody ListarPedidoPorClienteRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
			throws Exception
	{
		ListarPedidoPorClienteResponse response = new ListarPedidoPorClienteResponse();
		try
		{
			response = pedidosPorClienteService.listarPedidoPorCliente(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Consulta de Pedido por Cliente Realizada");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible mostrar los pedidos del cliente");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/insertar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public InsertarPedidoPorClienteResponse insertarPedidoPorCliente(@RequestBody InsertarPedidoPorClienteRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token) throws Exception
	{
		InsertarPedidoPorClienteResponse response = new InsertarPedidoPorClienteResponse();
		try
		{
			response = pedidosPorClienteService.insertarPedidoPorCliente(request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible insertar los pedidos del cliente");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/eliminar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public EliminarPedidoPorClienteResponse eliminarPedidoPorCliente(@RequestBody EliminarPedidoPorClienteRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token) throws Exception
	{
		EliminarPedidoPorClienteResponse response = new EliminarPedidoPorClienteResponse();
		try
		{
			response = pedidosPorClienteService.eliminarPedidoPorCliente(request);
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible eliminar el pedido del cliente");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/listarTipoPedido", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarTipoPedidoResponse listarTipoPedido(@RequestBody ListarTipoPedidoRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
			throws Exception
	{
		ListarTipoPedidoResponse response = new ListarTipoPedidoResponse();
		try
		{
			response = pedidosPorClienteService.listarTipoPedido(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Listado exitoso");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar los tipos de pedido");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/listarTipoDetallePedido", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarTipoDetallePedidoResponse listarTipoDetallePedido(@RequestBody ListarTipoDetallePedidoRequest request, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("token") String token) throws Exception
	{
		ListarTipoDetallePedidoResponse response = new ListarTipoDetallePedidoResponse();
		try
		{
			response = pedidosPorClienteService.listarTipoDetallePedido(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Listado exitoso");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar los tipos de pedido");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}

	@RequestMapping(value = "/listarPlan", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ListarPlanResponse listarPlan(@RequestBody ListarPlanRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token) throws Exception
	{
		ListarPlanResponse response = new ListarPlanResponse();
		try
		{
			response = pedidosPorClienteService.listarPlan(request);
			response.setEstado(Constantes.ESTADO_TRAMA_OK);
			response.setMensaje("Listado exitoso");
		}
		catch (Exception e)
		{
			response.setEstado(Constantes.ESTADO_TRAMA_ERROR_APP);
			String codError = Constantes.ID_ERROR_APP + Util.getCodigoErrorByDate();
			response.setCodError(codError);
			response.setMensaje("No ha sido posible listar los planes");
			System.out.println(e.getMessage());
			LOGGER.error(codError, e);
		}
		return response;
	}
}
