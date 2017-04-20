package fi.hh.gitgud.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.hh.gitgud.kysely.bean.Kysymys;
import fi.hh.gitgud.kysely.bean.KysymysImpl;


public class KyselyRowMapper implements RowMapper<Kysymys> {

	public Kysymys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Kysymys k = new KysymysImpl();
		k.setTeksti(rs.getString("teksti"));
		k.setKyselyid(rs.getInt("kyselyid"));
		k.setTyyppiid(rs.getInt("tyyppiid"));
		k.setId(rs.getInt("id"));
		
		return k;
	}

}