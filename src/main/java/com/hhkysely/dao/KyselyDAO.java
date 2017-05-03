package com.hhkysely.dao;

import com.hhkysely.objects.Kysely;
import com.hhkysely.objects.Kysymys;

public interface KyselyDAO {
	
	public abstract void talleta(Kysymys kysymys);
	
	// KESKEN ER�INEN TALLENNA METODILLE KYSELYLLE public abstract void talleta(Kysely kysely);

	// REST-metodille
	public abstract Kysely haeKysely(int id) throws Exception;
		
	//public abstract List<Kysely> haeKaikki();

}
