package com.souro.spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * To create the controller class, we are using two annotations @Controller and @RequestMapping
 * */

@Controller
@RequestMapping("/demo")
public class DemoController {
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("DemoPage");
		modelandview.addObject("message", "Spring MVC Demo by Souro");
		return modelandview;
	}
}
