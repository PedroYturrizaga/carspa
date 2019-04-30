package pe.com.carspa.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/almacenOrdenCompra")
public class AlmacenOrdenCompraController {

	private final Logger LOG = Logger.getLogger(AlmacenOrdenCompraController.class);

	@Autowired
	private HttpServletRequest servletRequest;
	
	
	//@Autowired
	//private AlmacenOrdenCompraService almacenOrdenCompraService;

}
