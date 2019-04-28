package pe.com.carspa.controller;

import javax.servlet.http.HttpServletRequest;
//import pe.com.carspa.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/material")
//@Api(value = "materiales")
public class MaterialController {
	@Autowired
	private HttpServletRequest servletRequest;

//	@Autowired
//	private APIProperties apiProperties;

//	@Autowired
//	private MaterialService materialService;
}
