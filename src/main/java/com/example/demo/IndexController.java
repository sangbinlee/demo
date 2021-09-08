package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class IndexController {
	@GetMapping()
	public String hello(@RequestParam(name = "name", required = false, defaultValue = "cjenm dlc") String name,
			Model model) {
		model.addAttribute("name", name);
		return "index";
	}
}
