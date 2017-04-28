package com.hhkysely.dao;

import com.hhkysely.objects.Kysely;
import com.hhkysely.objects.Kysymys;

public interface KyselyDAO {
	
	public abstract void talleta(Kysymys kysymys);
	
	// KESKEN ERÄINEN TALLENNA METODILLE KYSELYLLE public abstract void talleta(Kysely kysely);

	// REST-metodille
	public abstract Kysely haeKysely(int id) throws Exception;
	
	// public abstract void haeKyselyRest(Kysely kysely);
	
	
	//public abstract Vastaus etsi(int id);
	
	//public abstract List<Kysely> haeKaikki();

}
