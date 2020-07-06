package com.enviex.paqueteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Venta")
public class Venta {

	@Id
	@GeneratedValue
	@Column (name = "id_venta")
	private Long idVenta;
	
	private int montoPagar;
	private String tipoPago;
	
	@Column(name = "create_timestamp")
	private String createTimestamp;
	@Column(name = "update_timestamp")
	private String updateTimeStamp;
	
	
	public Long getIdVenta() {
		return idVenta;
	}
	
	
	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
			
	}
	
	
	public int getMontoPagar() {
		return montoPagar;
		
	}
	
	
	public void setMontoPagar(int montoPagar) {
		this.montoPagar = montoPagar;
		
	}
	
	
	public String getTipoPago() {
		return tipoPago;
		
	}
	
	
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
		
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
