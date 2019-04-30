package pe.com.carspa.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.carspa.services.MaterialService;

@RestController
@RequestMapping("/material")
public class MaterialController {
	protected transient final Logger LOGGER = Logger.getLogger(MaterialController.class);
//	@Autowired
//	private HttpServletRequest servletRequest;

//	@Autowired
//	private APIProperties apiProperties;

	@Resource(name = "materialService")
	protected MaterialService materialService;
}