package com.hhkysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.hhkysely.objects.Kysely;
import com.hhkysely.objects.Kysymys;
import com.hhkysely.objects.KysymysImpl;

public class YksiKyselyExtractor implements ResultSetExtractor<Kysely> {

	@Override
	public Kysely extractData(ResultSet rs) throws SQLException,
			DataAccessException {
        Map<Integer, Kysely> map = new HashMap<Integer, Kysely>();
        Kysely kysely = null;
        while (rs.next()) {
        	Integer id = rs.getInt("kyselyid");
        	kysely = map.get(id);
        	if(kysely == null){
        		String teksti = rs.getString("nimi");
        		String tyyppi = rs.getString("tyyppi");
        		String tila = rs.getString("tila");
        		kysely = new Kysely(id, teksti, tyyppi, tila, null);
        		map.put(id, kysely);
        	}
        	Kysymys kysymys = new KysymysImpl();
        	kysymys.setId(rs.getInt("kysymysid"));
        	kysymys.setTeksti(rs.getString("teksti"));
        	kysymys.setTyyppiid(rs.getInt("tyyppiid"));
        	kysely.addKysymys(kysymys);
        }
        return kysely;
	}

}