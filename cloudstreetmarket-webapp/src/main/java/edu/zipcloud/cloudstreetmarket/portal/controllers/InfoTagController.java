package edu.zipcloud.cloudstreetmarket.portal.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.StringJoiner;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.portlet.ModelAndView;

/**
 * Controlador padrão da aplicação
 * 
 */
@Controller
@RequestMapping("/info")
public class InfoTagController {

	@Autowired
	private WebApplicationContext webAppContext;
	private final static LocalDateTime startDateTime = LocalDateTime.now();
	private final static DateTimeFormatter DT_FORMATTER = DateTimeFormatter
			.ofPattern("EEE, d MMM yyyy h:mm a");

	@RequestMapping("/helloHandler")
	@ResponseBody
	public String helloController() {
		return "Olá Mundo";
	}

	@RequestMapping("/server")
	@ResponseBody
	public String infoTagServer() {
		return new StringJoiner("<br>")
				.add("-------------------------------------")
				.add(" Servidor: "
						+ webAppContext.getServletContext().getServerInfo())
				.add(" Data: " + startDateTime.format(DT_FORMATTER))
				// webAppVersion é um bean criado no dispatcher-context.xml que
				// retorna uma String.
				.add(" Versão: " + webAppContext.getBean("webAppVersion"))
				.add("--------------------------------------").toString();
	}

//	@RequestMapping(value = "/index")
//	public ModelAndView getRequestExample(ServletRequest request) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("index");
//		mav.addObject("variable1", new ArrayList<String>());
//		return mav;
//	}
//
//	@RequestMapping(value = "/index")
//	public ModelAndView getRequestExample(@RequestParam("exP1") String exP1) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("index");
//		mav.addObject("exP1", exP1);
//		return mav;
//	}

	
}
