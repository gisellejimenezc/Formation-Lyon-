package com.monapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monapp.dao.LlamaDao;
import com.monapp.model.Llama;


@Controller
public class HomeController {
	
	@Autowired
	LlamaDao lDao;
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("message", "Hello everyone! Here you have the Llamas' list !");
		model.addAttribute("list", lDao.findAll());
				
		return "home";
		
		
    	
	}

}
