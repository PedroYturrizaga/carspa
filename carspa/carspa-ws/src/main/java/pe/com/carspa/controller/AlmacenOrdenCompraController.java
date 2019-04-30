package pe.com.carspa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.carspa.services.AlmacenOrdenCompraService;


@RestController
@RequestMapping("/almacenOrdenCompra")
public class AlmacenOrdenCompraController {

	//private final Logger LOG = Logger.getLogger(AlmacenOrdenCompraController.class);

	@Autowired
	private HttpServletRequest servletRequest;
	
	
	@Autowired
	private AlmacenOrdenCompraService almacenOrdenCompraService;

}
