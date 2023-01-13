/**
 * 
 */
package com.example.Api_Spring.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	/**
	 * User is deleted through it id, so in the road is necesary write the specified path and /"id"
	 * @param id
	 * @return
	 */
	@GetMapping(path = "/{id}")
	public Optional<UsuarioModel> obtainUserById(@PathVariable("id") Long id)
	{
		return this.usuarioService.obtainById(id);
	}
	
	/**
	 * This petition HTTP finds the register that have that priority send by this method 
	 * @param priority
	 * @return
	 */
	@GetMapping(path= "query")
	public ArrayList<UsuarioModel> obtainUserByPriority (@RequestParam("prioridad") Integer priority)
	{
		return this.usuarioService.obtainByPriority(priority);
	}
	
	/**
	 * Method that delete an user by id send through of this method 
	 * @param id
	 * @return
	 */
	@DeleteMapping(path = "/{id}")
	public String deleteById(@PathVariable("id") Long id) 
	{
			boolean ok = this.usuarioService.deleteUser(id);
			if(ok)
			{
				return "Se seliminó el usuario con id" +id;
			}
			else {
				return "No se pudo eliminar el usuario con id " +id;
			}
		
		
	}
	
	
	

}
