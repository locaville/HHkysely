package com.hhkysely.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.hhkysely.objects.Kysymys;
import com.hhkysely.objects.Vaihtoehto;
import com.hhkysely.objects.Vastaus;

public class VastausDaoImpl implements VastausDAO {
	
	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void talletaVastaukset(int id, List<Vastaus> vastaukset) {
		for (int i = 0; i < vastaukset.size(); i++) {
		final String sql = "insert into vastaus(teksti,vaihtoehtoid,kysymysid,vastaajaid) values(?,?,?,?)";
		
			for(int x = 0;i<vastaukset.get(i).getVaihtoehdot().size();x++){
	
				final String teksti = vastaukset.get(i).getTeksti();
				final int kysymysid = vastaukset.get(i).getKysymysid();
				final int vastaajaid = vastaukset.get(i).getId();
				//final ArrayList<Vaihtoehto> vaihtoehdot = vastaukset.get(i).getVaihtoehdot();
				final int vaihtoehtoid = vastaukset.get(i).getVaihtoehdot().get(x).getId();
				final String vaihtoehtoteksti = vastaukset.get(i).getVaihtoehdot().get(x).getTeksti();
				
		
				jdbcTemplate.update(
			    	    new PreparedStatementCreator() {
			    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
			    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
			    	            ps.setString(1, teksti);
			    	            ps.setInt(2,vaihtoehtoid);
			    	            ps.setInt(3,kysymysid);
			    	            ps.setInt(4,vastaajaid);
			    	            
			    	            return ps;
			    	        }
			    });
			}
		}
	}	
}
