package com.hhkysely.objects;

import java.util.ArrayList;

public class KysymysImpl implements Kysymys {
	private int id;
	private String teksti;
	private int kyselyid;
	private Tyyppi tyyppi;
	private ArrayList<Vaihtoehto> vaihtoehdot;
	
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
	public Tyyppi getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(Tyyppi tyyppi) {
		this.tyyppi = tyyppi;
	}
	
	@Override
	public String toString() {
		return "Kysymys [id=" + id + ", teksti=" + teksti + ", kyselyid=" + kyselyid + ", tyyppiid=" + tyyppi + "]";
	}
	
	
}
