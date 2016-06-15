package janlr.plat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class HomeController {

	/***
	 * yourProjectName/admin/home
	 * @return
	 */
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
}





