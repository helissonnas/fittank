package br.com.fittank.fittank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping(value = "/hello")
	public String hello() {
		return "Hello";
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		return "Testar";
	}

}
