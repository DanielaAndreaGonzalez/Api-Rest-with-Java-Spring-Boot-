/**
 * 
 */
package com.example.Api_Spring.repositories;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Api_Spring.Models.UsuarioModel;
/**
 * @author GonzalezHDanielaA
 *
 */
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
	
	public  abstract ArrayList<UsuarioModel> findByPriority(Integer prioridad);
	
	
	
	

}
