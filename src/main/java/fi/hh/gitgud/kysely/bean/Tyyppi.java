package fi.hh.gitgud.kysely.bean;

public class Tyyppi {
	private int id;
	private String nimi;
	public Tyyppi() {
		super();
		
	}
	public Tyyppi(int id, String nimi) {
		super();
		this.id = id;
		this.nimi = nimi;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	@Override
	public String toString() {
		return "Tyyppi [id=" + id + ", nimi=" + nimi + "]";
	}
}
