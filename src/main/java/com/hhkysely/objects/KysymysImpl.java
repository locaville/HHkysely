package com.hhkysely.objects;

import java.util.ArrayList;

public class KysymysImpl implements Kysymys {
	private int id;
	private String teksti;
	private int tyyppiid;
	//private Tyyppi tyyppi;
	private ArrayList<Vaihtoehto> vaihtoehdot;
	
	
	public KysymysImpl() {
		super();
		this.id = 0;
		this.teksti = null;
		this.tyyppiid = 0;
		this.vaihtoehdot = new ArrayList<Vaihtoehto>();
	}
	
	public KysymysImpl(int id, String teksti, int tyyppiid, ArrayList<Vaihtoehto> vaihtoehdot) {
		super();
		this.id = id;
		this.teksti = teksti;
		this.tyyppiid = tyyppiid;
		if (vaihtoehdot == null){
			this.vaihtoehdot = new ArrayList<Vaihtoehto>();
		}else {
			this.vaihtoehdot = vaihtoehdot;
		}
	}
	
	public void addVaihtoehto(Vaihtoehto vaihtoehto) {
		if (vaihtoehto != null) {
			this.vaihtoehdot.add(vaihtoehto);
		}
	}
	
	public Vaihtoehto getVaihtoehto(int index) {
		if (index >= 0 && index < this.vaihtoehdot.size()) {
			return this.vaihtoehdot.get(index);
		}else {
			System.out.println("Indeksi ei kelpaa!");
		}
		
		return null;
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
