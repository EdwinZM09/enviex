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

	private Long IdPedido;
	private String descripcionPedido;
	private String nombreBazar;
	
	@Column(name = "create_timestamp")
	private String createTimestamp;
	@Column(name = "update_timestamp")
	private String updateTimeStamp;
	
	public Pedido () {}
	
	public Pedido (String descripcionPedido, String nombreBazar) {
		super ();
		this.descripcionPedido = descripcionPedido;
		this.nombreBazar = nombreBazar;
		
	}
	
	public Long getIdPedido() {
		return IdPedido;
		
	}
	
	public void setIdpedido(Long IdPedido) {
		this.IdPedido = IdPedido;
		
	}
	
	public String  getDescripcionPedido() {
		return descripcionPedido;
		
	}
	
	public void setDescripcionPedido(String descripcionPedido) {
		this.descripcionPedido = descripcionPedido;
		
	}
	
	public String getNombreBazar() {
		return nombreBazar;
		
	}
	
	public void setNombreBazar (String nombreBazar) {
		this.nombreBazar = nombreBazar;
		
	}

	public String getCreateTimestamp() {
		return createTimestamp;
		
	}
	

	public void setCreateTimestamp(String createTimestamp) {
		this.createTimestamp = createTimestamp;
		
	}

	
	public String getUpdateTimeStamp() {
		return updateTimeStamp;
		
	}

	
	public void setUpdateTimeStamp(String updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
		
	}
	
}

