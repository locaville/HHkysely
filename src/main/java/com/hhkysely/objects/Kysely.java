package com.hhkysely.objects;

public interface Kysely {

	public abstract int getId();

	public abstract void setId(int id);

	public abstract String getNimi();

	public abstract void setNimi(String nimi);
	
	public abstract String getTyyppi();
	
	public abstract void setTyyppi(String tyyppi);
	
	public abstract String getTila();
	
	public abstract void setTila(String tila);
	
	public abstract void addKysymys(Kysymys kysymys);
	
	public abstract Kysymys getKysymys(int index);
}