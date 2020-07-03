package com.enviex.paqueteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * It represents the table Cliente
 * @author douzez
 *
 */

@Entity
@Table(name = "cliente")
public class Cliente{
	
	@Id
	@GeneratedValue
	@Column(name = "id_cliente")
	private Long idCliente;
	
	private String nombre;
	private String apellido;
	private Long telefono;
	
	@Column(name = "create_timestamp")
	private String createTimestamp;
	@Column(name = "update_timestamp")
	private String updateTimeStamp;
	
	
	/**
	 * Empty Constructor for Persistence 
	 */
	public Cliente() {}
	
	public Cliente(String nombre, String apellido, Long telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}




	/**
	 * @return the idCliente
	 */
	public Long getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * @return the telefono
	 */
	public long getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}


	/**
	 * @return the createTimestamp
	 */
	public String getCreateTimestamp() {
		return createTimestamp;
	}


	/**
	 * @param createTimestamp the createTimestamp to set
	 */
	public void setCreateTimestamp(String createTimestamp) {
		this.createTimestamp = createTimestamp;
	}


	/**
	 * @return the updateTimeStamp
	 */
	public String getUpdateTimeStamp() {
		return updateTimeStamp;
	}


	/**
	 * @param updateTimeStamp the updateTimeStamp to set
	 */
	public void setUpdateTimeStamp(String updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", createTimestamp=" + createTimestamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
}
