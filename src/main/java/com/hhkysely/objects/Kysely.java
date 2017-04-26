package com.hhkysely.objects;

import java.util.ArrayList;

public class Kysely {
	
	private String teksti;
	private String tyyppi;
	private String tila;
	private ArrayList<Kysymys> kysymykset;
	public String getTila() {
		return tila;
	}

	public void setTila(String tila) {
		this.tila = tila;
	}

	private int id;


public Kysely (String teksti,String tyyppi,String tila){
	super();
	this.teksti = teksti;
	this.tyyppi = tyyppi;
	this.tila = tila;

}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getTeksti (){
	return teksti;
}
public void setTeksti(String teksti){
	this.teksti = teksti;
}
public String getTyyppi(){
	return tyyppi;
}
public void setTyyppi(String tyyppi){
	this.tyyppi = tyyppi;
}
	
@Override
public String toString() {
	return "Vaihtoehto [id=" + id + ", teksti=" + teksti+ "]";
}
}
