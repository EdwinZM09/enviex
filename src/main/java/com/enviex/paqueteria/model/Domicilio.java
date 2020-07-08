package com.enviex.paqueteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Domicilio")
public class Domicilio {

	@Id
	@GeneratedValue
	@Column(name = "id_domicilio")
	private Long idDomicilio;

	private String calle;
	private String colonia;
	private String alcaldia;

	@Column(name = "codigo_postal")
	private int codigoPostal;

	private String ciudad;

	@Column(name = "create_timestamp")
	private String createTimestamp;
	@Column(name = "update_timestamp")
	private String updateTimeStamp;

	public Domicilio() {}

	public Domicilio(String calle, String colonia, String alcaldia, int codigoPostal, String ciudad) {
		super();
		this.calle = calle;
		this.colonia = colonia;
		this.alcaldia = alcaldia;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
	}

	/**
	 * @return the idDomicilio
	 */
	public Long getIdDomicilio() {
		return idDomicilio;
	}

	/**
	 * @param idDomicilio the idDomicilio to set
	 */
	public void setIdDomicilio(Long idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the colonia
	 */
	public String getColonia() {
		return colonia;
	}

	/**
	 * @param colonia the colonia to set
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	/**
	 * @return the alcaldia
	 */
	public String getAlcaldia() {
		return alcaldia;
	}

	/**
	 * @param alcaldia the alcaldia to set
	 */
	public void setAlcaldia(String alcaldia) {
		this.alcaldia = alcaldia;
	}

	/**
	 * @return the codigoPostal
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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
