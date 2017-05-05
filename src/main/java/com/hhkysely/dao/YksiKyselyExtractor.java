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
import com.hhkysely.objects.Vaihtoehto;

public class YksiKyselyExtractor implements ResultSetExtractor<Kysely> {

	@Override
	public Kysely extractData(ResultSet rs) throws SQLException,
			DataAccessException {
        Map<Integer, Kysely> map = new HashMap<Integer, Kysely>();
        Map<Integer, Kysymys> kysmap = new HashMap<Integer, Kysymys>();
        Map<Integer, Vaihtoehto> vaihtmap = new HashMap<Integer, Vaihtoehto>();
        Kysely kysely = null;
        Kysymys kysymys = null;
        Vaihtoehto vaihtoehto = null;
        while (rs.next()) {
        	Integer id = rs.getInt("kyselyid");
        	kysely = map.get(id);
        	if(kysely == null){
        		String nimi = rs.getString("nimi");
        		String tyyppi = rs.getString("tyyppi");
        		String tila = rs.getString("tila");
        		kysely = new Kysely(id, nimi, tyyppi, tila, null);
        		map.put(id, kysely);
        	}
        	while (rs.next()) {
        		int kysymysid = rs.getInt("kysymysid");
        		kysymys = kysmap.get(kysymysid);
        		if (kysymys == null) {
        			String teksti = rs.getString("kysymys.teksti");
        			int tyyppiid = rs.getInt("kysymys.tyyppiid");
        			kysymys = new KysymysImpl(kysymysid, teksti, tyyppiid, null);
        			kysmap.put(kysymysid, kysymys);
        		}
        		while (rs.next()) {
        			int vaihtoid = rs.getInt("vaihtoehtoid");
        			vaihtoehto = vaihtmap.get(vaihtoid);
        			if (vaihtoehto == null) {
        				String vaihtoteksti = rs.getString("vaihtoehto.teksti");
        				vaihtoehto = new Vaihtoehto(vaihtoteksti, vaihtoid);
        				vaihtmap.put(vaihtoid, vaihtoehto);
        			}
        			
        		}
        		
        	}
    		for (int i = 0; i < vaihtmap.size(); i++) {
    			kysymys.addVaihtoehto(vaihtmap.get(i));
    		}
    		
    		for (int i = 0; i < kysmap.size(); i++) {
    			kysely.addKysymys(kysmap.get(i));
    		}
        	
//        	Kysymys kysymys = new KysymysImpl();
//        	kysymys.setId(rs.getInt("kysymysid"));
//        	kysymys.setTeksti(rs.getString("teksti"));
//        	kysymys.setTyyppiid(rs.getInt("tyyppiid"));
//        	kysely.addKysymys(kysymys);
        }
        
        return kysely;
	}

}
