package jana60.controller;

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

}
