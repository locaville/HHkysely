package com.hhkysely.mvc;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hhkysely.objects.Vastaus;

public class VastausRestController {
	
	@RequestMapping(value="/kyselyt/{id}/vastaukset/", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> talletaVastaukset( @PathVariable("id") int id, @RequestBody List<Vastaus>vastaukset) {
	//	dao.talletaVastaukset(id, );
		return new ResponseEntity<String>(HttpStatus.OK);
}

}
