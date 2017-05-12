package com.hhkysely.objects;

import java.util.ArrayList;

public class Vastaus {

	private int id;
	private String teksti;
	private int kysymysid;
	private int vastaajaid;
	private ArrayList<Vaihtoehto> vaihtoehdot;

	

	public Vastaus() {
		super();
		this.id = 0;
		this.teksti = null;
		this.kysymysid = 0;
		this.vastaajaid = 0;
		this.vaihtoehdot = new ArrayList<Vaihtoehto>();
	}
	
	public Vastaus(int id, int kysymysid, String teksti, int vastaajaid, ArrayList<Vaihtoehto> vaihtoehdot) {
		super();
		this.id = id;
		this.teksti = teksti;
		this.kysymysid = kysymysid;
		this.vastaajaid = vastaajaid;
		if(vaihtoehdot != null ){
			this.vaihtoehdot = vaihtoehdot;
		}else {
			this.vaihtoehdot = new ArrayList<Vaihtoehto>();
		}
		
	}
	
	public void addVaihtoehto(Vaihtoehto vaihtoehto) {
		if (vaihtoehto != null) {
			this.vaihtoehdot.add(vaihtoehto);
		}
	}
	
	public Vaihtoehto getVaihtoehto(int index) {
		if (index >= 0 && index < this.vaihtoehdot.size()){
			return this.vaihtoehdot.get(index);
		}else{
			System.out.println("indeksi ei kelpaa!");
		}
		
		return null;
	}
	
	public int getVastaajaid() {
		return vastaajaid;
	}
	public void setVastaajaid(int vastaajaid) {
		this.vastaajaid = vastaajaid;
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
		return "Vastaus [id=" + id + ", teksti=" + teksti + ", kysymysid="
				+ kysymysid + ", vastaajaid=" + vastaajaid + ", vaihtoehdot="
				+ vaihtoehdot + "]";
	}
	
	
	
	
}
