package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/home")
	public String saluta() {
		return "home";
	}

	@GetMapping("/ora")
	public String ldt(Model m) {
		m.addAttribute("Ora", LocalDateTime.now());
		return "ora";
	}
}
