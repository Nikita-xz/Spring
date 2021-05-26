package com.xworkz.common_module.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.common_module.dto.RegistrationDTO;
import com.xworkz.common_module.service.RegistrationService;

@Controller
@RequestMapping("/")
public class RegistrationController {
private static Logger logger;
	
	@Autowired
	private RegistrationService registrationService;

	public RegistrationController() {
		logger = Logger.getLogger("RegistrationController");
		logger.info("invoked"+this.getClass().getSimpleName());
		
		
	}

	@RequestMapping("/registration.mod")
	@PostMapping
	public ModelAndView register(RegistrationDTO registrationDTO) {
		logger.info("invoking register()");
		ModelAndView modelAndView = new ModelAndView("index");
		try {
			String msg = registrationService.validateAndSave(registrationDTO);
			modelAndView.addObject("msg", msg + registrationDTO.getFullName());
			
		} catch (Exception e) {
			logger.error("You got an exception " + e.getMessage(), e);
		}

		return modelAndView;
	}
	
	
	
	

}
