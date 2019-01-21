package com.monapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monapp.dao.ArtistDao;
import com.monapp.dao.CDDao;

@Controller
public class WelcomeController {
		
	@Autowired
	ArtistDao aDao;
	
	@Autowired
	CDDao cDao;
	
	@RequestMapping("/welcome")
	public String home(Model model) {
			return "welcome";
 	}
	
	@GetMapping("/artists")
	public String artists(Model model) {
		model.addAttribute("list", aDao.findAll());
		return "artist/artists";  	
	}
	
	@GetMapping("/cds")
	public String cds(Model model) {
		model.addAttribute("cds", cDao.findAll());
		return "cd/cds";  	
	}

}
