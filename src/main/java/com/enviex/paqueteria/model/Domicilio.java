package com.enviex.paqueteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Domicilio")
public class Domicilio {

	@Id
	@GeneratedValue
	@Column (name = "id_domicilio")
	private Long idDomicilio;
	
	private String calle;
	private String colonia;
	private String alcaldia;
	private int codigoPostal;
	private String ciudad;
	
	@Column(name = "create_timestamp")
	private String createTimestamp;
	@Column(name = "update_timestamp")
	private String updateTimeStamp;
	
	public Domicilio () {}
		
		public Domicilio (String calle, String colonia, String alcaldia, int codigoPostal, String ciudad) {
			super ();
			this.calle=calle;
			this.colonia=colonia;
			this.alcaldia=alcaldia;
			this.codigoPostal=codigoPostal;
			this.ciudad=ciudad;
			
		}
		

		public Long getIdDomicilio() {
			return idDomicilio;
			
		}
		

		public void setIdDomicilio(Long idDomicilio) {
			this.idDomicilio = idDomicilio;
		
		}
		

		public String getCalle() {
			return calle;
			
		}

		
		public void setCalle(String calle) {
			this.calle = calle;
			
		}
		

		public String getColonia() {
			return colonia;
			
		}

		
		public void setColonia(String colonia) {
			this.colonia = colonia;
			
		}
		

		public String getAlcaldia() {
			return alcaldia;
			
		}
		

		public void setAlcaldia(String alcaldia) {
			this.alcaldia = alcaldia;
			
		}

		
		public int getCodigoPostal() {
			return codigoPostal;
			
		}
		

		public void setCodigoPostal(int codigoPostal) {
			this.codigoPostal = codigoPostal;
			
		}

		
		public String getCiudad() {
			return ciudad;
			
		}

		
		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
			
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


