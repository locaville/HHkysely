package com.hhkysely.objects;

import java.util.ArrayList;

public class Kysely {
	
	private int id;
	private String teksti;
	private String tyyppi;
	private String tila;
	private ArrayList<Kysymys> kysymykset;
		

public Kysely(int id, String teksti, String tyyppi, String tila,
		ArrayList<Kysymys> kysymykset) {
	super();
	this.id = id;
	this.teksti = teksti;
	this.tyyppi = tyyppi;
	this.tila = tila;
	if (kysymykset == null){
		this.kysymykset = new ArrayList<Kysymys>();
	}else {
		this.kysymykset = kysymykset;
	}
}

public Kysely() {
	super();
	this.id = 0;
	this.teksti = null;
	this.tyyppi = null;
	this.tila = null;
	this.kysymykset = new ArrayList<Kysymys>();
}

public void addKysymys(Kysymys kysymys) {
	if (kysymys != null) {
		this.kysymykset.add(kysymys);
	}
}

public Kysymys getKysymys(int index) {
	if (index >= 0 && index < this.kysymykset.size()){
		return this.kysymykset.get(index);
	}else {
		System.out.println("Indeksi ei kelpaa!");
	}
	
	return null;
}

public String getTila() {
	return tila;
}

public void setTila(String tila) {
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
	return "Kysely [id=" + id + ", teksti=" + teksti + ", tyyppi=" + tyyppi
			+ ", tila=" + tila + ", kysymykset=" + kysymykset + "]";
}
	

}
