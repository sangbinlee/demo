package com.example.demo.dlc.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class DlcRestController {

	@GetMapping("api")
//	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


}
