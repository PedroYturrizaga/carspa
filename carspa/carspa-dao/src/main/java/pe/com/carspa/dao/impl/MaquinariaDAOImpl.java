package pe.com.carspa.dao.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.com.carspa.dao.MaquinariaDAO;
import pe.com.carspa.dominio.Confirmacion;
import pe.com.carspa.dominio.Maquinaria;


import pe.com.carspa.dto.request.EliminarMaquinariaRequest;
import pe.com.carspa.dto.request.InsertarActualizarMaquinariaRequest;
import pe.com.carspa.dto.request.ListarMaquinariaRequest;
import pe.com.carspa.dto.response.ListarMaquinariaResponse;
import pe.com.carspa.dto.response.ResponseBase;
import pe.com.carspa.mapper.MaquinariaMapper;

@Repository( "maquinariaDAO" )
@Transactional

public class MaquinariaDAOImpl implements MaquinariaDAO {

	@Autowired
	MaquinariaMapper maquinariaMapper;
	@Override
	public ResponseBase desactivarMaquinaria(EliminarMaquinariaRequest request) throws Exception {
		ResponseBase response = new ResponseBase();
		Confirmacion confirmacion = maquinariaMapper.desactivarMaquinaria(request.getIdMaquinaria());
		response.setConfirmacion(confirmacion);
		return response;
	}
	@Override
	public ResponseBase activarMaquinaria(EliminarMaquinariaRequest request) throws Exception {
		ResponseBase response = new ResponseBase();
		Confirmacion confirmacion = maquinariaMapper.activarMaquinaria(request.getIdMaquinaria());
		response.setConfirmacion(confirmacion);
		return response;
	}
	@Override
	public ResponseBase insertMaquinaria(InsertarActualizarMaquinariaRequest request) throws Exception {
		ResponseBase response = new ResponseBase();
		Confirmacion confirmacion = maquinariaMapper.insertMaquinaria(request.getMaquinaria().getNombre(), request.getMaquinaria().getMarca(), 
				request.getMaquinaria().getCantidad(),request.getMaquinaria().getFechaMantenimiento(),request.getMaquinaria().getDetalle());
		response.setConfirmacion(confirmacion);
		return response;
	}
	@Override
	public ResponseBase updateMaquinaria(InsertarActualizarMaquinariaRequest request) throws Exception {
		ResponseBase response = new ResponseBase();
		Confirmacion confirmacion = maquinariaMapper.updateMaquinaria(request.getMaquinaria().getIdMaquinaria(), request.getMaquinaria().getCantidad(), 
				request.getMaquinaria().getFechaMantenimiento(), request.getMaquinaria().getDetalle());
		response.setConfirmacion(confirmacion);
		return response;
	}
	@Override
	public ListarMaquinariaResponse listarMaquinaria(ListarMaquinariaRequest request) throws Exception {
		ListarMaquinariaResponse response = new ListarMaquinariaResponse();
		List<Maquinaria>listaMaquinaria=maquinariaMapper.listarMaquinaria(request.getNombre(),request.getEstado(),request.getNuPagina(), request.getNuRegisMostrar());
		response.setMaquinarias(listaMaquinaria);
		return response;
	}




}