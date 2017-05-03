package com.hhkysely.dao;

import java.util.List;

import com.hhkysely.objects.Kysely;
import com.hhkysely.objects.Kysymys;
import com.hhkysely.objects.Vastaus;

public interface KyselyDAO {
	
	public abstract void talleta(Kysymys kysymys);
	
	// KESKEN ER�INEN TALLENNA METODILLE KYSELYLLE public abstract void talleta(Kysely kysely);

	// REST-metodille
	public abstract Kysely haeKysely(int id) throws Exception;
	
	public abstract List<Vastaus> talletaVastauksetRest();
	
	//public abstract Vastaus etsi(int id);
	
	//public abstract List<Kysely> haeKaikki();

}
