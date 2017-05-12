package com.hhkysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.hhkysely.objects.Vaihtoehto;
import com.hhkysely.objects.Vastaus;

public class KaikkiVastauksetExtractor implements ResultSetExtractor {

	@Override
	public ArrayList<Vastaus> extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		Map<Integer, Vastaus> map = new HashMap<Integer, Vastaus>();
		Map<Integer, Vaihtoehto> vaihtmap = new HashMap<Integer, Vaihtoehto>();
		Vastaus vastaus = null;
		Vaihtoehto vaihtoehto = null;
		while (rs.next()) {
			int vastausid = rs.getInt("vastausid");
			vastaus = map.get(vastausid);
			if (vastaus == null) {
				String teksti = rs.getString("vastaus.teksti");
				int kysymysid = rs.getInt("vastaus.kysymysid");
				int vastaajaid = rs.getInt("vastaajaid");
				vastaus = new Vastaus(vastausid, kysymysid, teksti, vastaajaid, null);
				map.put(vastausid, vastaus);
			}
			int vaihtoehtoid = rs.getInt("vaihtoehtoid");
			vaihtoehto = vaihtmap.get(vaihtoehtoid);
			if (vaihtoehto == null) {
				String vaihtoteksti = rs.getString("vaihtoehto.teksti");
				vaihtoehto = new Vaihtoehto(vaihtoteksti, vaihtoehtoid);
				vastaus.addVaihtoehto(vaihtoehto);
			}
		}
		return new ArrayList<Vastaus>(map.values());
	}
	
	

}

/*
 * 
 * public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
            Map<Integer, MyObject> map = new HashMap<Integer, MyObject>();
            MyObject myObject = null;
            while (rs.next()) {
            	Integer id = rs.getInt("ID);
            	myObject = map.get(id);
              if(myObject == null){
                  String description = rs,getString("Description");
                  myObject = new MyObject(id, description);
                  map.put(id, myObject);
              }
	      MyFoo foo = new MyFoo(rs.getString("Foo"), rs.getString("Bar"));
	      myObject.add(myFoo);
            }
            return new ArrayList<MyObject>(map.values());;
        }
 * 
 */
