package pe.com.carspa.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.com.carspa.dao.ProveedorDAO;
import pe.com.carspa.dominio.Confirmacion;
import pe.com.carspa.dominio.Proveedor;
import pe.com.carspa.dto.request.ActualizarProveedorRequest;
import pe.com.carspa.dto.request.EliminarProveedorRequest;
import pe.com.carspa.dto.request.InsertarProveedorRequest;
import pe.com.carspa.dto.request.ListarProveedorRequest;
import pe.com.carspa.dto.response.ActualizarProveedorResponse;
import pe.com.carspa.dto.response.EliminarProveedorResponse;
import pe.com.carspa.dto.response.InsertarProveedorResponse;
import pe.com.carspa.dto.response.ListarProveedorResponse;
import pe.com.carspa.mapper.ProveedorMapper;

@Repository("ProveedorDAO")
@Transactional
public class ProveedorDAOImpl implements ProveedorDAO {

	@Autowired
	ProveedorMapper proveedorMapper;

	@Override
	public InsertarProveedorResponse insertProveedor(InsertarProveedorRequest request) throws Exception {
		InsertarProveedorResponse response = new InsertarProveedorResponse();
		Confirmacion confirmacion = proveedorMapper.insertProveedor(request.getProveedor().getNombreProveedor(),
				request.getProveedor().getDireccion(), request.getProveedor().getEmail(),
				request.getProveedor().getTelefono(), request.getProveedor().getContacto(),
				request.getProveedor().getIdTipoPago());
		response.setConfirmacion(confirmacion);
		return response;
	}

	@Override
	public EliminarProveedorResponse deleteProveedor(EliminarProveedorRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActualizarProveedorResponse updateProveedor(ActualizarProveedorRequest request) throws Exception {
		ActualizarProveedorResponse response = new ActualizarProveedorResponse();
		Confirmacion confirmacion = proveedorMapper.updateProveedor(request.getProveedor().getIdProveedor(),
				request.getProveedor().getNombreProveedor(), request.getProveedor().getDireccion(),
				request.getProveedor().getEmail(), request.getProveedor().getTelefono(),
				request.getProveedor().getContacto(), request.getProveedor().getIdTipoPago());
		response.setConfirmacion(confirmacion);
		return response;
	}

	@Override
	public ListarProveedorResponse listarProveedor(ListarProveedorRequest request) throws Exception {
		ListarProveedorResponse response = new ListarProveedorResponse();
		List<Proveedor> listaMateriales = proveedorMapper.listarProveedor(request.getNombreProveedor(),
				request.getNuPagina(), request.getNuRegisMostrar());
		response.setProveedor(listaMateriales);
		return response;
	}

}
