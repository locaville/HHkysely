package com.hhkysely.objects;

public interface Kysymys {

	public abstract int getId();

	public abstract void setId(int id);

	public abstract String getTeksti();

	public abstract void setTeksti(String teksti);
	
	public abstract int getKyselyid();

	public abstract void setKyselyid(int kyselyid);
	
	public abstract Tyyppi getTyyppi();

	public abstract void setTyyppi(Tyyppi tyyppi);
}