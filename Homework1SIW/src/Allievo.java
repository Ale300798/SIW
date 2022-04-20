import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Column;

/* Politiche di fetch e cascade per questa classe: 
 * tra allievo e societa ho gia eager e credo vada bene cosi
 * per l'associazione tra allievo e corso ho impostato eager perche ho ipotizzato che se uno studente viene caricato dal database probabilmente servono anche i corsi dato che l'ente si occupa di erogare i corsi
 *  
 */

@Entity
public class Allievo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String cognome;
	private String luogoDiNascita;
	private String dataDiNascita;
	private int matricola;
	private String indirizzzoDiPostaE;
	
	// allievo e corso bidir
	@ManyToMany(mappedBy="allieviIscritti")
	private List<Corso> corsiACuiPartecipa;
	
	// allievo e società monodirezionale
	@OneToOne
	private Societa societa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}
	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}
	public String getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public String getIndirizzzoDiPostaE() {
		return indirizzzoDiPostaE;
	}
	public void setIndirizzzoDiPostaE(String indirizzzoDiPostaE) {
		this.indirizzzoDiPostaE = indirizzzoDiPostaE;
	}
}
