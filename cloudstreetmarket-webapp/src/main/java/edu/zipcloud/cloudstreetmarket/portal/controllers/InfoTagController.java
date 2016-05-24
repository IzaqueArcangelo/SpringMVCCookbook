package edu.zipcloud.cloudstreetmarket.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * pg 47 do livro.
 * 
 */
@Controller
@RequestMapping("/info")
public class InfoTagController {
	
	@RequestMapping("/helloHandler")
	@ResponseBody
	public String helloController(){
		return "Olá Mundo";
	}
}
