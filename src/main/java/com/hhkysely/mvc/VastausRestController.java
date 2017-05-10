package com.hhkysely.mvc;

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

import com.hhkysely.dao.VastausDAO;
import com.hhkysely.objects.Vastaaja;


@Controller
public class VastausRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	VastausDAO vdao;

	@RequestMapping(value="/kyselyt/{id}/vastaukset", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> talletaVastaukset( @PathVariable("id") int id, @RequestBody Vastaaja vastaaja) {
		vdao.talletaVastaukset(id, vastaaja);
		logger.info(vastaaja.toString());
		return new ResponseEntity<String>(HttpStatus.OK);
}

}