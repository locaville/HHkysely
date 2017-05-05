package com.hhkysely.objects;

import java.util.ArrayList;

public class Vastaus {

	private int id;
	private String teksti;
	private ArrayList<Vaihtoehto> vaihtoehdot;
	private int kysymysid;
	public ArrayList<Vaihtoehto> getVaihtoehdot() {
		return vaihtoehdot;
	}
	public void setVaihtoehdot(ArrayList<Vaihtoehto> vaihtoehdot) {
		this.vaihtoehdot = vaihtoehdot;
	}
	public int getKysymysid() {
		return kysymysid;
	}
	public void setKysymysid(int kysymysid) {
		this.kysymysid = kysymysid;
	}
	public Vastaus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vastaus(int id, String teksti) {
		super();
		this.id = id;
		this.teksti = teksti;
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
	@Override
	public String toString() {
		return "Vastaus [id=" + id + ", teksti=" + teksti + "]";
	}
	
}
