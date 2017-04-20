package com.hhkysely.objects;

public class Vastaus {

	private int id;
	private String teksti;
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
