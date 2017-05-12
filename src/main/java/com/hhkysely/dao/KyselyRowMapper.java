package com.hhkysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hhkysely.objects.Kysely;
import com.hhkysely.objects.KyselyImpl;
import com.hhkysely.objects.Kysymys;
import com.hhkysely.objects.KysymysImpl;
import com.hhkysely.objects.Tyyppi;




public class KyselyRowMapper implements RowMapper<Kysymys> {
	
	public Kysely kyselyMapRow(ResultSet rs, int rowNum) throws SQLException {
		Kysely k = new KyselyImpl();
		
		k.setId(rs.getInt("kyselyid"));
		k.setNimi(rs.getString("nimi"));
		k.setTyyppi(rs.getString("tyyppi"));
		k.setTila(rs.getString("tila"));
		
		return k;
	}

	public Kysymys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Kysymys k = new KysymysImpl();
		k.setTeksti(rs.getString("teksti"));
		k.setTyyppiid(rs.getInt("tyyppiid"));
		k.setId(rs.getInt("id"));
		
		return k;
	}

}