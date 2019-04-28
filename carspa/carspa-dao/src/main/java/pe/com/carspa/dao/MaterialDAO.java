package pe.com.carspa.dao;

import pe.com.carspa.dto.request.EliminarMaterialRequest;
import pe.com.carspa.dto.request.InsertarActualizarMaterialRequest;
import pe.com.carspa.dto.request.ListarMaterialRequest;
import pe.com.carspa.dto.response.ListarMaterialResponse;
import pe.com.carspa.dto.response.ResponseBase;

public interface MaterialDAO {

	public ResponseBase activarMaterial(EliminarMaterialRequest request)throws Exception;
	public ResponseBase desactivarMaterial(EliminarMaterialRequest request)throws Exception;
	public ResponseBase insertMaterial(InsertarActualizarMaterialRequest request)throws Exception;
	public ResponseBase updateMaterial(InsertarActualizarMaterialRequest request)throws Exception;
	public ListarMaterialResponse listarMateriales(ListarMaterialRequest request)throws Exception;




}
