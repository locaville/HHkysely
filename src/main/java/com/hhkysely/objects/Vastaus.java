package com.hhkysely.objects;

import java.util.ArrayList;

public class Vastaus {

	private int id;
	private String teksti;
	private int kysymysid;
	private ArrayList<Vaihtoehto> vaihtoehdot;

	

	public Vastaus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vastaus(int id, String teksti) {
		super();
		this.id = id;
		this.teksti = teksti;
		this.kysymysid = 0;
		this.vaihtoehdot = new ArrayList<Vaihtoehto>();
	}
	
	public Vastaus(int id, int kysymysid, String teksti, ArrayList<Vaihtoehto> vaihtoehdot) {
		super();
		this.id = id;
		this.teksti = teksti;
		this.kysymysid = kysymysid;
		if(vaihtoehdot != null ){
			this.vaihtoehdot = vaihtoehdot;
		}else {
			this.vaihtoehdot = new ArrayList<Vaihtoehto>();
		}
		
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
	
	public int getKysymysid() {
		return kysymysid;
	}
	public void setKysymysid(int kysymysid) {
		this.kysymysid = kysymysid;
	}
	public ArrayList<Vaihtoehto> getVaihtoehdot() {
		return vaihtoehdot;
	}
	public void setVaihtoehdot(ArrayList<Vaihtoehto> vaihtoehdot) {
		this.vaihtoehdot = vaihtoehdot;
	}
	@Override
	public String toString() {
		return "Vastaus [id=" + id + ", teksti=" + teksti + ", kysymysid=" + kysymysid + ", vaihtoehdot=" + vaihtoehdot + "]";
	}
	
	
	
}
