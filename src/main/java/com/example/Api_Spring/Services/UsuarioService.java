/**
 * 
 */
package com.example.Api_Spring.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Api_Spring.Models.UsuarioModel;
import com.example.Api_Spring.repositories.UsuarioRepository;

/**
 * @author GonzalezHDanielaA
 *
 */

/*
 * label that allows know the rol about this class
 */
@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	/*
	 * method that allows obtain an users'list
	 */
	public ArrayList<UsuarioModel> obtainUsers()
	{
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}
	
	/*
	 * Metho that allows save an new user
	 */
	public UsuarioModel saveUser(UsuarioModel usuario)
	{
		return usuarioRepository.save(usuario);
	}
	
	/**
	 * Is the type optional because is exits is ok else nothing happens
	 * @param id
	 * @return
	 */
	public Optional<UsuarioModel> obtainById(Long id)
	{
		return usuarioRepository.findById(id);
	}
	
	/**
	 * finds the user by that priority
	 * @param priority
	 * @return
	 */
	public  ArrayList<UsuarioModel> obtainByPriority(Integer priority)
	{
		return usuarioRepository.findByPrioridad(priority);
	}
	
	/**
	 * Method does delete an user through by id
	 * @param id
	 * @return
	 */
	public boolean deleteUser(Long id)
	{
		try {
			usuarioRepository.deleteById(id);
			return true;
		}catch(Exception err)
		{
			return false;
		}
	
	}
	
	
	

}
