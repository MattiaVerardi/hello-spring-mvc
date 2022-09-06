package jana60.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SpringController {

	@GetMapping("/home")
	private String home(Model m) {
		String nameInput = "Mattia";
		m.addAttribute("name", nameInput);
		return "home";
	}

	@GetMapping("/ora")
	private String ora(Model m) {
		LocalDateTime oraCorrente = LocalDateTime.now();
		oraCorrente.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
		m.addAttribute("ora", oraCorrente);
		return "ora";
	}

}
