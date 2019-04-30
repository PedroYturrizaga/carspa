package pe.com.carspa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.carspa.dao.MaterialDAO;
import pe.com.carspa.dto.request.EliminarMaterialRequest;
import pe.com.carspa.dto.request.InsertarActualizarMaterialRequest;
import pe.com.carspa.dto.request.ListarMaterialRequest;
import pe.com.carspa.dto.request.ListarProveedorRequest;
import pe.com.carspa.dto.response.ListarMaterialResponse;
import pe.com.carspa.dto.response.ListarProveedorResponse;
import pe.com.carspa.dto.response.ResponseBase;
import pe.com.carspa.services.MaterialService;

@Service( "materialService" )
public class MaterialServiceImpl implements MaterialService{

	@Autowired
	MaterialDAO materialDAO;
	
	@Override
	public ResponseBase activarMaterial(EliminarMaterialRequest request)
			throws Exception {
		return materialDAO.activarMaterial(request);
	}

	@Override
	public ResponseBase desactivarMaterial(EliminarMaterialRequest request)
			throws Exception {
		return materialDAO.desactivarMaterial(request);
	}

	@Override
	public ResponseBase insertMaterial(InsertarActualizarMaterialRequest request)
			throws Exception {
		return materialDAO.insertMaterial(request);
	}

	@Override
	public ResponseBase updateMaterial(InsertarActualizarMaterialRequest request)
			throws Exception {
		return materialDAO.updateMaterial(request);
	}

	@Override
	public ListarMaterialResponse listarMateriales(ListarMaterialRequest request)
			throws Exception {
		return materialDAO.listarMateriales(request);
	}

	@Override
	public ListarProveedorResponse comboProveedor(ListarProveedorRequest request)
			throws Exception {
		return materialDAO.comboProveedor(request);
	}

}
