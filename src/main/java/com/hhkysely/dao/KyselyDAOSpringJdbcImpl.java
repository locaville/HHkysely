package fi.hh.gitgud.kysely.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import fi.hh.gitgud.kysely.bean.Kysymys;
import fi.hh.gitgud.kysely.dao.kyselyDAO;
import fi.hh.gitgud.kysely.bean.KysymysImpl;



@Repository
public class KyselyDAOSpringJdbcImpl implements kyselyDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
	/**
	 * Tallettaa parametrina annetun henkil??n tietokantaan.
	 * Tietokannan generoima id asetetaan parametrina annettuun olioon.
	 */
	public void talleta(Kysymys k) {
		final String sql = "insert into kysymys(teksti,kyselyid,tyyppiid) values(?,1,2)";
		
		//anonyymi sis??luokka tarvitsee vakioina v??litett??v??t arvot,
		//jotta roskien keruu onnistuu t??m??n metodin suorituksen p????ttyess??. 
		final String teksti = k.getTeksti();
		final int kyselyid = k.getKyselyid();
		final int tyyppiid = k.getTyyppiid();
		
		
		//jdbc pist???? generoidun id:n t??nne talteen
		KeyHolder idHolder = new GeneratedKeyHolder();
	    
		//suoritetaan p??ivitys itse m????ritellyll?? PreparedStatementCreatorilla ja KeyHolderilla
		jdbcTemplate.update(
	    	    new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
	    	            ps.setString(1, teksti);
	    	            ps.setInt(2, kyselyid);
	    	            ps.setInt(3, tyyppiid);
	    	            return ps;
	    	        }
	    	    }, idHolder);
	    
		//tallennetaan id takaisin beaniin, koska
		//kutsujalla pit??isi olla viittaus samaiseen olioon
	    k.setId(idHolder.getKey().intValue());

	}
}