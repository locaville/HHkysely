
package com.hhkysely.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hhkysely.dao.KyselyDAO;
import com.hhkysely.objects.KyselyImpl;
import com.hhkysely.objects.KysymysImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private KyselyDAO dao;
	
	public KyselyDAO getDAO() {
		return dao;
	}
	
	public void setDAO(KyselyDAO dao) {
		this.dao = dao;
	}
	
	/**
	 * Tämä metodi käynnistyy kun käynnistetään sovelluksen.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		return "home";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		logger.info("Luo Kysely");
		
				
		return "create";
	}
	
	@RequestMapping(value = "/restapi", method = RequestMethod.GET)
	public String restapi(Locale locale, Model model) {
		logger.info("REST API");
		
				
		return "restapi";
	}
	
	
/*	@RequestMapping(value = "/kysymys", method = RequestMethod.GET)
	
	public ModelAndView kysymys() {
		
		//ModelAndView palauttaa näkymän lisäksi model
		return new ModelAndView("kysymys", "kysymys", new KysymysImpl());
		
	}
	
	@RequestMapping(value = "/valmisKysymys", method = RequestMethod.POST)
	public ModelAndView valmisKysymys(@ModelAttribute("kysymys") KysymysImpl kysymys) {
		
		logger.info("Valmis Kysymys");
		
		logger.info("Tyyppiid= " + kysymys.getTyyppiid());
		
		dao.talleta(kysymys);
		//ModelAndView palauttaa näkymän lisäksi model
		
		ModelAndView modelAndView = new ModelAndView();
		
		// .setViewName tallenna näkymän niemen 
		modelAndView.setViewName("valmisKysymys");
		
		String tyyppi = "Tyhja";
		
		if(kysymys.getTyyppiid()==1){
			tyyppi="Checkbox";
		}else if(kysymys.getTyyppiid()==2){
			tyyppi="Radiobutton";
		}else if(kysymys.getTyyppiid()==3){
			tyyppi="Teksti";
		}
		
		// .addObject tallenna model objektin 
		modelAndView.addObject("kysymys", kysymys);
		modelAndView.addObject("tyyppi", tyyppi);
		
		return modelAndView;
	}
*/
	
	@RequestMapping(value = "/kyselynKysymykset", method = RequestMethod.GET)
	
	public ModelAndView kysymys() {
		
		//ModelAndView palauttaa näkymän lisäksi model
		return new ModelAndView("kyselynKysymykset", "kysymys", new KysymysImpl());
		
	}
	
	@RequestMapping(value = "/kyselynKysymykset", method = RequestMethod.POST)
	public ModelAndView kyselynKysymykset(@ModelAttribute("kysymys") KysymysImpl kysymys) {
		
		dao.talleta(kysymys);
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("kyselynKysymykset");
		
		String tyyppi = "Tyhja";
		
		if(kysymys.getTyyppiid()==1){
			tyyppi="Checkbox";
		}else if(kysymys.getTyyppiid()==2){
			tyyppi="Radiobutton";
		}else if(kysymys.getTyyppiid()==3){
			tyyppi="Teksti";
		}
		
		// .addObject tallenna model objektin 
		modelAndView.addObject("kysymys", kysymys);
		modelAndView.addObject("tyyppi", tyyppi);
		
		return modelAndView;
	}

@RequestMapping(value = "/valmisKysely", method = RequestMethod.POST)
	public ModelAndView listAll(@ModelAttribute("kysely")KyselyImpl kysely) {
		
		logger.info("Valmis Kysely");
		
		dao.talletaKysely(kysely);
		
		ModelAndView modelAndView = new ModelAndView();
		
		// .setViewName tallenna näkymän niemen 
		modelAndView.setViewName("valmisKysely");
		return modelAndView;
	}
	
}
