package fi.hh.gitgud.kysely.dao;

import java.util.List;
import fi.hh.gitgud.kysely.bean.Kysymys;

public interface kyselyDAO {
	
	public abstract void talleta(Kysymys kysymys);
	
	//public abstract Vastaus etsi(int id);
	
	//public abstract List<Kysely> haeKaikki();

}
