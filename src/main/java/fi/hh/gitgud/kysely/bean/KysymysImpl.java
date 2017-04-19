package fi.hh.gitgud.kysely.bean;

public class KysymysImpl implements Kysymys {
	private int id;
	private String teksti;
	private int kyselyid;
	private int tyyppiid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeksti() {
		return teksti;
	}
	public void setTeksti(String teksti) {
		this.teksti = teksti;
	}
	public int getKyselyid() {
		return kyselyid;
	}
	public void setKyselyid(int kyselyid) {
		this.kyselyid = kyselyid;
	}
	public int getTyyppiid() {
		return tyyppiid;
	}
	public void setTyyppiid(int tyyppiid) {
		this.tyyppiid = tyyppiid;
	}
	
	@Override
	public String toString() {
		return "Kysymys [id=" + id + ", teksti=" + teksti + ", kyselyid=" + kyselyid + ", tyyppiid=" + tyyppiid + "]";
	}
	
}
