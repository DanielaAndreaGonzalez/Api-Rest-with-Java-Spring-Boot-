/**
 * 
 */
package com.example.Api_Spring.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api_Spring.Models.UsuarioModel;
import com.example.Api_Spring.Services.UsuarioService;

/**
 * @author GonzalezHDanielaA
 *
 */
@RestController
@RequestMapping("/usuario") // in that direction of server is activate this class ; en qué direccion se activará esta clase
public class UsuarioController {
	
	@Autowired // se isntancia automaticamente
	UsuarioService usuarioService;
	
	@GetMapping()
	public ArrayList<UsuarioModel> obtainUsers(){		
		return usuarioService.obtainUsers();
	}
	/*
	 * tha parametrer into the method, mains that everybody costumers can send information into the body of
	 * requests of http
	 * el parametro dentro del metodo significa que todos los cloientes pueden enviar informacion dentro del cuerpo de 
	 * las solicitudes de http
	 */
	@PostMapping()
	public UsuarioModel saveUser(@RequestBody UsuarioModel user)
	{
		return this.usuarioService.saveUser(user);
	}

	
	

}