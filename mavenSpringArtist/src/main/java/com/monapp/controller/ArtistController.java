package com.monapp.controller;

import java.util.List;

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
import com.monapp.model.Artist;
import com.monapp.model.CD;
import com.monapp.validator.ArtistValidator;

@Controller
@RequestMapping("/artists")
public class ArtistController {
	
	@Autowired
	ArtistDao aDao;
	
	@Autowired
	CDDao cDao;
	
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("art", new Artist());
		return "/artist/add";  	
	}
	
	@GetMapping ("/edit/{id}")
	public String edit(@PathVariable(value="id") int id, Model model) {
		Artist artist = aDao.findByKey(id);
		model.addAttribute("art",artist);
		return "/artist/add";
	}
	
	@PostMapping ("/processForm") 
	public String addArtist(@ModelAttribute("art") Artist artist,  BindingResult result, Model model) {
		new ArtistValidator().validate(artist, result);
		if (result.hasErrors()) {
			return "/artist/add";
		}
		if(artist.getId() == 0){
			aDao.insert(artist);
		}else {
			aDao.update(artist);
		}
		return "redirect:/artists";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteByPath(@PathVariable(value="id") int id, Model model) {
		Artist artist  = aDao.findByKey(id);
		aDao.delete(artist);
		return "redirect:/artists";  	
	}
	
	@GetMapping ("/{id}/cdsOf")
	public String cdsByA(@PathVariable(value="id") int id, Model model) {
		List<CD> cdsByA = cDao.findByArtistId(id);
		model.addAttribute("cdsByA",cdsByA);
		return "/artist/cdsOf";
	}
	
	@PostMapping ("/{id}/cdsOf") 
	public String cdsByArtist(@PathVariable(value="id") int id, Model model) {
		return "/artist/cdsOf";
	}
	
}
