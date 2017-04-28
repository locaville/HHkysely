package com.hhkysely.objects;

import java.util.ArrayList;

public class KysymysImpl implements Kysymys {
	private int id;
	private String teksti;
	private int tyyppiid;
	/*private Tyyppi tyyppi;
	private ArrayList<Vaihtoehto> vaihtoehdot;
	*/
	
	public KysymysImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public KysymysImpl(int id, String teksti, int tyyppiid) {
		super();
		this.id = id;
		this.teksti = teksti;
		this.tyyppiid = tyyppiid;
	}

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
	
	/*
	public Tyyppi getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(Tyyppi tyyppi) {
		this.tyyppi = tyyppi;
	}
	*/
	
	public int getTyyppiid() {
		return tyyppiid;
	}

	public void setTyyppiid(int tyyppiid) {
		this.tyyppiid = tyyppiid;
	}
	
	@Override
	public String toString() {
		return "Kysymys [id=" + id + ", teksti=" + teksti + ", kyselyid=" + ", tyyppiid=" + tyyppiid + "]";
	}
	
	
}
