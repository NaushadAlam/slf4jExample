package com.naushad.slf4jexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	static  Logger logger = LoggerFactory.getLogger(HelloController.class);
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		logger.debug("This is Hello Word Logging for Debug");
		logger.info("This is Info Log");
		logger.error("This is Error log");
		logger.trace("This is Trace log");
		logger.warn("This is Warn log");
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}