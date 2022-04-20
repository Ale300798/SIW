import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Column;

/*
 * l'ente si occupa di corsi principalmente, 
 * quindi insieme a un docente nella maggior parte dei casi mi servono i corsi che tiene, eventi in cascata, essendo docenti per piu corsi, non mi sembrano opportuni
 * 
 */


@Entity
public class DocenteConsulente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String cognome;
	private String dataDiNascita;
	private String luogoDinascita;
	private int partitaIva;
	
	
	// docente e corso bidir
	@OneToMany(mappedBy="docente", fetch=FetchType.EAGER)
	private List<Corso> corsiCheTiene;
	
	
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
	public String getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	public String getLuogoDinascita() {
		return luogoDinascita;
	}
	public void setLuogoDinascita(String luogoDinascita) {
		this.luogoDinascita = luogoDinascita;
	}
	public int getPartitaIva() {
		return partitaIva;
	}
	public void setPartitaIva(int partitaIva) {
		this.partitaIva = partitaIva;
	}

}
