/**
 * 
 */
package com.example.Api_Spring.Models;


import jakarta.persistence.*;
/**
 * @author GonzalezHDanielaA
 *
 */

@Entity
@Table(name="usuario")
public class usuarioModel {
	
	@Id  //Anotación que indica que es un id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica que se genera automaticamente y que se autoincremente
	@Column(unique = true,nullable = false) // indica que es unico y no puede ser nulo 
	private long id;
	private String nombre;
	private String email;
	private Integer prioridad;
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the prioridad
	 */
	public Integer getPrioridad() {
		return prioridad;
	}
	/**
	 * @param prioridad the prioridad to set
	 */
	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}
	
	

}
