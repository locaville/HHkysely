package com.hhkysely.objects;

public interface Kysymys {

	public abstract int getId();

	public abstract void setId(int id);

	public abstract String getTeksti();

	public abstract void setTeksti(String teksti);
	
	public abstract int getTyyppiid();
	
	public abstract void setTyyppiid(int tyyppiid);
	

	public abstract void addVaihtoehto(Vaihtoehto vaihtoehto);
	
	public abstract Vaihtoehto getVaihtoehto(int index);

	
}