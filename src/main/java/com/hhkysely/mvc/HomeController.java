
package com.hhkysely.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hhkysely.objects.KysymysImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
//	@Inject
//	private KyselyDAO dao;
//	
//	public KyselyDAO getDAO() {
//		return dao;
//	}
//	
//	public void setDAO(KyselyDAO dao) {
//		this.dao = dao;
//	}
	
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
	
	
	@RequestMapping(value = "/kysymys", method = RequestMethod.GET)
	
	public ModelAndView kysymys() {
		
		//ModelAndView palauttaa näkymän lisäksi model
		return new ModelAndView("kysymys", "kysymys", new KysymysImpl());
		
	}
	
	@RequestMapping(value = "/valmisKysymys", method = RequestMethod.POST)
	public ModelAndView valmisKysymys(@ModelAttribute("kysymys") KysymysImpl kysymys) {
		
		logger.info("Valmis Kysymys");
		
		//ModelAndView palauttaa näkymän lisäksi model
		
		ModelAndView modelAndView = new ModelAndView();
		
		// .setViewName tallenna näkymän niemen 
		modelAndView.setViewName("valmisKysymys");
		
		// .addObject tallenna model objektin 
		modelAndView.addObject("kysymys", kysymys);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/valmisKysely", method = RequestMethod.POST)
	public ModelAndView listAll(@ModelAttribute("kysely")KysymysImpl kysymys) {
		
		logger.info("Valmis Kysely");
		
		//ModelAndView palauttaa näkymän lisäksi model
		
		ModelAndView modelAndView = new ModelAndView();
		
		// .setViewName tallenna näkymän niemen 
		modelAndView.setViewName("valmisKysely");
		
		
		return modelAndView;
	}
	
}
