package com.hhkysely.mvc;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hhkysely.dao.KyselyDAO;
import com.hhkysely.objects.Kysely;
import com.hhkysely.objects.Vastaus;

@Controller
public class KyselyRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(KyselyRestController.class);

	@Inject
	KyselyDAO dao;

	@RequestMapping(value="kyselyt/{id}/kysymykset", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public  Kysely haeKyselyJSON(@PathVariable("id") int id) throws Exception {
		Kysely kysely = dao.haeKysely(id);
		//tulee ilmoitus konsoliin että metodi on kutsuttu
		logger.info("haeKysely");
		return  kysely;
	}
	
	@RequestMapping(value="kyselyt/{id}/kysymykset/{id}/vastaukset/", method = RequestMethod.POST, consumes = "application/json")
		public ResponseEntity<String> talletaVastaukset(@RequestBody List<Vastaus>vastaukset, @PathVariable("id") int id) {
		//	dao.talletaVastaukset();
			return new ResponseEntity<String>(HttpStatus.OK);
	}
}