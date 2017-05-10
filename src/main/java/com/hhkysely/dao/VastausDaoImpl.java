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
import org.springframework.stereotype.Repository;

import com.hhkysely.mvc.HomeController;
import com.hhkysely.objects.Kysymys;
import com.hhkysely.objects.Vaihtoehto;
import com.hhkysely.objects.Vastaaja;
import com.hhkysely.objects.Vastaus;


	@Repository
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
		public void talletaVastaukset(int id, Vastaaja v) {
			final String sqlvastaaja = "insert into vastaaja(vastaajaid,kyselyid) values('',?)";
			
			final int kyselyid = 1;
				KeyHolder idHolder = new GeneratedKeyHolder();

				jdbcTemplate.update(
			    	    new PreparedStatementCreator() {
			    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
			    	            PreparedStatement ps = connection.prepareStatement(sqlvastaaja, new String[] {"id"});
			    	            ps.setInt(1, kyselyid);
			    	           
			    	            return ps;
			    	        }
			    	    }, idHolder);
			    v.setId(idHolder.getKey().intValue());
		
			ArrayList<Vastaus> vastaukset = v.getVastaukset();
			
			for (int i = 0; i < vastaukset.size(); i++) {
			final String sql = "insert into vastaus(teksti,vaihtoehtoid,kysymysid,vastaajaid) values(?,?,?,?)";
			
			
			ArrayList<Vaihtoehto> vaihtoehdot = vastaukset.get(i).getVaihtoehdot();
			if(vaihtoehdot!=null){
				for(int x = 0;x<vastaukset.get(i).getVaihtoehdot().size();x++){
					final int kysymysid = v.getVastaukset().get(i).getKysymysid();
					//final int vastaajaid = v.getVastaukset().get(i).getId();
					final int vastaajaid = v.getId();
					//final ArrayList<Vaihtoehto> vaihtoehdot = vastaukset.get(i).getVaihtoehdot();
					final int vaihtoehtoid = v.getVastaukset().get(i).getVaihtoehdot().get(x).getId();
					final String vaihtoehtoteksti = v.getVastaukset().get(i).getVaihtoehdot().get(x).getTeksti();
			
					jdbcTemplate.update(
				    	    new PreparedStatementCreator() {
				    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
				    	            ps.setString(1, vaihtoehtoteksti);
				    	            ps.setInt(2,vaihtoehtoid);
				    	            ps.setInt(3,kysymysid);
				    	            ps.setInt(4,vastaajaid);
				    	            
				    	            return ps;
				    	        }
				    });
				}
			}else{
				final String teksti = v.getVastaukset().get(i).getTeksti();
				final int kysymysid = v.getVastaukset().get(i).getKysymysid();
				//final int vastaajaid = v.getVastaukset().get(i).getId();
				final int vastaajaid = v.getId();
				//final ArrayList<Vaihtoehto> vaihtoehdot = vastaukset.get(i).getVaihtoehdot();
				final int vaihtoehtoid = 666;
		
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
