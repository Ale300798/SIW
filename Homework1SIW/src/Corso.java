import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Column;

/*
 * Per le politiche di fetch e cascade:
 * un allievo segue piu corsi quindi eventi in cascata tra corso e studente rischio che siano inutili nella maggior parte dei casi,
 * ho impostato invece eager perche se carico un corso probabilmente mi servono anche gli studenti
 * tra corso e docente va bene il default per entrambe le politiche
 */


@Entity
public class Corso {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String dataInizio;
	private int durataMesi;
	
	
	// corso e allievi bidir
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Allievo> allieviIscritti;

	
	// corso e docente bidir
	@ManyToOne
	private DocenteConsulente docente;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}
	public int getDurata() {
		return durataMesi;
    }
	public void setDurata(int durata) {
		this.durataMesi = durata;
	}



}
