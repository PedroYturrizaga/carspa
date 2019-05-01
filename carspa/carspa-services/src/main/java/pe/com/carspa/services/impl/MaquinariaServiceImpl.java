package pe.com.carspa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.carspa.dao.MaquinariaDAO;
import pe.com.carspa.dto.request.EliminarMaquinariaRequest;
import pe.com.carspa.dto.request.InsertarActualizarMaquinariaRequest;
import pe.com.carspa.dto.request.ListarMaquinariaRequest;
import pe.com.carspa.dto.response.ListarMaquinariaResponse;
import pe.com.carspa.dto.response.ResponseBase;
import pe.com.carspa.services.MaquinariaService;

public class MaquinariaServiceImpl implements MaquinariaService {

	@Autowired
	MaquinariaDAO maquinariaDAO;
	@Override
	public ResponseBase desactivarMaquinaria(EliminarMaquinariaRequest request) throws Exception {
		// TODO Auto-generated method stub
		return maquinariaDAO.desactivarMaquinaria(request);
	}

	@Override
	public ResponseBase activarMaquinaria(EliminarMaquinariaRequest request) throws Exception {
		// TODO Auto-generated method stub
		return maquinariaDAO.activarMaquinaria(request);
	}

	@Override
	public ResponseBase insertMaquinaria(InsertarActualizarMaquinariaRequest request) throws Exception {
		// TODO Auto-generated method stub
		return maquinariaDAO.insertMaquinaria(request);
	}

	@Override
	public ResponseBase updateMaquinaria(InsertarActualizarMaquinariaRequest request) throws Exception {
		// TODO Auto-generated method stub
		return maquinariaDAO.updateMaquinaria(request);
	}

	@Override
	public ListarMaquinariaResponse listarMaquinaria(ListarMaquinariaRequest request) throws Exception {
		// TODO Auto-generated method stub
		return maquinariaDAO.listarMaquinaria(request);
	}

}