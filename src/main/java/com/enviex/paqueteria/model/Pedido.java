package com.enviex.paqueteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Pedido")
public class Pedido {
	
	@Id
	@GeneratedValue
	@Column (name = "id_pedido")
	private Long idPedido;
	
	@Column (name = "descripcion_pedido")
	private String descripcionPedido;
	
	private String nombreBazar;
	
	@Column(name = "create_timestamp")
	private String createTimestamp;
	@Column(name = "update_timestamp")
	private String updateTimeStamp;
	
	public Pedido () {}
	
	public Pedido (String descripcionPedido, String nombreBazar) {
		super();
		this.descripcionPedido = descripcionPedido;
		this.nombreBazar = nombreBazar;
		
	}

	/**
	 * @return the idPedido
	 */
	public Long getIdPedido() {
		return idPedido;
	}

	/**
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	/**
	 * @return the descripcionPedido
	 */
	public String getDescripcionPedido() {
		return descripcionPedido;
	}

	/**
	 * @param descripcionPedido the descripcionPedido to set
	 */
	public void setDescripcionPedido(String descripcionPedido) {
		this.descripcionPedido = descripcionPedido;
	}

	/**
	 * @return the nombreBazar
	 */
	public String getNombreBazar() {
		return nombreBazar;
	}

	/**
	 * @param nombreBazar the nombreBazar to set
	 */
	public void setNombreBazar(String nombreBazar) {
		this.nombreBazar = nombreBazar;
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
	
	
	
}

