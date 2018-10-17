package lt.bit.systems.Atm;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthMvcController {

	@GetMapping("/")
	public String showsIndex() {
		return "index";
	}
	
	@PostMapping("/enter")
	public String showPin(HttpServletRequest request) {
		System.out.println("Entered pin: " + request.getParameter("pin"));
		return "enter";		
	}
	
}	
