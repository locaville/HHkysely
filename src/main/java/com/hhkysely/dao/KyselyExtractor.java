package com.hhkysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.hhkysely.objects.Kysely;

public class KyselyExtractor implements ResultSetExtractor {

	@Override
	public Object extractData(ResultSet rs) throws SQLException,
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
        		kysely = new Kysely(id, teksti, tyyppi, tila);
        		map.put(id, kysely);
        	}
        	MyFoo foo = new MyFoo(rs.getString("Foo"), rs.getString("Bar"));
        	myObject.add(myFoo);
        }
        return new ArrayList<MyObject>(map.values());
	}

}
