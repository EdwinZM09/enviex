package com.enviex.paqueteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Venta {

	@Id
	@GeneratedValue
	@Column (name = "id_venta")
	private Long idVenta;

	@Column (name = "monto_pago")
	private int montoPago;
	private String tipoPago;
	
	@Column(name = "create_timestamp")
	private String createTimestamp;
	@Column(name = "update_timestamp")
	private String updateTimeStamp;
	
	public Venta() {}

	// Overload (Sobrecarga) (Polimorfismo)
	public Venta(int montoPago, String tipoPago) {
		super();
		this.montoPago = montoPago;
		this.tipoPago = tipoPago;
	}
	
	

	/**
	 * @return the idVenta
	 */
	public Long getIdVenta() {
		return idVenta;
	}

	/**
	 * @param idVenta the idVenta to set
	 */
	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	/**
	 * @return the montoPago
	 */
	public int getMontoPago() {
		return montoPago;
	}

	/**
	 * @param montoPago the montoPago to set
	 */
	public void setMontoPago(int montoPago) {
		this.montoPago = montoPago;
	}

	/**
	 * @return the tipoPago
	 */
	public String getTipoPago() {
		return tipoPago;
	}

	/**
	 * @param tipoPago the tipoPago to set
	 */
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
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
		// Overriding (Sobrescritura)   ====> HERENCIA
		return "Venta [idVenta=" + idVenta + ", montoPago=" + montoPago + ", tipoPago=" + tipoPago
				+ ", createTimestamp=" + createTimestamp + ", updateTimeStamp=" + updateTimeStamp + "]";
	}
	
	
}
