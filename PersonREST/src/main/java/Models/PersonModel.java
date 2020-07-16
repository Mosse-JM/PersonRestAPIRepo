package Models;

public class PersonModel {
	private int id;
	private String Nome;
	private String Cognome;
	private String CodiceFiscale;
	private String Ruolo;
	
	
	public PersonModel(int id, String nome, String cognome, String codiceFiscale, String ruolo) {
		super();
		this.id = id;
		Nome = nome;
		Cognome = cognome;
		CodiceFiscale = codiceFiscale;
		Ruolo = ruolo;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getCodiceFiscale() {
		return CodiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		CodiceFiscale = codiceFiscale;
	}
	public String getRuolo() {
		return Ruolo;
	}
	public void setRuolo(String ruolo) {
		Ruolo = ruolo;
	}
}
