package com.hhkysely.objects;

public class Vaihtoehto {

	
	private String teksti;
	private int id;

	
	public Vaihtoehto() {
		super();
		
	}

public Vaihtoehto (String teksti){
	super();
	this.teksti = teksti;

}

public String getTeksti (){
	return teksti;
}
public void setTeksti(String teksti){
	this.teksti = teksti;
}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
@Override
public String toString() {
	return "Vaihtoehto [id=" + id + ", teksti=" + teksti+ "]";
}
}
