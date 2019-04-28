package pe.com.carspa.util;

public class Constantes {

	public static final String ID_ERROR_APP = "CARSPA";
	public static final int ESTADO_TRAMA_OK = 1;
	public static final int ESTADO_TRAMA_ERROR_APP = -1;
	public static final int ESTADO_TRAMA_ERROR_NEGOCIO = 0;
	public static final String MSG_OPERATION_DENIED = "Operación no permitida";

	/* Infraestructura */
	public static final String MSG_CONNECTION_INSTANCE_FAILED = "No se puede conectar con su servidor.";
	public static final String MSG_EXECUTE_COMMAND_SUCCESS = "OK";
	public static final String MSG_ERROR_CONFIG_INICIAL_INSTANCE = "Ocurrió un error durante la instalación y/o configuración.";
	public static final int EXECUTE_COMAND_SUCESS = 1;
	public static final int EXECUTE_COMAND_ERROR = 0;

	/**
	 * Constantes estáticas globales que representan los estados de una instancia.
	 * Estos estados deben coincidir con los que se encuentran en la base de datos
	 * general de la aplicación.
	 */
	public static final int INSTANCIA_POR_CONFIGURAR = 1;
	public static final int INSTANCIA_CONFIGURADA = 2;
	public static final int INSTANCIA_REVISADA = 3;
	public static final int INSTANCIA_ACTUALIZADA = 4;
	public static final int INSTANCIA_INSTALADA = 5;
}
