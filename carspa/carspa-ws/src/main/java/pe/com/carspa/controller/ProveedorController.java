package pe.com.carspa.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.carspa.services.ProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
	protected transient final Logger LOGGER = Logger.getLogger(ProveedorController.class);

	@Resource(name = "proveedorService")
	protected ProveedorService proveedorService;
}
