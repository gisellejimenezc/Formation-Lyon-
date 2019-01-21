package com.monapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	/*@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("message", "Hello everyone!");
		return "home";  // Ca donne Hello Everyone dans le web vue
	}*/
	
	@RequestMapping("/home")
	public String home(@RequestParam(value="username", required=false, defaultValue="Jeremy") String username,
						@RequestParam(value="age", required=true, defaultValue="45") String age, Model model) {
	model.addAttribute("utilisateur", username);
	model.addAttribute("age", age);
	return "home";
	}
	
	@GetMapping("/redirect")
	public String home(HttpSession session, @RequestParam(value="name", required=false, defaultValue="Toto") String name, Model model) {
		session.setAttribute("name", name);
		return "redirect:/hello"; 
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		
		return "hello";  
	}

	@GetMapping("/{usernameh}")
	public String username (@PathVariable(value="usernameh") String username, /*La valeur je la recupere directement dans l'url. Ex: Toto */
							@RequestParam(value="id", required=false) String id, /*La valeur je la recupere dans l'urlavec ?id=*/
							Model model) {
		model.addAttribute("usernameh", username);
		model.addAttribute("idh", id);
		return "hello";  
	}
	
}
