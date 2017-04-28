package com.hhkysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hhkysely.objects.Kysely;
import com.hhkysely.objects.Kysymys;
import com.hhkysely.objects.KysymysImpl;
import com.hhkysely.objects.Tyyppi;




public class KyselyRowMapper implements RowMapper<Kysymys> {
	
	public Kysely kyselyMapRow(ResultSet rs, int rowNum) throws SQLException {
		Kysely k = new Kysely();
		
		k.setId(rs.getInt("kyselyid"));
		k.setTeksti(rs.getString("nimi"));
		k.setTyyppi(rs.getString("tyyppi"));
		k.setTila(rs.getString("tila"));
		
		return k;
	}

	public Kysymys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Kysymys k = new KysymysImpl();
		Tyyppi tyyppi = new Tyyppi();
		k.setTeksti(rs.getString("teksti"));
		k.setKyselyid(rs.getInt("kyselyid"));
		tyyppi.setId(rs.getInt("tyyppiid"));
		tyyppi.setNimi(rs.getString("nimi")); //Tämä ei ehkä välttämätön?
		k.setTyyppi(tyyppi);
		k.setId(rs.getInt("id"));
		
		return k;
	}

}