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
import com.hhkysely.objects.Kysymys;
import com.hhkysely.objects.KysymysImpl;


@Controller
public class KyselyRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(KyselyRestController.class);

	@Inject
	KyselyDAO dao;

	@RequestMapping(value="/kyselyt/{id}/kysymykset", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public  Kysely haeKyselyJSON(@PathVariable("id") int id) throws Exception {
		
		 	Kysely kysely = dao.haeKysely(id);
		//tulee ilmoitus konsoliin ett√§ metodi on kutsuttu
		logger.info("haeKysely");
//		Kysymys kysymys = new KysymysImpl(55, "nimi", 23466, null);
//		Kysely k = new Kysely(234, "jeje", "normikysely", "suljettu", null);
		//k.addKysymys(kysymys);
		//System.out.println("t‰m‰ tulee controllerista"+kysely.toString());
		// JSON Testi l√§hetykset
//		Kysely kyselyTest = new Kysely();		
//		kyselyTest.setId(id);
//		kyselyTest.setTeksti("Testikysely");
//		kyselyTest.setTila("avoin");
//		kyselyTest.setTyyppi("tyypit√∂n");
		
		return  kysely;
	}
	
	
}