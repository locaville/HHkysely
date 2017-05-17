package com.hhkysely.dao;

import com.hhkysely.objects.Kysely;
import com.hhkysely.objects.Kysymys;

public interface KyselyDAO {
	
	public abstract void talleta(Kysymys kysymys, int id);
	
	public abstract void talletaKysely(Kysely kysely);

	//public abstract int etsiKyselyID(String nimi);
	// REST-metodille
	public abstract Kysely haeKysely(int id) throws Exception;
		
	//public abstract List<Kysely> haeKaikki();

}
