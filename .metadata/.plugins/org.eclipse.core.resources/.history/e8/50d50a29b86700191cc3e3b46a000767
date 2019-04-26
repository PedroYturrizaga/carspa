package pe.com.tintegro.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadFileController
{

	private static final Logger logger = LoggerFactory.getLogger(UploadFileController.class);

	@RequestMapping(value = "/uploadFile", method = RequestMethod.GET)
	public @ResponseBody String uploadFileHandler(@RequestParam("name") String name, @RequestParam("file") MultipartFile file, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("idInstancia") String idInstancia)
	{
		if (!file.isEmpty())
		{
			try
			{
				byte[] bytes = file.getBytes();

				// Creación del directorio para almacenar el archivo
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Crear el archivo en el servidor
				File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location=" + serverFile.getAbsolutePath());
				return "Subido Correctamente el archivo=" + name;
			}
			catch (Exception e)
			{
				return "No se encontro el archivo " + name + " => " + e.getMessage();
			}
		}
		else
		{
			return "Error en subir el archivo " + name + " porque el archivo esta vacio.";
		}
	}

	@RequestMapping(value = "/uploadMultipleFile", method = RequestMethod.POST)
	public @ResponseBody String uploadMultipleFileHandler(@RequestParam("name") String[] names, @RequestParam("file") MultipartFile[] files, @RequestHeader("codUsuario") String codUsuario,
			@RequestHeader("idInstancia") String idInstancia)
	{
		if (files.length != names.length)
			return "información obligatoria";

		String message = "";
		for (int i = 0; i < files.length; i++)
		{
			MultipartFile file = files[i];
			String name = names[i];
			try
			{
				byte[] bytes = file.getBytes();
				// Creación del directorio para almacenar el archivo
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Crear el archivo en el servidor
				File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Ubicación del archivo del servidor=" + serverFile.getAbsolutePath());
				message = message + "Has subido correctamente el archivo=" + name + "";
			}
			catch (Exception e)
			{
				return "No se ha podido subir el archivo " + name + " => " + e.getMessage();
			}
		}
		return message;

	}
}
