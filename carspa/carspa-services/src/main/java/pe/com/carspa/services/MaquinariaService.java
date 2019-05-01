package pe.com.carspa.services;

import pe.com.carspa.dto.request.EliminarMaquinariaRequest;
import pe.com.carspa.dto.request.InsertarActualizarMaquinariaRequest;
import pe.com.carspa.dto.request.ListarMaquinariaRequest;
import pe.com.carspa.dto.response.ListarMaquinariaResponse;
import pe.com.carspa.dto.response.ResponseBase;

public interface MaquinariaService {
public ResponseBase desactivarMaquinaria(EliminarMaquinariaRequest request)throws Exception;
	
	public ResponseBase activarMaquinaria(EliminarMaquinariaRequest request)throws Exception;
	
	public ResponseBase insertMaquinaria(InsertarActualizarMaquinariaRequest request)throws Exception;
	
	public ResponseBase updateMaquinaria(InsertarActualizarMaquinariaRequest request)throws Exception;

	public ListarMaquinariaResponse listarMaquinaria(ListarMaquinariaRequest request)throws Exception;

}