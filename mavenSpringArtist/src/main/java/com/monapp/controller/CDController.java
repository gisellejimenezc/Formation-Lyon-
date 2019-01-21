	package com.monapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monapp.dao.ArtistDao;
import com.monapp.dao.CDDao;
import com.monapp.model.CD;
import com.monapp.model.Estyle;
import com.monapp.validator.CDValidator;

@Controller
@RequestMapping("/cds")
public class CDController {
	
	@Autowired
	CDDao cDao;
	
	@Autowired
	ArtistDao aDao;
	
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("cd", new CD());
		model.addAttribute("styles", Estyle.values());
		model.addAttribute("artists", aDao.findAll());
		return "/cd/add";  	
	}
		
	@GetMapping ("/edit/{id}")
	public String edit(@PathVariable(value="id") int id, Model model) {
		CD cd = cDao.findByKey(id);
		model.addAttribute("cd",cd);
		model.addAttribute("styles", Estyle.values());
		model.addAttribute("artists", aDao.findAll());
		return "/cd/add";
	}
	
	@PostMapping ("/processFormCD") 
	public String addCD(@ModelAttribute("cd") CD cd,  BindingResult result, Model model) {
		new CDValidator().validate(cd, result);
		if (result.hasErrors()) {
			model.addAttribute("styles", Estyle.values());
			model.addAttribute("artists", aDao.findAll());
			return "/cd/add";
		}
		if(cd.getId() == 0){
			cDao.insert(cd);
		}else {
			cDao.update(cd);
		}
		return "redirect:/cds";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteByPath(@PathVariable(value="id") int id, Model model) {
		CD cd  = cDao.findByKey(id);
		cDao.delete(cd);
		return "redirect:/cds";  	
	}

}
