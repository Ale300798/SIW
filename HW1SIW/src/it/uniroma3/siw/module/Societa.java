package it.uniroma3.siw.module;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Column;

@Entity
public class Societa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String ragioneSociale;
	private String indirizzo;
	private String comune;
	private String cap;
	private String provincia;
	private int numeroDitelefono;
	
	
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getNumeroDitelefono() {
		return numeroDitelefono;
	}
	public void setNumeroDitelefono(int numeroDitelefono) {
		this.numeroDitelefono = numeroDitelefono;
	}

}
