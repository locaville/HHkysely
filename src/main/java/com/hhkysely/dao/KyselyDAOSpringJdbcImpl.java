package com.hhkysely.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.hhkysely.objects.Kysymys;
import com.hhkysely.objects.Tyyppi;



@Repository
public class KyselyDAOSpringJdbcImpl implements KyselyDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
	/**
	 * Tallettaa parametrina annetun henkilön tietokantaan.
	 * Tietokannan generoima id asetetaan parametrina annettuun olioon.
	 */
	public void talleta(Kysymys k) {
		final String sql = "insert into kysymys(teksti,kyselyid,tyyppiid) values(?,1,?)";
		
		//anonyymi sisäluokka tarvitsee vakioina välitettävät arvot,
		//jotta roskien keruu onnistuu tämän metodin suorituksen päättyessää. 
		final String teksti = k.getTeksti();
		final int kyselyid = k.getKyselyid();
		final int tyyppiid = k.getTyyppiid();
		//final Tyyppi tyyppi = k.getTyyppi();
		
		
		//jdbc pistää generoidun id:n tänne talteen
		KeyHolder idHolder = new GeneratedKeyHolder();
	    
		//suoritetaan päivitys itse määritellyllä PreparedStatementCreatorilla ja KeyHolderilla
		jdbcTemplate.update(
	    	    new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
	    	            ps.setString(1, teksti);
	    	            //ps.setInt(2, kyselyid);
	    	            ps.setInt(2, tyyppiid);
	    	            //ps.setInt(3, tyyppi.getId());
	    	            return ps;
	    	        }
	    	    }, idHolder);
	    
		//tallennetaan id takaisin beaniin, koska
		//kutsujalla pitäisi olla viittaus samaiseen olioon
	    k.setId(idHolder.getKey().intValue());

	}

 /*KESKEN ER�INEN TALLENNA METODI KYSELYILLE
  * public void talletaKysely(Kysely k) {
	final String sql = "insert into kysely(nimi,tyyppi,tila,alkamispvm,luontipvm) values(?,?,?,?,?)";
	
	//anonyymi sisäluokka tarvitsee vakioina välitettävät arvot,
	//jotta roskien keruu onnistuu tämän metodin suorituksen päättyessää. 
	final String nimi = k.getNimi();
	final String tyyppi = k.getTyyppi();
	final String tila = k.getTila();
	final String alkamispvm = k.getAlkamispvm();
	final String luontipvm = k.getLuontipvm();
	
	//final Tyyppi tyyppi = k.getTyyppi();
	
	
	//jdbc pistää generoidun id:n tänne talteen
	KeyHolder idHolder = new GeneratedKeyHolder();
    
	//suoritetaan päivitys itse määritellyllä PreparedStatementCreatorilla ja KeyHolderilla
	jdbcTemplate.update(
    	    new PreparedStatementCreator() {
    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
    	            ps.setString(1, nimi);
    	            ps.setString(2, tyyppi);
    	            ps.setString(3, tila);
    	            ps.setString(4, alkamispvm);
    	            ps.setString(5, luontipvm);
    	            return ps;
    	        }
    	    }, idHolder);
    
	//tallennetaan id takaisin beaniin, koska
	//kutsujalla pitäisi olla viittaus samaiseen olioon
    k.setId(idHolder.getKey().intValue());

}*/
}