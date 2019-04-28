package pe.com.tintegro.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pe.com.tintegro.dominio.Usuario;

public interface UsuarioMapper
{
	public List<Usuario> validarUsuarioLogin(@Param("pNoLogin") String pNoLogin);

	public List<Usuario> insertarUsuarioEstandar(
			                @Param("pNoLogin") String pNoLogin,
			                @Param("pNoPasswo") String pNoPasswo, 
			                @Param("pNoNombre") String pNoNombre, 
			                @Param("pNoApelli") String pNoApelli, 
			                @Param("pNoEmail") String pNoEmail, 
			                @Param("pNoProfe") String pNoProfe, 
			                @Param("pIdRol") Integer pIdRol, 
			                @Param("pNoLoginCreador") String pNoLoginCreador,
			                @Param("pIdInstancia") Integer pIdInstancia);

	public List<Usuario> listarUsuarioEstandar(@Param("pNoLoginCreador") String pNoLoginCreador, @Param("pIdInstancia") Integer idInstancia,@Param("pIdUsuario") Integer idUsuario,@Param("pTiOpera") Integer tiOpera);

	public List<Usuario> eliminarUsuarioEstandar(
			                @Param("pIdUsuario") Integer pIdUsuario,
			                @Param("pNoLoginCreador") String pNoLoginCreador,
			                @Param("pIdInstancia") Integer pIdInstancia);

	public List<Usuario> actualizarUsuarioEstandar(
			                @Param("pIdUsuario") Integer pIdUsuraio,
			                @Param("pNoPasswo") String pNoPasswo, 
			                @Param("pNoNombre") String pNoNombre,
			                @Param("pNoApelli") String pNoApelli, 
			                @Param("pNoEmail") String pNoEmail, 
			                @Param("pNoProfe") String pNoProfe, 
			                @Param("pIdRol") Integer pIdRol,
			                @Param("pNoLoginCreador") String pNoLoginCreador, 
			                @Param("pIdInstancia") Integer pIdInstancia);
	
	public List<Usuario> listarUsuarioPorCodigo(@Param("pCodUsuario") String pCodUsuario,@Param("pIdUsuario") Integer pIdUsuario);

	public List<Usuario> actualizarPassword(
			@Param("pNewPassword") String pNewPassword,
            @Param("pCodUsuario") String pCodUsuario,
            @Param("pConfirmacion") Boolean pConfirmación,
            @Param("pToken") String pToken);
	
}
