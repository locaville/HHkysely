package com.hhkysely.mvc;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hhkysely.dao.KyselyDAO;
import com.hhkysely.objects.Kysely;

@Controller
public class KyselyRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(KyselyRestController.class);

	@Inject
	KyselyDAO dao;

	@RequestMapping(value="/kyselyt/{id}/kysymykset", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public  Kysely haeKyselyJSON(@PathVariable("id") int id) throws Exception {
		
		Kysely kysely = dao.haeKysely(id);
		//tulee ilmoitus konsoliin että metodi on kutsuttu
		logger.info("haeKysely");
		
		// JSON Testi lähetykset
		Kysely kyselyTest = new Kysely();
		kyselyTest.setId(id);
//		kyselyTest.setTeksti("teksti");
//		kyselyTest.setTila("avoin");
//		kyselyTest.setTyyppi("tyypitön");
		return  kyselyTest;
	}
	
	
}